package SeleniumSamples;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchMultipleTabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_AD~1\\AppData\\Local\\Temp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		//To Click on multiple keys together
		driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		Thread.sleep(2000);
		//To find out the number of tabs 
		//getwindowhandles --> will fetch all the parent window/parent tab and child tabs
		//getwindowhadle --> will fetch parent window/tab
		
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println("No of tabs : " + tabs.size());
		//Switch to 2nd tab and get title
		driver.switchTo().window(tabs.get(1));
		String Title = driver.getTitle();
		System.out.println(Title);
		
		//Switch to 1st tab and get title
				driver.switchTo().window(tabs.get(0));
				String Title1 = driver.getTitle();
				System.out.println(Title1);
						
	}

}

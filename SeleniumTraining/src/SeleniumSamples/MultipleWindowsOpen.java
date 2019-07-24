package SeleniumSamples;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class MultipleWindowsOpen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_AD~1\\AppData\\Local\\Temp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.toolsqa.com/automation-practice-switch-windows/");
		String parentwindow = driver.getWindowHandle();
		Thread.sleep(2000);
		System.out.println("Parent Window --> " + parentwindow);
	
		//driver.findElement(By.id("button1")).click();
		WebElement clickbutton = driver.findElement(By.id("button1"));
		//It will open the child windows 3 times
		for(int i=0; i<3;i++)
		{
		clickbutton.click();
		Thread.sleep(2000);
		}
	}
}

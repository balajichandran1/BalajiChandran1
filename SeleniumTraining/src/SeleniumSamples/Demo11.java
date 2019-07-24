package SeleniumSamples;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo11 {

	public static void main(String[] args) throws InterruptedException {
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
		//To get the id's of all the windows
		ArrayList<String> childwindow = new ArrayList<>(driver.getWindowHandles());
		System.out.println("Child Window --> " + childwindow);
		//driver.quit();
		//System.out.println("All Windows Closed Successfully");
		String lastwindow = "";
		// Switch between Child windows
		
		for (int i=1; i<childwindow.size();i++)
		{
			driver.switchTo().window(childwindow.get(1));
			driver.navigate().to("https://www.google.com/");
			lastwindow = childwindow.get(i).toString();
		}
		System.out.println("LastWindow is :" + lastwindow);
		System.out.println("Child Window --> " + childwindow.get(1));
		driver.close();
		//driver.switchTo().window(parentwindow);	
		//driver.navigate().to("http://realestate.upskills.in/wp-admin/");
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		//String titleparent = driver.getTitle();
		//System.out.println(titleparent);
		//Thread.sleep(2000);
		//driver.close();
		//driver.switchTo().window(lastwindow);
		//String lastwindow1 = driver.getTitle();
		//System.out.println(lastwindow1);
	}
}

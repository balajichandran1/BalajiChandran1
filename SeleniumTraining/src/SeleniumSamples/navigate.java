package SeleniumSamples;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class navigate {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_AD~1\\AppData\\Local\\Temp\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver =new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.navigate().to("http://newtours.demoaut.com/");
		//driver.findElement(By.linkText("Cruises")).click();
		FirefoxDriver driver = new FirefoxDriver();
		
		
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
		
		

	}

}

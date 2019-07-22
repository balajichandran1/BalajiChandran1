package SeleniumSamples;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class Actionsample2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_AD~1\\AppData\\Local\\Temp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        
		driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("admin123");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.RETURN).perform();
		act.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.RETURN).perform();	
	}

}

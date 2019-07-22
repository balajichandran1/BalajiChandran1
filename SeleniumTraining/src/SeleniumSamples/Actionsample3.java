package SeleniumSamples;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class Actionsample3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_AD~1\\AppData\\Local\\Temp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://newtours.demoaut.com/");
		
  //WebElement link = driver.findElement(By.linkText("Cruises"));
		
		//Actions Act = new Actions(driver);
		
		driver.findElement(By.name("userName")).sendKeys("sunil");
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);

		Actions Act = new Actions(driver);
		Thread.sleep(3000);
		Act.sendKeys(Keys.TAB,Keys.TAB,Keys.ENTER).perform();	
		//Action mouseover = Act.moveToElement(driver.findElement(arg0)).build();
		//mouseover.perform();
		

	}

}

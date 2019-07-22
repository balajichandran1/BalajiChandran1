package SeleniumSamples;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class ActionSample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_AD~1\\AppData\\Local\\Temp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://newtours.demoaut.com/");
		
		WebElement link = driver.findElement(By.linkText("Cruises"));
		
		Actions Act = new Actions(driver);
		Action mouseover = Act.moveToElement(link).build();
		mouseover.perform();
		
		//Act.sendKeys(link,(Keys.ENTER)).perform();
		Act.sendKeys(link,(Keys.RETURN)).perform();

	}

}

package SeleniumSamples;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
public class Actionsample4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_AD~1\\AppData\\Local\\Temp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://retail.upskills.in/admin/");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.xpath("//*[@class='btn btn-primary' and @type = 'submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='menu-catalog']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.linkText("Categories")).click();
		
		
		WebElement link = driver.findElement(By.linkText("Categories"));
		
		//Act.sendKeys(Keys.TAB,Keys.TAB,Keys.ENTER).perform();
		Actions Act = new Actions(driver);
	//	Action mouseover = Act.moveToElement(link).build();
		Act.sendKeys(link,(Keys.RETURN)).perform();
		//WebElement link = 
	}

}

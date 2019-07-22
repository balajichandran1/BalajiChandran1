package SeleniumSamples;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
public class RobotSample {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_AD~1\\AppData\\Local\\Temp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://realestate.upskills.in/wp-admin/");
        
		driver.findElement(By.id("user_login")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.id("user_pass")).sendKeys("adminuser@12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type ='submit' and @name = 'login']")).click();
		WebElement link = driver.findElement(By.xpath("//*[contains(text(),'Howdy')]"));
		Actions act = new Actions(driver);
		act.contextClick(link).build().perform();
		//act.sendKeys(link,Keys.ARROW_DOWN,Keys.RETURN).perform();
	    Robot robot = new Robot();
	    robot.keyPress(KeyEvent.VK_DOWN);
	    Thread.sleep(2000);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(2000);
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    Thread.sleep(2000);
	    robot.keyPress(KeyEvent.VK_TAB);
	    Thread.sleep(2000);
	    String URL = driver.getCurrentUrl();
	    System.out.println(URL);
	}

	}

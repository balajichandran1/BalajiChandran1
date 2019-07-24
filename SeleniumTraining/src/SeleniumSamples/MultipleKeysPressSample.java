package SeleniumSamples;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MultipleKeysPressSample {

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
		//To move the control to the newly opened window
		//Actions act = new Actions(driver);
		//act.sendKeys(Keys.chord(Keys.CONTROL,Keys.TAB)).build().perform();
		//act.sendKeys(Keys.CONTROL,Keys.TAB).build().perform();
		
		/* Robot rob = new Robot();
	    rob.keyPress(KeyEvent.VK_CONTROL);
          Thread.sleep(2000);
		  rob.keyPress(KeyEvent.VK_TAB);*/
		
		
		
	}

}

package SeleniumSamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Documents\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_AD~1\\AppData\\Local\\Temp\\chromedriver_win32\\chromedriver.exe");
		//WebDriver dv =new FirefoxDriver();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.get and driver.navigate().to is used to open the url
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		//Thread.sleep(2000);
		//driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='welcome']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.linkText("Logout")).click();
		//driver.findElement(By.xpath("//*[@id,'Logout']")).click(); - not working
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
		////index.php/auth/
	}

}

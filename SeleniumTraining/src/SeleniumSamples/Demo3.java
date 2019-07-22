package SeleniumSamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_AD~1\\AppData\\Local\\Temp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://newtours.demoaut.com/ ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("Sunil");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Sunil");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='Login']")).click();
		Thread.sleep(10000);
	}

}

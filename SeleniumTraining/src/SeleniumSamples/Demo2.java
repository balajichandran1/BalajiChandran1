package SeleniumSamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_AD~1\\AppData\\Local\\Temp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		//Thread.sleep(2000);
		//String ExpectedTitle = "OrangeHRM";
		String ExpectedTitle = "Orangehrm";
		//This is to find the element and pass value to the element
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		//This is used to fetch the title of the page
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		if(ExpectedTitle.equals(ActualTitle))
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='welcome']")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
            driver.close();
	    }
		
		else {
			System.out.println("Title is Different");
			driver.close();
		}
	}
}

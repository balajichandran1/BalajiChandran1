package SeleniumSamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadSample {

		public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
			//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Documents\\geckodriver-v0.24.0-win64\\geckodriver.exe");
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_AD~1\\AppData\\Local\\Temp\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				driver.manage().window().maximize();
				driver.navigate().to("http://elearning.upskills.in/");
				Thread.sleep(2000);
				driver.navigate().refresh();  
			    driver.findElement(By.xpath("//*[@id='login']")).sendKeys("admin");
			    driver.findElement(By.xpath("//*[@id='password']")).sendKeys("admin@123");
				driver.findElement(By.xpath("//*[@id='form-login_submitAuth']")).click();
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("//*[@class='block-items-admin']/ul/li[4]/a")).click();
			    Thread.sleep(3000);
			    //Upload to the file
			    driver.findElement(By.id("user_import_import_file")).sendKeys("C:\\Users\\IBM_ADMIN\\Desktop\\Data.csv");


	}

}

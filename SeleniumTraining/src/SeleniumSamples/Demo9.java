package SeleniumSamples;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Demo9 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_AD~1\\AppData\\Local\\Temp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://newtours.demoaut.com/");
		WebElement username = driver.findElement(By.name("userName"));
		if(username.isEnabled())
		{
			username.sendKeys("Sunil");
			username.clear();
			username.sendKeys("Sunil");
		}
		
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.linkText("Home")).click();
		System.out.println("Home is clicked Successfully");
		
		WebElement username1 = driver.findElement(By.name("userName"));
		if(username1.isEnabled())
		{
			System.out.println("Home Web page is completed");
		}
		
		driver.findElement(By.linkText("Flights")).click();
		System.out.println("Flights is clicked Successfully");
		
		if(driver.findElement(By.xpath("//*[@name='tripType' and @value='roundtrip']")).isSelected())
		{
			System.out.println("Flights Web page is completed");
	
		}
		
		
		driver.findElement(By.linkText("Hotels")).click();
		System.out.println("Hotels is clicked Successfully");
		
		//if(driver.findElement(By.xpath(containstext())
		{
			System.out.println("Flights Web page is completed");
	
		}
		
		driver.findElement(By.linkText("Car Rentals")).click();
		System.out.println("Car Rentals is clicked Successfully");
		
		driver.findElement(By.linkText("Cruises")).click();
		System.out.println("Cruises is clicked Successfully");
		
		driver.findElement(By.linkText("Destinations")).click();
		System.out.println("Destinations is clicked Successfully");
		
		driver.findElement(By.linkText("Vacations")).click();
		System.out.println("Vacations is clicked Successfully");
					

	}
	

}

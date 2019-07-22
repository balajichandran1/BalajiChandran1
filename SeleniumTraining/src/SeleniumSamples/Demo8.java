package SeleniumSamples;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_AD~1\\AppData\\Local\\Temp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("admin123");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@name='Submit']")).click();
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		driver.findElement(By.xpath("//*[@id='menu__Performance']")).click();
		List<WebElement> Link = driver.findElements(By.tagName("a"));
		//System.out.println(Link.size());
		for(WebElement e:Link)
		{
			String alllinks = e.getText();
			System.out.println("The name of links are : " + alllinks);
		}
		
	}

}

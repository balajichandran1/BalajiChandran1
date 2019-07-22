package SeleniumSamples;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Demo7 {

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
		//driver.findElement(By.xpath("//*/input[@value='oneway']")).click();
		if(driver.findElement(By.xpath("//*[@name='tripType' and @value='roundtrip']")).isSelected())
		{
			driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
	
		}
		
		WebElement DD = driver.findElement(By.name("passCount"));
		Select sel = new Select(DD);
		List<WebElement> options = sel.getOptions();
		System.out.println(options.size());//This is to enter the size - 4 //for loop is to display 1,2,3,4 - 
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		sel.selectByValue("2"); //in GUI this will select 2
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='servClass' and @value='Business']")).click();
		driver.findElement(By.name("findFlights")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("reserveFlights")).click();
		driver.findElement(By.name("passFirst0")).sendKeys("Balaji");
		driver.findElement(By.name("passLast0")).sendKeys("Chandran");
		WebElement E = driver.findElement(By.name("pass.0.meal"));
		Select sel1 = new Select(E);
		sel1.selectByIndex(2); //in GUI this will select 2
		Thread.sleep(3000);
		driver.findElement(By.name("creditnumber")).sendKeys("1234 5678 1357");
		//driver.findElement(By.xpath("//*[@name='ticketLess' and @value='checkbox']")).click(); //To select the checkbox
		List<WebElement>checkbox = driver.findElements(By.xpath("//*[@name='ticketLess' and @value='checkbox']"));
		System.out.println("Checkbox size is : " + checkbox.size());
		// for loop to click both the check boxes
		for(WebElement e:checkbox)
		{
			e.click();
		}
		
		//for (int i=1;i<checkbox.size();i++)
		//{
		//checkbox.get(i).click();
		//}
	//	driver.findElement(By.xpath("//*[@name='buyFlights']")).click();
	//	driver.findElement(By.xpath("//*[contains(text(),'SIGN-OFF')]")).click();
	//	System.out.println("Logged out successfully");
}
}

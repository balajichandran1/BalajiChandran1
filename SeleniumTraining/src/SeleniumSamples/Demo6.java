package SeleniumSamples;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Demo6 {

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
		//if(username.isDisplayed())
		//{
			//String UN = username.getAttribute("value");
			//String UN1 = username.getAttribute("name");
			//System.out.println(UN1);
			//String text = driver.findElement(By.xpath("//*[contains(text(),'Name:')]")).getText();
			//System.out.println(text);
			//System.out.println(UN);
		
		//}
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
		//String option1 = driver.findElement(By.name("passCount")).getText(); //this is to display 1,2,3,4
		//System.out.println(option1);
		//String option2 = driver.findElement(By.name("passCount")).getAttribute("value"); // this is to display 2
		//System.out.println(option2);
		//WebElement first = sel.getFirstSelectedOption();
		//System.out.println(first.getAttribute("value"));
		Thread.sleep(3000);
		//sel.selectByVisibleText("1");
		//Thread.sleep(3000);
		//sel.selectByIndex(3);
		driver.findElement(By.xpath("//*[@name='servClass' and @value='Business']")).click();
		driver.findElement(By.name("findFlights")).click();
		}

}

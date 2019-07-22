package SeleniumSamples;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class casestudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_AD~1\\AppData\\Local\\Temp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://newtours.demoaut.com/");
		
		String underconstitle = "Under Construction: Mercury Tours";
		List<WebElement> links = driver.findElements(By.tagName("a"));
		String[] linktext = new String[links.size()];
		
		int i = 0;
		
	for(WebElement e:links)
	{
		linktext[i] =e.getText();
		i++;
	}
	for(String t:linktext)
	{
		driver.findElement(By.linkText(t)).click();
		if(driver.getTitle().equals(underconstitle))
		{
			System.out.println("\"" + t + "\" + is underconstruction");
		}
		else
		{
			System.out.println("\"" + t + "\" + is working");
		}
		driver.navigate().back();
	}
	driver.close();
	}

}

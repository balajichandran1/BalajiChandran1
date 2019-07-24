package SeleniumSamples;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuterSample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_AD~1\\AppData\\Local\\Temp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		//String titlewd = driver.getTitle();
		//System.out.println(titlewd);
		
		JavascriptExecutor  js = (JavascriptExecutor)driver;
		//To get the Title of the page
		String title = js.executeScript("return document.title").toString();
        System.out.println(title);
        //To get the URL of the page
        String URL = js.executeScript("return document.URL").toString();
        System.out.println(URL);
        // To get the domain of the page
        String domain = js.executeScript("return document.domain").toString();
        System.out.println(domain);
        //Thread.sleep(2000);
        // I want to pass the value to username field
        //js.executeScript("document.getElementById('txtUsername').value='Admin'");
        //Refresh the page using JS
        js.executeScript("history.go(0)");
               
        js.executeScript("document.getElementById('txtUsername').value='Admin'");
        WebElement ele = (WebElement)js.executeScript("return document.getElementById('txtUsername')");
        String value = ele.getAttribute("value");
        System.out.println(value);
        js.executeScript("document.getElementById('txtPassword').value='admin123'");
        js.executeScript("document.getElementById('btnLogin').click()");
        Thread.sleep(2000);
        js.executeScript("document.getElementById('menu_pim_viewPimModule').click()");
        Thread.sleep(2000);  
        js.executeScript("document.getElementById('menu_pim_viewEmployeeList').click()");
        Thread.sleep(2000); 
        //js.executeScript("window.scrollBy(0,400)");
       // driver.quit();
         js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
         Thread.sleep(2000); 
        // js.executeScript("window.scrollBy(0,document.body.scrollTop)");
       //  js.executeScript("window.scrollTo.valueOf(0)");
        // js.executeScript("window.scroll.valueOf(screenTop)");
        //js.executeScript("window.scrollBy(0,0)"); --window.scrollX(0)
         js.executeScript("window.scrollX(0)");
	}

}

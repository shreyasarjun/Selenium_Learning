import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.steadystate.css.dom.Property;


public class DriverScript {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		
	
		File file = new File("C:/July03/Webdriver/Global Data.properties");
		FileInputStream fileInput = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileInput);
		
        String sAppURL = prop.getProperty("URL");
		
		System.out.println(sAppURL);
	     
		
		if((prop.getProperty("Browser")).equalsIgnoreCase("IE")){
			
            System.setProperty("webdriver.ie.driver","C:\\Selenium Drivers\\IEDriverServer.exe");
			
			WebDriver driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
			Thread.sleep(5000);
			driver.manage().deleteAllCookies();
			driver.get(sAppURL);
			
		}
		
		else if ((prop.getProperty("Browser")).equalsIgnoreCase("Chrome")){
			
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(5000);
			//driver.manage().deleteAllCookies();
			driver.get(sAppURL);
		}
		
		else if ((prop.getProperty("Browser")).equalsIgnoreCase("Firefox")) {
			
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.manage().deleteAllCookies();
			driver.get(sAppURL);
		}
		
	}
	
	
}

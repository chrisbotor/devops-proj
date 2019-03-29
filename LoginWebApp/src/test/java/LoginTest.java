import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxBinary;

public class LoginTest {
	
	public WebDriver driver;
		
	public static WebDriver getDriver() {
    	
    	FirefoxBinary firefoxBinary = new FirefoxBinary();
    	firefoxBinary.addCommandLineOptions("-headless");
    	System.setProperty("webdriver.gecko.driver","/opt/geckodriver");
    	FirefoxOptions fo = new FirefoxOptions();
    	fo.setBinary(firefoxBinary);
    	FirefoxDriver driver=new FirefoxDriver(fo);
    
    	return driver;
    }
		
	 @Test
	 public void CorrectLogin()  {
		 
		 driver = getDriver();
		 driver.get("http://209.97.174.206:8090/LoginWebApp/");
			
			
		String username = "admin";
		String password = "qwertyuiop";
					
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		//driver.findElement(By.xpath("value=Login")).click();
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		 //driver.findElements(By.xpath("//button[@type='submit']"));
		 driver.findElement(By.xpath(".//button[@class='btn btn__primary'][@type='submit']")).click();
	 }
	
		/*
		 System.setProperty("webdriver.gecko.driver","/opt/geckodriver");
		FirefoxOptions fo = new FirefoxOptions();
		fo.setBinary(firefoxBinary);
		FirefoxDriver driver=new FirefoxDriver(fo);
		
		driver.get("http://http://209.97.174.206:8090/LoginWebApp/");
		
		
		String username = "admin";
		String password = "qwertyuiop"
				
		driver.findElement(By.Name("userName")).sendkeys(username);
		driver.findElement(By.Name("password")).sendkeys(password);
		driver.findElement(By.Value("Login")).click();
		*/
	

}

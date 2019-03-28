import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Login {
	
	FirefoxBinary firefoxBinary = new FirefoxBinary();
	firefoxBinary.addCommandLineOptions("-headless");
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
	
	
	

}

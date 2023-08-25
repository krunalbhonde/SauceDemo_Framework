package base;
/*import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;*/
import java.io.*;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TestBase {      // STEP 1
	public WebDriver driver ;
	public static Properties prop;
	public WebDriver launchDriver() throws IOException {
		/*if we share file to other then they directly run .no need change the path if we use 
		 * System.getproperty("user.dir")
		 */ // Take a path form  config.properties in resource package 
		File f= new File(System.getProperty("user.dir")+"//src//test//resource//config.properties");
        FileInputStream fs= new FileInputStream(f);	
        Properties prop = new Properties();
        prop.load(fs);   
        // Choose the browser
        String browsername=(String) prop.get("browser");
        if(driver==null) {
        	if(browsername.equalsIgnoreCase("chrome")) {
        		driver = new ChromeDriver();
        	}
        	else if(browsername.equalsIgnoreCase("firefox")) {
        		driver = new FirefoxDriver();
        	}
        	else if (browsername.equalsIgnoreCase("edge")) {
        		driver = new EdgeDriver();
        	}
        	driver.manage().window().maximize(); // Maximize the window
        	/* Implicitly Wait : Wait for loading page if not found then error show
        	if element or page found then it proceed for next step.*/
        	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
        }
        return driver;       
	}
	
}

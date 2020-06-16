package TestScripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestHelper {
	
public WebDriver driver;
  
	@BeforeMethod
  public void beforemethod() {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\Obsqura\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://phptravels.com/demo/");
	  driver.manage().window().maximize();
	 
  }

  @AfterMethod
   public void afterMethod() {
	  driver.close();
	  }
}

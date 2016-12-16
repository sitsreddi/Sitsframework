package startandstop;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class StartandStop {
 public static WebDriver driver;
 
  @BeforeClass
  public void beforeClass() {
   driver = new FirefoxDriver();
   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
   driver.quit();
  }

}

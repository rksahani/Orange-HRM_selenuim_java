import org.openqa.selenium.Credentials;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseTest
{

    WebDriver driver;



    @BeforeMethod
    public void init()
    {
        driver=new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

//   @AfterMethod
 //  public void flush()
  // {
  //      driver.quit();
  // }
}
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import sun.security.pkcs11.wrapper.Constants;

public class ParkingCalculatorTest {
    WebDriver webDriver;

    @BeforeSuite
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\parking\\macalinac\\chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();
    }

    @BeforeTest
    public void initial(){
        webDriver.get("ttp://adam.goucher.ca/parkcalc/index.php");


    }
}

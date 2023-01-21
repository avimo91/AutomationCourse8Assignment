import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class OptionsTest {
    private static WebDriver driver;

    @BeforeClass
    public static void beforeAll() {
        System.setProperty("webdriver.chrome.driver", Constants.CHROMEDRIVER_PATH);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("-incognito");
        driver = new ChromeDriver(options);


        System.setProperty("webdriver.gecko.driver", Constants.FIREFOXDRIVER_PATH);
        FirefoxOptions optionsf = new FirefoxOptions();
        optionsf.addArguments("-incognito");
        driver = new FirefoxDriver(optionsf);

    }

    @AfterClass
    public static void afterAll() {
        driver.quit();
    }



}

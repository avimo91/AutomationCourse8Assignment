import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Solution {
    private static ChromeDriver chromeDriver;
    private static FirefoxDriver firefoxDriver;

    @BeforeClass
    public static void beforeAll() {
        System.setProperty("webdriver.chrome.driver", Constants.CHROMEDRIVER_PATH);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("-incognito");
        chromeDriver = new ChromeDriver(options);


//        System.setProperty("webdriver.gecko.driver", Constants.FIREFOXDRIVER_PATH);
//        FirefoxOptions optionsf = new FirefoxOptions();
//        optionsf.addArguments("-incognito");
//        firefoxDriver = new FirefoxDriver(optionsf);

    }

    @AfterClass
    public static void afterAll() {
        chromeDriver.quit();
        // firefoxDriver.quit();
    }

    //1
//    @Test
//    public void test01_open_websites() {
//        chromeDriver.get("https://www.walla.co.il");
//        firefoxDriver.get("https://www.ynet.co.il");
//    }
    //2
//    @Test
//    public void test02_google_translate() {
//        chromeDriver.get("https://translate.google.com/");
//        System.out.println(chromeDriver.findElement(By.className("QFw9Te")));
//        System.out.println(chromeDriver.findElement(By.className("er8xn")));
//    }
    //3
//    @Test
//    public void test03_youtube() {
//        firefoxDriver.get("https://www.youtube.com/");
//        System.out.println(firefoxDriver.findElement(By.id("search-icon-legacy")));
//    }
    //4
//    @Test
//    public void test04_seleniumHQ() {
//        firefoxDriver.findElement(By.className("DocSearch-Button-Placeholder")).click();
//        firefoxDriver.findElement(By.className("DocSearch-Input")).sendKeys("selenium");
//        System.out.println(firefoxDriver.findElement(By.className("DocSearch-Button-Placeholder")));
//    }
    //5
//    @Test
//    public void test05_amazon() {
//        chromeDriver.get("https://www.amazon.com/");
//        String title = chromeDriver.getTitle();
//        System.out.println(title);
//        Assert.assertTrue(title.contains("Amazon"));
//        chromeDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("Leather shoes");
//       WebElement s =  chromeDriver.findElement(By.id("nav-search-submit-button"));
//       s.click();
//    }
    //6
//    @Test
//    public void test06_translate() {
//        chromeDriver.get("https://translate.google.com/");
//       chromeDriver.findElement(By.className("er8xn")).sendKeys("אבי מה קורה");
//
//    }
    //7
//    @Test
//    public void test07_find_song() {
//        chromeDriver.get("https://www.youtube.com/");
//        chromeDriver.findElement(By.name("search_query")).sendKeys("Baraye - Shervin Hajipour");
//        chromeDriver.findElement(By.id("search-icon-legacy")).click();
//
//    }
    //8
//    @Test
//    public void test8_facebook() {
//        chromeDriver.get("https://www.facebook.com/");
//        chromeDriver.findElement(By.id("email")).sendKeys("avimo64@gmail.com");
//        chromeDriver.findElement(By.id("pass")).sendKeys("1991/avimoyal");
//       WebElement login = chromeDriver.findElement(By.name("login"));
//       login.click();
//
//    }
    //9
    @Test
    public void test9_challengeJavaScript() {
        chromeDriver.get("https://www.youtube.com/");
        WebElement element = chromeDriver.findElement(By.id("search-icon-legacy"));
        ((JavascriptExecutor) chromeDriver).executeScript("arguments[0].click();", element);

    }
}

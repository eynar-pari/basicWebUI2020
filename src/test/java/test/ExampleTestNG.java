package test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ExampleTestNG {
    private ChromeDriver driver;
    @BeforeMethod
    public void openBrowser() {
        String PATH_PROJECT = new File(".").getAbsolutePath().replace(".", "");

        System.setProperty("webdriver.chrome.driver", (PATH_PROJECT+"src+test+java+drivers+chromedriver.exe").replace("+",File.separator));
        Map<String, Object> prefs = new HashMap<String, Object>();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testSeleniumTestNG() throws InterruptedException {
        driver.get("https://www.google.com/");
        Thread.sleep(2000);

    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}

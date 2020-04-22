package factoryBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Chrome implements IBrowser{
    @Override
    public WebDriver create() {
        String PATH_PROJECT = new File(".").getAbsolutePath().replace(".", "");
        System.setProperty("webdriver.chrome.driver", (PATH_PROJECT+"src+test+java+drivers+chromedriver.exe").replace("+",File.separator));
        Map<String, Object> prefs = new HashMap<String, Object>();
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);

        // wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return driver;
    }
}

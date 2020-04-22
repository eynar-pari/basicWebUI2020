package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ExampleJunit {

    private ChromeDriver driver;

    @Before
    public void openBrowser() {
        String PATH_PROJECT = new File(".").getAbsolutePath().replace(".", "");

        System.setProperty("webdriver.chrome.driver", (PATH_PROJECT+"src+test+java+drivers+chromedriver.exe").replace("+",File.separator));
        Map<String, Object> prefs = new HashMap<String, Object>();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testSeleniumJunit() throws InterruptedException {
        driver.get("http://todo.ly/");
        Thread.sleep(2000);

        //  imagen login
        // ACCION --- DONDE (CONTROL) --- DONDE ESTA CONTROL

        // Page Object

        driver.findElement(By.xpath("//img[@src=\"/Images/design/pagelogin.png\"]")).click();

        // textbox email -modal login
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail")).sendKeys("eynar.pari@gmail.com");

        // textbox pwd - modal login
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword")).sendKeys("Control123!");

        // button login - modal login
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_ButtonLogin")).click();
        Thread.sleep(2000);

        // CREACION DE UN PROYECTO (participacion)

        driver.findElement(By.id("Div2")).click();
        driver.findElement(By.id("NewProjNameInput")).sendKeys("NOMBREP");
        driver.findElement(By.id("NewProjNameButton")).click();


        // UPDATE PROYECTO


        // DELETE PROYECTO




    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}

package sessionManager;

import factoryBrowser.FactoryBrowser;
import org.openqa.selenium.WebDriver;

public class DriverManager {

    private static DriverManager instance= null;
    private WebDriver browser;


    private DriverManager(){
        browser= FactoryBrowser.make("browserstack").create();
    }

    public static DriverManager getInstance(){
        if (instance == null)
            instance=new DriverManager();

        return instance;
    }


    public WebDriver getBrowser(){
        return browser;
    }

    public void closeBrowser(){
        browser.quit();
    }



}

package testTodoist;

import org.junit.After;
import org.junit.Before;
import sessionManager.DriverManager;

public class TestBase {

    @Before
    public void before(){
        DriverManager.getInstance().getBrowser().get("https://todoist.com/");
        DriverManager.getInstance().getBrowser().manage().window().maximize();
    }
    @After
    public void after(){
        DriverManager.getInstance().closeBrowser();
    }


    public void waitTime(int seconds) throws InterruptedException {
        Thread.sleep(1000 *seconds);

    }
}

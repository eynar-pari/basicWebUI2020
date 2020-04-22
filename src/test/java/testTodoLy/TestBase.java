package testTodoLy;

import org.junit.After;
import org.junit.Before;
import sessionManager.DriverManager;

public class TestBase {

    @Before
    public void before(){
        DriverManager.getInstance().getBrowser().get("http://todo.ly/");
    }
    @After
    public void after(){
        DriverManager.getInstance().closeBrowser();
    }
}

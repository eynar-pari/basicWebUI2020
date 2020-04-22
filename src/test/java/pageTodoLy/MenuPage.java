package pageTodoLy;

import controlSelenium.Link;
import org.openqa.selenium.By;

public class MenuPage {

    public Link logoutLink;

    public MenuPage(){
        logoutLink = new Link(By.id("ctl00_HeaderTopControl1_LinkButtonLogout"));

    }
}

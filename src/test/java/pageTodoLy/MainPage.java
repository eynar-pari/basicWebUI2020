package pageTodoLy;

import controlSelenium.Imagen;
import org.openqa.selenium.By;

public class MainPage {
    public Imagen loginImage;

    public MainPage(){
        loginImage = new Imagen(By.xpath("//img[@src=\"/Images/design/pagelogin.png\"]"));

    }

}

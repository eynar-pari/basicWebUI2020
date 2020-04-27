package pageTodoist;

import controlSelenium.Button;
import org.openqa.selenium.By;

public class MainPage {

    public Button iniciarSesionbutton;

    public MainPage(){
        iniciarSesionbutton= new Button(By.xpath("//ul[@class=\"W9ktc\"]//a[text()='Iniciar sesión']"));
    }
}

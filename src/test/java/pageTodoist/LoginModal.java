package pageTodoist;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class LoginModal {

    public TextBox emailTextBox;
    public TextBox passwordTextBox;
    public Button iniciarSesion;

    public LoginModal(){
        emailTextBox= new TextBox(By.id("email"));
        passwordTextBox= new TextBox(By.id("password"));
        iniciarSesion = new Button(By.xpath("//button[text()='Iniciar sesión']"));
    }
}

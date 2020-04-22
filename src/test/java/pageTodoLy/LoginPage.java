package pageTodoLy;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class LoginPage {

    public TextBox emailTextBox;
    public TextBox passwordTextBox;
    public Button loginButton;

    public LoginPage(){
        emailTextBox= new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail"));
        passwordTextBox = new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword"));
        loginButton = new Button(By.id("ctl00_MainContent_LoginControl1_ButtonLogin"));

    }

}

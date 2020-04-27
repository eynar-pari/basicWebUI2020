package testTodoLy;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pageTodoLy.LoginPage;
import pageTodoLy.MainPage;
import pageTodoLy.MenuPage;
import sessionManager.DriverManager;

public class TestLogin extends TestBase {

    private MainPage mainPage = new MainPage();
    private LoginPage loginPage = new LoginPage();
    private MenuPage menuPage = new MenuPage();


     @Test
    public void testLoginIsWorking(){
        // Accion / Donde se hace la acciones (Objeto) / Donde esta el objeto

        mainPage.loginImage.click();
        loginPage.emailTextBox.type("eynar.pari@gmail.com");
        loginPage.passwordTextBox.type("Control123!");
        loginPage.loginButton.click();

        // Verificacion
        boolean actualResult=menuPage.logoutLink.isDisplayed();
        Assert.assertTrue("ERROR ! No Login",actualResult);
    }
}

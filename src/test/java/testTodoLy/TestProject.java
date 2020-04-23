package testTodoLy;

import org.junit.Assert;
import org.junit.Test;
import pageTodoLy.LeftMenuPage;
import pageTodoLy.LoginPage;
import pageTodoLy.MainPage;
import pageTodoLy.MenuPage;
import sessionManager.DriverManager;

public class TestProject extends TestBase {

    private MainPage mainPage = new MainPage();
    private LoginPage loginPage = new LoginPage();
    private MenuPage menuPage = new MenuPage();
    private LeftMenuPage leftMenuPage = new LeftMenuPage();


     @Test
    public void testCRUDproject() throws InterruptedException {

        String nameProject="eynar";
        String nameProjectUpdated="upb UPDATE";

        mainPage.loginImage.click();

        loginPage.loginTodoLy("eynar.pari@gmail.com","Control123!");

        // Create
         leftMenuPage.addNewProjectButton.click();
         leftMenuPage.addNewProjectTextBox.type(nameProject);
         leftMenuPage.addButton.click();

         this.waitTime(2);
         Assert.assertTrue("ERROR ! El proyecto no fue creado",leftMenuPage.isDisplayedProject(nameProject));
         Assert.assertEquals("ERROR ! proyecto no creado",nameProject,leftMenuPage.getValueProyectLabel(nameProject));

         // Update
         leftMenuPage.selectProject(nameProject);
         leftMenuPage.menuOptionIcon.click();
         leftMenuPage.editButton.click();
         leftMenuPage.editProjectNameTextBox.type(nameProjectUpdated);
         leftMenuPage.saveButton.click();

         this.waitTime(2);
         Assert.assertTrue("ERROR ! El proyecto no fue actualizado",leftMenuPage.isDisplayedProject(nameProjectUpdated));

         //Delete
         leftMenuPage.selectProject(nameProjectUpdated);
         leftMenuPage.menuOptionIcon.click();
         leftMenuPage.deleteButton.click();

         // Alerta
         DriverManager.getInstance().getBrowser().switchTo().alert().accept();
         this.waitTime(2);

         Assert.assertFalse("ERROR ! El proyecto no fue borrado ",leftMenuPage.isDisplayedProject(nameProjectUpdated));



     }
}

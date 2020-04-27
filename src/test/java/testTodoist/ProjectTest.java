package testTodoist;

import org.junit.Assert;
import org.junit.Test;
import pageTodoist.*;
import sessionManager.DriverManager;

public class ProjectTest extends TestBase{

    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    LeftMenuPage leftMenuPage= new LeftMenuPage();
    NewProjectModal newProjectModal= new NewProjectModal();
    UpdateProjectModal updateProjectModal = new UpdateProjectModal();
    AlertDelete alertDelete = new AlertDelete();
    @Test
    public void verifyCRUDProject() throws InterruptedException {

        String nameProject="Eynar06";
        String nameProjectUpdate="Eynar07";

        mainPage.iniciarSesionbutton.click();

        loginModal.emailTextBox.type("eynar.pari@gmail.com");
        loginModal.passwordTextBox.type("Control123!");
        loginModal.iniciarSesion.click();
        this.waitTime(2);

        leftMenuPage.newProjectButton.click();

        newProjectModal.nombreProjectTextBox.type(nameProject);
        newProjectModal.addButton.click();

        this.waitTime(3);
        Assert.assertTrue("ERROR! no fue creado",leftMenuPage.isDisplayedProject(nameProject));

        leftMenuPage = new LeftMenuPage();
        leftMenuPage.selectProject(nameProject);
        leftMenuPage.clickMenuOptionProject(nameProject);
        this.waitTime(2);
        leftMenuPage.editButton.click();

        updateProjectModal.nombreProjectTextBox.type(nameProjectUpdate);
        updateProjectModal.saveButton.click();
        // verificaion ..
        this.waitTime(2);
        Assert.assertTrue("ERROR! no fue actualizado",leftMenuPage.isDisplayedProject(nameProjectUpdate));

        leftMenuPage = new LeftMenuPage();
        this.waitTime(2);
        leftMenuPage.selectProject(nameProjectUpdate);
        leftMenuPage.clickMenuOptionProject(nameProjectUpdate);

        this.waitTime(2);
        leftMenuPage.deleteButton.click();
        this.waitTime(2);
        alertDelete.deleteButton.click();
        // verificacion...
        this.waitTime(2);
        Assert.assertFalse("ERROR! no fue borrado",leftMenuPage.isDisplayedProject(nameProjectUpdate));

    }
}

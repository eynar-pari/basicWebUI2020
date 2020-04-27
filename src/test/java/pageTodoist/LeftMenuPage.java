package pageTodoist;

import controlSelenium.Button;
import controlSelenium.Label;
import org.openqa.selenium.By;

public class LeftMenuPage {

    public Button newProjectButton;
    public Button editButton;
    public Button deleteButton;

    public LeftMenuPage(){
        newProjectButton= new Button(By.xpath("//a[text()='Add Project']"));
        editButton = new Button(By.xpath("//div[text()='Edit project']"));
        deleteButton= new Button(By.xpath("//*[@id=\"menu_delete_text\"]"));
    }

    public void selectProject(String nameProject){
        Label projectName= new Label(By.xpath("//ul[@id='projects_list']//span[text()='"+nameProject+"']"));
        projectName.click();
    }

    public void clickMenuOptionProject(String nameProject){
        Label projectName= new Label(By.xpath("//span[text()='"+nameProject+"']/parent::td/parent::tr/td[@class='menu']/div"));
        projectName.click();
    }

    public boolean isDisplayedProject(String nameProject){
        Label projectName= new Label(By.xpath("//ul[@id='projects_list']//span[text()='"+nameProject+"']"));
        return projectName.isDisplayed();
    }
}

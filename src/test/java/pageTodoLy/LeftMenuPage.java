package pageTodoLy;

import controlSelenium.Button;
import controlSelenium.Icon;
import controlSelenium.Label;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class LeftMenuPage {

    public TextBox addNewProjectTextBox;
    public TextBox editProjectNameTextBox;

    public Label nameProjectLabel;

    public Icon menuOptionIcon;

    public Button addNewProjectButton;
    public Button addButton;
    public Button editButton;
    public Button saveButton;
    public Button deleteButton;

    public LeftMenuPage(){

        addNewProjectTextBox= new TextBox(By.id("NewProjNameInput"));
        editProjectNameTextBox= new TextBox(By.id("ItemEditTextbox"));
        menuOptionIcon= new Icon(By.xpath("//div[@style='display: block;']/img[@src='/Images/dropdown.png']"));
        addNewProjectButton= new Button(By.id("Div2"));
        addButton= new Button(By.id("NewProjNameButton"));

        editButton= new Button(By.xpath("//ul[@id='projectContextMenu']/li/a[text()='Edit']"));
        saveButton = new Button(By.id("ItemEditSubmit"));
        deleteButton= new Button(By.xpath("//ul[@id='projectContextMenu']/li/a[text()='Delete']"));
    }

    public void selectProject(String nameProject){
        //    xpath ---> //li[last()]//td[text()='"+nameProject+"']
        nameProjectLabel= new Label(By.xpath("//td[text()='"+nameProject+"' and @class='ProjItemContent']"));
        nameProjectLabel.click();
    }

    public boolean isDisplayedProject(String nameProject){
        nameProjectLabel= new Label(By.xpath("//td[text()='"+nameProject+"' and @class='ProjItemContent']"));
         return nameProjectLabel.isDisplayed();
    }

    public String getValueProyectLabel(String nameProject){
        nameProjectLabel= new Label(By.xpath("//td[text()='"+nameProject+"' and @class='ProjItemContent']"));
        return nameProjectLabel.getValue();
    }

}
/*
button --- Add New Project
textbox ---- Add New Project
button --- Add

verificar -- Label --- nombre project
//td[text()='Eynar' and @class='ProjItemContent']
**********************************

Label --- nombre project
Icon ---- menu options  //div[@style='display: block;']/img[@src='/Images/dropdown.png']
Edit ---- opcion button //ul[@id='projectContextMenu']/li/a[text()='Edit']

textbox --- edicion    id --- ItemEditTextbox
button --- save       id --- ItemEditSubmit

verificar -- Label --- nombre project

***********************************


Label --- nombre project
Icon ---- menu options
Delete ---- opcion button  //ul[@id='projectContextMenu']/li/a[text()='Delete']

accion Alert ----- Selenium

verificar -- Label --- nombre project (no exista)
 */
package pageTodoist;

import controlSelenium.TextBox;
import controlSelenium.Button;
import org.openqa.selenium.By;

import java.awt.*;

public class NewProjectModal {

    public TextBox nombreProjectTextBox;
    public Button addButton;

    public NewProjectModal(){
        nombreProjectTextBox= new TextBox(By.id("edit_project_modal_field_name"));
        addButton= new Button(By.xpath("//button[text()='Add']"));
    }
}

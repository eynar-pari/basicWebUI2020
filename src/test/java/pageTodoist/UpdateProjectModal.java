package pageTodoist;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class UpdateProjectModal {

    public TextBox nombreProjectTextBox;
    public Button saveButton;

    public UpdateProjectModal(){
        nombreProjectTextBox= new TextBox(By.id("edit_project_modal_field_name"));
        saveButton= new Button(By.xpath("//button[text()='Save']"));
    }
}

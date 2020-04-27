package pageTodoist;

import controlSelenium.Button;
import org.openqa.selenium.By;

public class AlertDelete {
    public Button deleteButton;

    public AlertDelete(){
        deleteButton= new Button(By.xpath("//Button[text()='Delete']"));
    }
}

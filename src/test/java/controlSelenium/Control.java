package controlSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import sessionManager.DriverManager;

public class Control {

    private By locator;
    private WebElement myControl;

    public Control(By locator){
        this.locator=locator;
    }

    public void find(){
        myControl= DriverManager.getInstance().getBrowser().findElement(this.locator);
    }

    // Actions

    public void click(){
        this.find();
        myControl.click();
    }

    public void type(String value){
        this.find();
        myControl.sendKeys(value);
    }

    public String getValue(){
        this.find();
        return myControl.getText();
    }

    public String getValueAttribute(String attribute){
        this.find();
        return myControl.getAttribute(attribute);
    }

    public boolean isDisplayed(){
        try{
            this.find();
            return myControl.isDisplayed();
        } catch (Exception e){
            return false;
        }

    }

}

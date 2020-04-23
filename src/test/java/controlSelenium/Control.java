package controlSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sessionManager.DriverManager;

public class Control {

    private By locator;
    private WebElement myControl;

    public Control(By locator){
        this.locator=locator;
    }

    public void find(){
        // Explicit Wait

        //WebDriverWait wait = new WebDriverWait(DriverManager.getInstance().getBrowser(),5);
        //wait.until(ExpectedConditions.elementToBeClickable(this.locator));

        myControl= DriverManager.getInstance().getBrowser().findElement(this.locator);
    }

    // Actions

    public void click(){
        this.find();
        myControl.click();
    }

    public void type(String value){
        this.find();
        myControl.clear();
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

    public void doubleClick(){
        Actions actions= new Actions(DriverManager.getInstance().getBrowser());
        actions.doubleClick();
    }


}

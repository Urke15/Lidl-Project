package PageLidl;

import Base.BaseLidl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageKonaktData extends BaseLidl {

    public PageKonaktData (){

        PageFactory.initElements(driver, this);
    }

   @FindBy(xpath = "//input[@aria-required=\"true\"]")
    WebElement emailField;

    @FindBy(xpath = "//input[@lightning-input_input]")
    WebElement confirmemailField;

    @FindBy(css = ".styleInputs.slds-p-top_medium.textarea")
    WebElement messageField;

    @FindBy(css = ".btn.btn-primary")
    WebElement TraziButton;

    public void InsertEmail(String mail){
        emailField.clear();
        emailField.sendKeys(mail);

    }
    public void InsertConfirmationmail(String confirmail){
        confirmemailField.clear();
        confirmemailField.sendKeys(confirmail);
    }
    public void InsertMessage(String message){
        messageField.clear();
        messageField.sendKeys(message);

    }

    public void clickTrazi(){
        TraziButton.click();
    }

}

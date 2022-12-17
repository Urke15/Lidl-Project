package PageLidl;

import Base.BaseLidl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PretrazivacProdavnicePage extends BaseLidl {

public PretrazivacProdavnicePage(){

    PageFactory.initElements(driver, this);
}

@FindBy(css = ".slds-text-heading_medium.slds-hyphenate")
    WebElement textPretrazivaca;
@FindBy(id = "searchButton")
WebElement buttonTrazi;

public String CheckText(){
    return textPretrazivaca.getText();

    }
    public boolean CheckTraziButton() {
        return buttonTrazi.isDisplayed();

    }
}




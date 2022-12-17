package PageLidl;

import Base.BaseLidl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardLidl extends BaseLidl {

public DashboardLidl (){

    PageFactory.initElements(driver, this);

}
@FindBy(className = "cookie-alert-extended-button")
    WebElement cookieButton;

@FindBy(linkText = "Kontakt")
    WebElement kontaktButton;

public void AcceptCookie(){
    cookieButton.click();

}
public void clickKontakt(){
    kontaktButton.click();

}

}

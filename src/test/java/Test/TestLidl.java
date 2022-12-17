package Test;

import Base.BaseLidl;
import PageLidl.DashboardLidl;
import PageLidl.PageKonaktData;
import PageLidl.PretrazivacProdavnicePage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class TestLidl extends BaseLidl {

    DashboardLidl firstPage;
    PageKonaktData secondPage;
    PretrazivacProdavnicePage thirdPage;
   @Before

public void setUpPage() {

       firstPage = new DashboardLidl();
       secondPage = new PageKonaktData();
       thirdPage = new PretrazivacProdavnicePage();
   }

   @Test

public void SendContactData(){

       wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("cookie-alert-extended-button")));
       firstPage.AcceptCookie();
       firstPage.clickKontakt();
       wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".btn.btn-primary")));
       Select tema = new Select(driver.findElement(By.xpath("//select[@data-aura-rendered-by=\"80:2;a\"]")));
       tema.selectByVisibleText("Lidl Plus");
       Select chooseTema = new Select(driver.findElement(By.xpath("//select[@data-aura-rendered-by=\"93:2;a\"]")));
       chooseTema.selectByVisibleText("Prodavnica");
       secondPage.InsertEmail("uros.mil@hotmail.com");
       secondPage.InsertConfirmationmail("uros.mil@hotmail.com");
       secondPage.InsertMessage("Hello");
       secondPage.clickTrazi();
       Assert.assertTrue(thirdPage.CheckTraziButton());
      // Assert.assertEquals("Traži preko pretraživača prodavnice",thirdPage.CheckText());




   }


}

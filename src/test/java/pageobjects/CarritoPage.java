package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import support.Util;

public class CarritoPage extends Util {

    @FindBy( name = "quantity")
    protected WebElement combxQuantity;

    @FindBy( xpath = "//input[@value='Buy Now']")
    protected WebElement btnBuyNow;

    public CarritoPage() {
        PageFactory.initElements( driver, this );
    }

    public void selectValorQuantity( String cantidad ){
        timerWait.until(ExpectedConditions.visibilityOf( combxQuantity ));
        //3 Formas de seleccionar valor de combo box
        new Select( combxQuantity ).selectByVisibleText( cantidad );
        //new Select( combxQuantity ).selectByValue( cantidad );
        //new Select( combxQuantity ).selectByIndex( 4 );
    }

    public void darClickBtnBuyNow(){
        timerWait.until( ExpectedConditions.elementToBeClickable( btnBuyNow ) );
        btnBuyNow.click();
    }
}

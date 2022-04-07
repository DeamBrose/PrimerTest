package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import support.Util;

public class PagoPage extends Util {

    @FindBy( id = "card_nmuber")
    protected WebElement txtNroCardCredit;

    @FindBy( id = "month")
    protected WebElement combxMes;

    @FindBy( id = "year")
    protected WebElement combxAnio;

    @FindBy( name = "cvv_code")
    protected WebElement txtCvv;

    @FindBy( name = "submit")
    protected WebElement btnPay;

    public PagoPage() {
        PageFactory.initElements( driver, this );
    }

    public void escribirNroCardCredit( String numero ){
        timerWait.until(ExpectedConditions.visibilityOf( txtNroCardCredit ));
        txtNroCardCredit.sendKeys( numero );//Escribimos con sendKeys
    }

    public void selectMes( String mes ){
        new Select( combxMes ).selectByVisibleText( mes );
    }

    public void selectAnio( String anio ){
        new Select( combxAnio ).selectByVisibleText( anio );
    }

    public void escribirCvv( String cvv ){
        txtCvv.sendKeys( cvv );//Escribimos con sendKeys
    }

    public void darClickBuy(){
        btnPay.click();
    }
}

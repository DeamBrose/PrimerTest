package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.Util;

public class SuccessPago extends Util {

    @FindBy( xpath = "//*[text()='Order ID']//preceding::h2")
    protected WebElement lblSuccessPayment;

    @FindBy( xpath = "//*[text()='Order ID']//following::strong[1]")
    protected WebElement lblorderId;

    public SuccessPago() {
        PageFactory.initElements( driver, this );
    }

    public void validarMensaje( String mensaje ){
        timerWait.until(ExpectedConditions.visibilityOf( lblSuccessPayment ));
        Assert.assertEquals( mensaje, lblSuccessPayment.getText() );
    }

    public void mostrarCodigo(){
        System.out.println( "Order Is: "+lblorderId.getText() );
    }
}

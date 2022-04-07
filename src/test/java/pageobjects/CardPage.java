package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.Util;

public class CardPage extends Util {
    public static String nroCard;
    public static String cvvCard;
    public static String mes;
    public static String anio;

    @FindBy(xpath = "//*[contains(text(),'Card Number:')]")
    protected WebElement lblNroCardCredit;

    @FindBy(xpath = "//*[contains(text(),'CVV:')]")
    protected WebElement lblCvvCardCredit;

    @FindBy(xpath = "//*[contains(text(),'Exp:')]")
    protected WebElement lblExpiraCardCredit;

    public CardPage() {
        PageFactory.initElements( driver, this );
    }

    public void getNroCardCredit(){
        timerWait.until( ExpectedConditions.visibilityOf( lblCvvCardCredit ) );//Esperar a que el objeto este visible en pantalla.
        String nroCardCredit = lblNroCardCredit.getText();//Obtiene el texto

        nroCard = nroCardCredit.replace("Card Number:- ", "");

        System.out.println( nroCard );
    }

    public void getCvvCardCredit(){
        String cvvCardCredit = lblCvvCardCredit.getText();//Obtiene el texto

        cvvCard = cvvCardCredit.replace( "CVV:- ", "" );

        System.out.println( cvvCard );
    }

    public void getFechaCardCredit(){
        String fechaCardCredit = lblExpiraCardCredit.getText();//Obtiene el texto

        String[] fecha = fechaCardCredit.replace( "Exp:- ", "" ).split("/");
        mes = fecha[0];
        anio = fecha[1];
        System.out.println( mes );
        System.out.println( anio );
    }
}

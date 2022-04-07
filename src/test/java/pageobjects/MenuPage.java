package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.Util;

public class MenuPage extends Util {
    @FindBy(linkText = "Generate Card Number")
    protected WebElement lnkGenerarCard;

    @FindBy( css = "#nav > a:nth-child(2)")
    protected WebElement selectGenerarCard;

    @FindBy( xpath = "//nav/a[@href='cardnumber.php']")//Existen XPath absolutos(identificados por posición) y relativos()
    protected WebElement xpathGenerarCard;

    public MenuPage() {
        PageFactory.initElements( driver, this );
    }

    public void clickGenerarTarjeta(){
        timerWait.until( ExpectedConditions.elementToBeClickable(lnkGenerarCard) );
        lnkGenerarCard.click();
    }
}

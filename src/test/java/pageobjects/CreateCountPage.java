package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateCountPage {
    @FindBy( id = "id_gender1")
    protected WebElement rbMr;

    @FindBy( id = "id_gender2")
    protected WebElement rbMrs;

    @FindBy( id = "customer_firstname")
    protected WebElement txtNombre;

    @FindBy( id = "customer_lastname" )
    protected WebElement txtApellido;

    @FindBy( id = "email")
    protected WebElement txtEmail;

    @FindBy( id = "passwd" )
    protected WebElement txtPassword;

    @FindBy( id = "days" )
    protected WebElement combxDia;

    @FindBy( id = "months" )
    protected WebElement combxMes;

    @FindBy( id = "years" )
    protected WebElement combxAnio;

    @FindBy( id = "newsletter" )
    protected WebElement cbxSignUpNoticias;

    @FindBy( id = "optin" )
    protected WebElement cbxOfertas;

    @FindBy( id = "firstname" )
    protected WebElement txtDireccionNombre;

    @FindBy( id = "lastname" )
    protected WebElement txtDireccionApellido;

    @FindBy( id = "company" )
    protected WebElement txtDireccionCompany;

    @FindBy( id = "address1" )
    protected WebElement txtDireccion1;

    @FindBy( id = "address2")
    protected WebElement txtDireccion2;

    @FindBy( id = "city")
    protected WebElement txtDireccionCiudad;

    @FindBy( id = "id_state")
    protected WebElement combxEstado;

    @FindBy( id = "postcode")
    protected WebElement combxCodigoPostal;

    @FindBy( id = "id_country")
    protected WebElement combxPais;

    @FindBy( id = "other")
    protected WebElement txtAreaInfoAdicional;

    @FindBy( id = "phone")
    protected WebElement txtTelefono;

    @FindBy( id = "phone_mobile")
    protected WebElement txtTelefonoMobile;

    @FindBy( id = "alias")
    protected WebElement txtDireccionAlias;

    @FindBy( id = "submitAccount")
    protected WebElement btnRegistrar;

}

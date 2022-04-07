package definitions;

import io.cucumber.java.es.*;
import pageobjects.*;

import java.io.IOException;

public class carritoDefinition {
    MenuPage menu;
    CardPage cardCredit;
    CarritoPage carritoPage;
    PagoPage pagoPage;
    SuccessPago successPago;

    public carritoDefinition() {
        menu = new MenuPage();
        cardCredit = new CardPage();
        carritoPage = new CarritoPage();
        pagoPage = new PagoPage();
        successPago = new SuccessPago();
    }

    @Dado("que la web está operativa")
    public void queLaWebEstaOperativa() {
        Hooks.driver.get("https://demo.guru99.com/payment-gateway/purchasetoy.php");//Busca la url en el navegador
    }

    @Cuando("generar el número de tarjeta")
    public void generarElNumeroDeTarjeta() throws IOException {

        menu.clickGenerarTarjeta();
        menu.irVentanaActica();

        cardCredit.getNroCardCredit();
        cardCredit.getCvvCardCredit();
        cardCredit.getFechaCardCredit();
        pagoPage.scrollVertical();
        //menu.evidencias();
        cardCredit.irVentanaInicial();
    }

    @Y("selecciona la cantidad {string}")
    public void seleccionaLaCantidad(String cantidad) {
        carritoPage.selectValorQuantity( cantidad );
    }

    @Y("Realiza la compra del producto")
    public void realizaLaCompraDelProducto() {
        carritoPage.darClickBtnBuyNow();
    }

    @E("ingresa los datos de la tarjeta")
    public void ingresaLosDatosDeLaTarjeta() {
        pagoPage.escribirNroCardCredit(CardPage.nroCard);
        pagoPage.selectMes( CardPage.mes );
        pagoPage.selectAnio( CardPage.anio );
        pagoPage.escribirCvv( CardPage.cvvCard );
    }

    @Y("paga el producto")
    public void pagaElProducto() throws IOException {
        pagoPage.scrollVertical();
        //menu.evidencias();
        pagoPage.darClickBuy();
    }

    @Entonces("validamos que el pago sea {string}")
    public void validamosQueElPagoSea(String mensaje) throws IOException {
        successPago.validarMensaje( mensaje );
        //menu.evidencias();
        successPago.mostrarCodigo();
    }


    @Y("selecciona el mes {string}")
    public void seleccionaElMes(String mes) {
        pagoPage.selectMes( mes );
    }

    @Y("selecciona el anio {string}")
    public void seleccionaElAnio(String anio) {
        pagoPage.selectAnio( anio );
    }

    @Entonces("validar el mensaje del cuadro de dialogo {string}")
    public void validarElMensajeDelCuadroDeDialogo(String mensaje) {
        pagoPage.getTextoDialogo( mensaje );
        pagoPage.aceptarDialogo();
    }
}

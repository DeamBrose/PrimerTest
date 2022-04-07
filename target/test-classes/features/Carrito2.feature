# language: es
  Característica: Funcionalidad del carrito de compra version 2
    @Smoke
    Escenario: Compra de un producto version 2
      Dado que la web está operativa
      Cuando generar el número de tarjeta
      Y selecciona la cantidad "1"
      Y Realiza la compra del producto
      E ingresa los datos de la tarjeta
      Y paga el producto
      Entonces validamos que el pago sea "Payment successfull!"
    @Regre
    Esquema del escenario: Compra de un producto con varias cantidades version 2
      Dado que la web está operativa
      Cuando generar el número de tarjeta
      Y selecciona la cantidad "<cantidad>"
      Y Realiza la compra del producto
      E ingresa los datos de la tarjeta
      Y paga el producto
      Entonces validamos que el pago sea "<mensaje>"

      Ejemplos: Tabla de cantidades
      | cantidad | mensaje             |
      |2         |Payment successfull! |
      |5         |Payment successfull! |
      |7         |Payment fail! |
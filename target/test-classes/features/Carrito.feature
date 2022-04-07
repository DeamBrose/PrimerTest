# language: es
  @Primerafuncionalidad
  Característica: Funcionalidad del carrito de compra
    @Smoke
    Escenario: Compra de un producto
      Dado que la web está operativa
      Cuando generar el número de tarjeta
      Y selecciona la cantidad "5"
      Y Realiza la compra del producto
      E ingresa los datos de la tarjeta
      Y paga el producto
      Entonces validamos que el pago sea "Payment successfull!"

    @Regresion
    Esquema del escenario: Compra de un producto con varias cantidades
      Dado que la web está operativa
      Cuando generar el número de tarjeta
      Y selecciona la cantidad "<cantidad>"
      Y Realiza la compra del producto
      E ingresa los datos de la tarjeta
      Y paga el producto
      Entonces validamos que el pago sea "<mensaje>"

      Ejemplos: Tabla de cantidades
      | cantidad | mensaje             |
      |4         |Payment successfull! |
      |8         |Payment successfull! |
      |6         |Payment fail! |

  Escenario: validacion de tarjeta en blanco
    Dado que la web está operativa
    Cuando selecciona la cantidad "5"
    Y Realiza la compra del producto
    Y selecciona el mes "03"
    Y selecciona el anio "2024"
    Y paga el producto
    Entonces validar el mensaje del cuadro de dialogo "Check card number is 16 digits!"
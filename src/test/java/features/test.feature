Feature: Realizar proceso de pago
  Como usuario web, quiero buscar y realizar el proceso de compra de un producto en Falabella para poder llevar a cabo el proceso con éxito.

  Scenario: Búsqueda del producto en Falabella.
    Given el usuario se encuentra en la página Home de Falabella
    When se introduce la palabra de búsqueda “Portátil Asus Zenbook 14 OLED UM3402YA 14 pulgadas AMD RYZEN R7 16GB 512GB”
    Then se muestra el resultado de “Portátil Asus Zenbook 14 OLED UM3402YA 14 pulgadas AMD RYZEN R7 16GB 512GB”
    And de acuerdo con los resultados, dar clic en el botón “Agregar a la Bolsa”
    And de acuerdo con los resultados, dar clic en el botón “Ver Bolsa de Compras”

  Scenario: Realizar proceso de compra
    Given el usuario quiere finalizar el proceso de comprar para poder disfrutar de su producto.
    When se introduce un correo electrónico <Correo>
    And seleccionar el departamento de <Deparatamente>
    And seleccionar la ciudad de <Ciudad>
    And seleccionar el barrio de <Barrio>
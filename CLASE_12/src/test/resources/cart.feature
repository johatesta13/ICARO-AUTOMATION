Feature: Carrito de compras


  Background:
    Given Estoy logueado correctamente
    And estoy en la pagina de inventario


    Scenario: Validar agregar producto al carrito
      When agrego un producto
      Then el icono del carrito tiene un producto mas

  Scenario: Validar agregar producto al carrito
    When agrego "Sauce Labs Backpack" al carrito
    Then el contador de carrito deberia mostrar "1"


  Scenario: Validar agregar varios productos al carrito
    When agrego "Sauce Labs Backpack" al carrito
    And agrego "Sauce Labs Bike Light" al carrito
    Then el contador de carrito deberia mostrar "2"


    Scenario: Validar ver los productos del carrito
      Given tengo "Sauce Labs Backpack" en el carrito
      When voy al carrito
      Then deberia ver "Sauce Labs Backpack" en la lista de items
      And deberia ver el precio
      And deberia ver la cantida de unidades

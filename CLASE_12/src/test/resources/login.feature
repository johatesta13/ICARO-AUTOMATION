#==========================================================
# LOGIN.FEATURE - Scenarios de autenticación
#==========================================================
#
#
# éste archivo contiene todos los scenrios relacionados con el login
# de usuarios en SauceDemo
#
# Archivos : src/test/resources/features/login.feature
#==========================================================

  Feature: Login de usuarios en SauceDemo

    Como usuario de SauceDemo
    Quiero pode iniciar sesion con mis credenciales
    Para acceder a los productos de la tienda

    # ============================================================
  # SCENARIO 1: Login exitoso (camino feliz)
  # ============================================================

  Scenario: Login exitoso con credenciales validas
    Given estoy en el login de sauce demo
    When el usuario ingresa "standard_user"
    And ingresa contraseña "secret_sauce"
    And hace click en login
    Then estoy en la pagina de inventario
    And el titulo es "productos"


    Scenario: Login fallido con credenciales invalidas
      Given estoy en el login de sauce demo
      When el usuario ingresa "standard_user"
      And ingresa contraseña "secret_sau"
      And hace click en login
      Then me sale un mensaje de error
      And no soy redirigido a la pagina de inventario

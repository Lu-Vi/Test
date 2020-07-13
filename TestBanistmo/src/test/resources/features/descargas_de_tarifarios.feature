Feature:Descargas de tarifarios
  Como usuario de la aplicacion
  Quiero realizar descargas de tarifarios
  Para verificar los costos de las transacciones

  Background: Abrir la pagina de Banistmo
    Given el usuario ingresa a la pagina de Banistmo

  @TarifarioCuentasDepositos
  Scenario:Descarga de tarifario cuentas deposito exitoso
    When el usuario descarga el pdf Tarifas de Cuentas de Depósitos
    Then el usuario deberia ver que se descargo correctamente
Feature: Revision politica datos personales
  Como usuario de la aplicacion
  Quiero revisar la politica de proteccion de datos personales
  Para verificar el tratamiento de mis datos personales

  Background: Abrir la pagina de LATAM
    Given el usuario ingresa a la pagina de LATAM

  @PoliticaDatosPersonalesColombia
  Scenario:Descarga de documento de politica de datos personales Colombia exitoso
    When el usuario descarga el contrato para Colombia Revisa la política de protección de datos personales
    Then el usuario deberia ver que el contrato se descargo correctamente

  @TarifarioCuentasDepositosBrasil
  Scenario:Descarga de documento de politica de datos personales Brasil exitoso
    When el usuario descarga el contrato para Brasil Revisa la política de protección de datos personales
    Then el usuario deberia ver que el contrato se descargo correctamente
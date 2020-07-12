Feature:HU Envio de textos
  Como usuario de la aplicacion whatsapp
  Quiero enviar un texto
  Para verificar el comportamiento de la aplicacion

  Background: Carga de la App
    #Given el usuario ingresa a la aplicacion

  Scenario:Mensaje exitoso
  #  Given el usuario ingresa a la aplicacion
    When el usuario busca Negrito y le escribe soy un robot
    Then el usuario deberia ver su texto soy un robot en la pantalla de envio




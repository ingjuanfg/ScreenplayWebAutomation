#language: es

  Característica: Realizar envio de correos electronicos
    Yo como usuario de google
    Quiero redactar un correo
    Para enviarlo a un destinatario


  Escenario: Envio de correo exitoso
    Dado Juan se encuentra en la pagina de Gmail
    Cuando El envia un correo electronico a jfernandezg@devco.com.co
    Entonces Deberia de ver un mensaje de confirmacion
#language: es

  #Estos escenarios ejecutarian todos el Antencedente
Característica: Ejemplo tecnico de features y stepdefinitions

  Escenario: Prueba con data dentro de las lineas Gherkin
    Cuando Juan hace lo que sea
    Entonces el deberia de ver la info

  Escenario: Prueba con data como Datatable sin columna de identificacion
    Cuando Juan envia la información como datatable
    Entonces deberia de validar que la información es correcta

  Escenario:  Prueba con data como Datatable con columna de identificacion

  Escenario: Prueba manejando anotaciones Before y/o After

  Escenario: Imprimir
    Cuando Juan imprime la info del datatable
      | apellido  | direccion | telefono | marca     |
      | Fernandez | Cra 80    | 4235453  | Chevrolet |
      | Perez     | Cra 90    | 4235453  | Mazda     |
      | Ramirez   | Cra 100   | 4235453  | Kia       |
    Entonces el deberia de ver la info

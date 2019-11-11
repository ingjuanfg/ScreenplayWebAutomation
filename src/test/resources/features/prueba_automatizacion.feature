#language: es

Característica: Ejemplo tecnico de features y stepdefinitions

  @Otro
  @Final
  @Unico
  Escenario: Imprimir
    Cuando Juan imprime la info del datatable
      | apellido  | direccion | telefono | marca     |
      | Fernandez | Cra 80    | 4235453  | Chevrolet |
      | Perez     | Cra 90    | 4235453  | Mazda     |
      | Ramirez   | Cra 100   | 4235453  | Kia       |
    Entonces el deberia de ver la info
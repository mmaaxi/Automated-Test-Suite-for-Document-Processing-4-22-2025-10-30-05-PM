Feature: Validar selección de modo de carga de documentos

  Scenario: Selección de modo de carga
    Given que estoy en la página de carga de documentos
    When selecciono la opción 'cargar documentos'
    Then el sistema muestra opción para carga única y carga múltiple

    When elijo 'carga en un solo archivo'
    Then se habilita un único recuadro para subir el archivo

    When elijo 'cargar documentos por separado'
    Then se muestran múltiples recuadros correspondientes a cada documento requerido
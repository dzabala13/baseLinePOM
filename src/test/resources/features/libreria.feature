Feature: Implementar libreria de acciones para Serenity

  Scenario Outline: Agendar Fiesta dentro de Candymapper
    Given el usuario esta en la pagina
    And el usurio va a la seccion de Halloween Party
    When el usuario indica que sera <tipoDeRol> y que la tematica de la fiesta sera <type>
    And el ususario indica la cantidad de invitados <numeroDeInvitados> e ingresa su <correo_electronico>
    Then el usuario valida que la fiesta se haya sido programada correctamente
    Examples:
      | tipoDeRol | type       | numeroDeInvitados | correo_electronico |
      | Hosting   | Ghosts     | 1                 | example@gmail.com  |
      | Hosting   | Zombies    | 1                 | example@gmail.com  |
      | Attending | Ghostville | 2                 | 2example@gmail.com |
      | Attending | Zombieton  | 0                 | 3example@gmail.com |
      #| Attending | Scared     | 0                 | 3example@gmail.com |




Feature: FAQ

  Scenario: Validar o título da sessão FAQ
    Given que o usuário esteja na página demo do PHPTRAVELS
    When rolar até a seção FAQ
    Then o título do FAQ deve ser exibido

  Scenario: Validar que a primeira pergunta seja apresentada com a resposta
    Given que o usuário esteja na página demo do PHPTRAVELS
    When rolar até a seção FAQ
    And localizar a primeira pergunta
    Then validar que a resposta seja apresentada

  Scenario: Validar que uma pergunta apresente resposta ao clicar
    Given que o usuário esteja na página demo do PHPTRAVELS
    When rolar até a seção FAQ
    And clicar em uma pergunta não expandida
    Then validar que a resposta seja apresentada

  Scenario: Validar que uma pergunta recolha a resposta ao clicar
    Given que o usuário esteja na página demo do PHPTRAVELS
    When rolar até a seção FAQ
    And clicar em uma pergunta expandida
    Then validar que a resposta seja fechada

  Scenario: Validar o título da primeira pergunta
    Given que o usuário esteja na página demo do PHPTRAVELS
    When rolar até a seção FAQ
    Then o titulo da primeira pergunta deve ser exibido

  Scenario: Validar o título da segunda pergunta
    Given que o usuário esteja na página demo do PHPTRAVELS
    When rolar até a seção FAQ
    Then o titulo da segunda pergunta deve ser exibido

  Scenario: Validar o título da terceira pergunta
    Given que o usuário esteja na página demo do PHPTRAVELS
    When rolar até a seção FAQ
    Then o titulo da terceira pergunta deve ser exibido

  Scenario: Validar a resposta da segunda pergunta
    Given que o usuário esteja na página demo do PHPTRAVELS
    When rolar até a seção FAQ
    And clicar na segunda pergunta
    Then a resposta da pergunta deve ser exibida

  Scenario: Validar a resposta da terceira pergunta
    Given que o usuário esteja na página demo do PHPTRAVELS
    When rolar até a seção FAQ
    And clicar na terceira pergunta
    Then a resposta da pergunta deve ser exibida

  Scenario: Validar a resposta da quarta pergunta
    Given que o usuário esteja na página demo do PHPTRAVELS
    When rolar até a seção FAQ
    And clicar na quarta pergunta
    Then a resposta da pergunta deve ser exibida
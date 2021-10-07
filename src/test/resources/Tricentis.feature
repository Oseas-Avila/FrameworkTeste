#Author: oseas.avila08@gmail.com
Feature: Acessar o site Tricentis e preencher formularios
  Eu como usuario quero acessar o site para realizar uma cotacao

  Scenario: Preencher formularios e validar
    Given que eu esteja em "http://sampleapp.tricentis.com/101/app.php"
    When preencher formularios
    Then valido mensagem
  
package io.cucumber.amanda;

import io.cucumber.java.pt.*;
import io.cucumber.amanda.servicos.Configuracao;

public class CompartilhadoSteps {
  @Dado("que que estou no site do tornese um programador")
  public void entrandoNoSite() {
    Configuracao.abrir("https://www.torneseumprogramador.com.br/");
  }
}

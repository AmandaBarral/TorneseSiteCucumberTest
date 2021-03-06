package io.cucumber.amanda;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.pt.*;
import io.cucumber.amanda.servicos.Configuracao;

public class BuscandoConteudoSteps {

  @Dado("digito no campo de busca a palavra {string}")
  public void buscaPorTexto(String string) {
    Configuracao.seletorQueryCss(".form-pesquisa").sendKeys(string);
    Configuracao.seletorQueryCss(".btn-pesquisa").click();
  }

  @Entao("devo ver o resultado na busca")
  public void validandoResultado() {
    assertEquals(true, Configuracao.seletorQueryCssTodos(".div-card-aulas").size() > 0);
    Configuracao.fechar();
  }
}

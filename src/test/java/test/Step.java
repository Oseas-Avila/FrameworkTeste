package test;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Formulario;
import pages.Metodos;

public class Step {
	
	Formulario test = new Formulario();
	Metodos mtd = new Metodos();
	
	@Given("que eu esteja em {string}")
	public void que_eu_esteja_em(String site) {
	    mtd.abrirNavegador("CHROME", site);
		
	}

	@When("preencher formularios")
	public void preencher_formularios() throws InterruptedException {
	    test.formulario1();
		test.formulario2();
		test.formulario3();
		test.formulario4();
		test.formulario5();
		
	}

	@Then("valido mensagem")
	public void valido_mensagem() throws InterruptedException, IOException {
	    test.validarMensagem();
	    mtd.fecharNavegador();
		
	}

}

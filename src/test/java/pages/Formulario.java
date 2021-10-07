package pages;

import java.io.IOException;

import elementos.ElementosWeb;

public class Formulario {

	Metodos mtd = new Metodos();
	ElementosWeb elm = new ElementosWeb();

	public void formulario1() {

		// Clicar em Automobile
		mtd.click(elm.getAutomobile());

		// Selecionar marca
		mtd.click(elm.getMake());
		mtd.click(elm.getMakeOption());

		// Preencher Desempenho do motor [kW]
		mtd.preencher(elm.getEnginePerformance(), "1000");

		// Preencher Data de fabricação
		mtd.preencher(elm.getDateManufacture(), "12/03/2000");

		// Selecionar assentos
		mtd.click(elm.getNumberSeats());
		mtd.click(elm.getNumberSeatsOption());

		// Selecionar tipo de combustível
		mtd.click(elm.getFuelType());
		mtd.click(elm.getFuelTypeOption());

		// Preencher Preço de Tabela
		mtd.preencher(elm.getListPrice(), "40000");

		// Preencher Nuemero da Matricula
		mtd.preencher(elm.getLicensePlateNumber(), "146830");

		// Preencher Quilometragem anual
		mtd.preencher(elm.getAnnualMileage(), "10000");
		
		// Click Next
		mtd.click(elm.getNext1());

	}

	public void formulario2() {

		// Preencher Primeiro Nome e Segundo nome
		mtd.preencher(elm.getFirstName(), "Gustavo");
		mtd.preencher(elm.getLastName(), "Rocha");
		
		// Preencher Data de nascimento
		mtd.preencher(elm.getDateOfBirth(), "02/12/1990");
		
		// Selecionar Gênero
		mtd.click(elm.getGender());
		
		// Preencher Endereço da Rua
		mtd.preencher(elm.getStreetAddress(), "Rua Fortaleza dos Nogueiras, 33");
		
		// Selecionar Pais 
		mtd.click(elm.getCountry());
		mtd.click(elm.getCountryOption());
		
		// Preencher CEP 
		mtd.preencher(elm.getZipCode(), "04336175");
		
		// Preencher Cidade
		mtd.preencher(elm.getCity(), "Osasco");
		
		// Selecionar Ocupação
		mtd.click(elm.getOccupation());
		mtd.click(elm.getOccupationOption());
		
		// Selecionar Hobbie
		mtd.click(elm.getHobbies());
		
		// Click Next
		mtd.click(elm.getNext2());
	}
	
	public void formulario3() {
		
		// Preencher Data de início
		mtd.preencher(elm.getStartDate(), "07/10/2022");
		
		// Selecionar Soma do seguro
		mtd.click(elm.getInsuranceSum());
		mtd.click(elm.getInsuranceSumOption());
		
		// Selecionar Classificação de mérito
		mtd.click(elm.getMeritRating());
		mtd.click(elm.getMeritRatingOption());
		
		// Selecionar Seguro de Danos
		mtd.click(elm.getDamageInsurance());
		mtd.click(elm.getDamageInsuranceOption());
		
		// Selecionar Produtos Opcionais
		mtd.click(elm.getOptionalProducts());
		
		// Selecionar Carro de cortesia
		mtd.click(elm.getCourtesyCar());
		mtd.click(elm.getCourtesyCarOption());
		
		// Click Next
		mtd.click(elm.getNext3());
		
	}
	
	public void formulario4() {
		
		// Selecionar Opção de Preço 
		mtd.click(elm.getUltimateOption());
		
		// Click Next
		mtd.click(elm.getNext4());
		
	}
	
	public void formulario5() throws InterruptedException {
		
		// Preencher E-mail
		mtd.preencher(elm.getEmail(), "oseas.avila08@gmail.com");
		
		// Preencher Phone 
		mtd.preencher(elm.getPhone(), "11934353637");
		
		// Preencher Nome do usuário
		mtd.preencher(elm.getUsername(), "Gu_Rocha");
		
		// Preencher Senha
		mtd.preencher(elm.getPassword(), "Gurocha123");
		mtd.preencher(elm.getConfirmPassword(), "Gurocha123");
		
		// Click Send
		mtd.click(elm.getSend());
		
		// Aguardar 
		mtd.pausa(7000);
		
	}
	
	public void validarMensagem() throws InterruptedException, IOException {
		
		// Validar mensagem "Sending e-mail success!"
		mtd.validar(elm.getMensagem(), "Sending e-mail success!");
		
		// Aguardar 
		mtd.pausa(4000);
		
		// Tirar Evidencia 
		mtd.screenShot("Mensagem", "");
		
	}

}

package io.cucumber.cristiane;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.cristiane.servico.Configuracoes;
import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.Entao;

public class PriceOptionSteps {
	
	@Dado("seleciono Select Option o plano Gold")
	public void seleciono_Select_Option_o_plano_Gold() {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#priceTable>tfoot>tr>th.group>label:nth-child(2)"));
		assertTrue(input.isDisplayed());
		input.click();
	}

	@Entao("devo clicar em Next para o formulario Send Quote")
	public void devo_clicar_em_Next_para_o_formulario_Send_Quote() {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#nextsendquote"));
		assertTrue(input.isDisplayed());
		input.click();
		
	}

}

package org.example;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemonstrationSteps {
    WebDriver drive = new ChromeDriver();
    Actions action = new Actions(drive);

    @Given("que o usuário esteja na página demo do PHPTRAVELS")
    public void que_o_usuario_esteja_na_pagina_demo_do_PHPTRAVELS(){
        drive.get("https://phptravels.com/demo");
        drive.manage().window().maximize();
    }

    @When("rolar até a seção FAQ")
    public void rolar_ate_a_secao_FAQ(){
        WebElement tituloFAQ = drive.findElement(By.xpath("//h3[@class='my-4']"));
        action.moveToElement(tituloFAQ).perform();
    }

    @Then("o titulo do FAQ deve ser exibido")
    public void o_titulo_do_FAQ_deve_ser_exibido(){
        Assertions.assertEquals("Frequently Asked Questions", drive.findElement(By.xpath("//h3[@class='my-4']")).getText());
        drive.quit();
    }

    @And("localizar a primeira pergunta")
    public void localizar_a_primeira_pergunta(){
        drive.findElement(By.id("headingOne"));
    }

    @Then("validar que a resposta seja apresentada")
    public void validar_que_a_resposta_seja_apresentada(){
        drive.findElement(By.id("collapseOne"));
    }

    @And("clicar em uma pergunta não expandida")
    public void clicar_em_uma_pergunta_nao_expandida(){
        drive.findElement(By.id("headingTwo")).click();
    }

    @Then("localizar o campo ZAP NUMBER")
    public void localizar_o_campo_ZAP_NUMBER(){
        drive.findElement(By.xpath("//input[@name='whatsapp']"));
    }

    @Then("validar que todos estão visíveis")
    public void validar_que_todos_estao_visiveis(){
        Assertions.assertTrue(drive.findElement(By.xpath("//input[@name='first_name']")).isDisplayed());
        Assertions.assertTrue(drive.findElement(By.xpath("//label[@for='last_name']")).isDisplayed());
        Assertions.assertTrue(drive.findElement(By.xpath("//select[@name='country_id']")).isDisplayed());
        Assertions.assertTrue(drive.findElement(By.xpath("//input[@name='whatsapp']")).isDisplayed());
        drive.quit();
    }
}

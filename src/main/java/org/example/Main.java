package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        WebDriver drive = new ChromeDriver();
        Actions action = new Actions(drive);

//        drive.get("https://phptravels.com/demo");
//        drive.manage().window().setSize(new Dimension(1920, 1080));

//        1- Botão Login;
//        WebElement bLogin = drive.findElement(By.xpath("//a[@class='btn btn-primary text-white rounded-1 m-1 w-100 fs-6 px-0 fw-100 waves-effect']"));
//        action.moveToElement(bLogin).click().perform();

//        2- Campo Last Name;
//        WebElement iLastName = drive.findElement(By.xpath("//input[@class='last_name form-control']"));
//        action.moveToElement(iLastName).click().perform();

//        3- Botão Subscribe;
//        WebElement bSubscribe = drive.findElement(By.xpath("//button[@class='py-3 btn btn-outline-light btn-lg px-5 rounded-2']"));
//        action.moveToElement(bSubscribe).click().perform();
//
////        4- Campo Result ?;
//        WebElement iResult = drive.findElement(By.xpath("//input[@class='form-control w-100 px-4 no-spin-buttons']"));
//        action.moveToElement(iResult).click().perform();
//
////        5- Botão Talk To Sales;
//        WebElement bTSales = drive.findElement(By.xpath("//a[@class='btn rounded-1 w-100 text-capitalize fs-6 px-0 fw-100 text-dark d-flex text-white waves-effect']"));
//        action.moveToElement(bTSales).click().perform();
//
////        6- Botão Blog;
//        WebElement bBlog = drive.findElement(By.xpath("//a[@href='https://phptravels.com/blog/']"));
//        action.moveToElement(bBlog).click().perform();
//
////        7- Botão The Team;
//        WebElement bDTeam = drive.findElement(By.xpath("//a[@href='https://phptravels.com/the-team/']"));
//        action.moveToElement(bDTeam).click().perform();
//
////        8- Botão Facebook.
//        WebElement bFB = drive.findElement(By.xpath("//a[@class='bg-light col-2 rounded-5 waves-effect']"));
//        action.moveToElement(bFB).click().perform();

//        Cenário 01 - FAQ
//        Given que o usuário esteja na página Demo
//        When rolar até a seção FAQ

//        WebElement tituloFaq = drive.findElement(By.xpath("//div[@class='accordion-item']"));
//        action.moveToElement(tituloFaq).perform();
////        Then a primeira pergunta com a resposta é exibida
//
//        WebElement respostaFaq = drive.findElement(By.xpath("//div[@class='accordion-body']"));
//        respostaFaq.getText();
//        System.out.println(respostaFaq);

//        Cenário 02 - Expandir Pergunta
//        Dado que o usuário esteja na página Demo
//        Quando rolar até a seção FAQ
//        E selecionar uma pergunta

//        WebElement segundoFaq = drive.findElement(By.xpath("//button[@class='accordion-button collapsed']"));
//        action.moveToElement(segundoFaq).click().perform();

//        Então a resposta é exibida


//        Cenário 3 - Need Help
//        Dado que o usuário esteja na página Demo
//        Quando clicar no botão "Need Help?"

//        WebElement botaoProduct = drive.findElement(By.xpath("//a[@class='nav-link d-flex gap-1 align-items-center justify-content-between rounded-1 text-white waves-effect']"));
//        action.moveToElement(botaoProduct).click().perform();

//        Então é aberta a modal de "Chat Now


//        String titulo = drive.getTitle();
//        System.out.println(titulo);
//
//        WebElement firstName = drive.findElement(By.xpath("//input[@class='first_name form-control']"));
//        firstName.sendKeys("Teste");
//
//        WebElement btnSubmit = drive.findElement(By.id("demo"));
//        action.moveToElement(btnSubmit).click().perform();

        // drive.quit();
    }
}
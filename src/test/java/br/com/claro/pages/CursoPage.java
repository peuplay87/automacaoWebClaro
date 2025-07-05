package br.com.claro.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CursoPage {
    private WebDriver driver;

    public CursoPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitulo2() {
        String xpathTitulo = "/html//h1";
        WebElement h2Titulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = h2Titulo.getText();
        return titulo;
    }
}

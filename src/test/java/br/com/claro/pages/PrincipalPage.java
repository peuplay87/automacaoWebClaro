package br.com.claro.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrincipalPage {
    private WebDriver driver;

    public PrincipalPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitulo() {
        String xpathTitulo = "//div[2]/div/div/div[1]/strong";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        return titulo;
    }

    public void ClickCelulares() {
        String xpathBotao = "//*[@id=\"tab-aparelhos\"]//span";
        WebElement btnTitulo = driver.findElement(By.xpath(xpathBotao));
        btnTitulo.click();
    }

}

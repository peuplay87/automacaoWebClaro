package br.com.claro.automacaoWebClaro;

import br.com.claro.automacaoWebClaro.core.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class TesteWebHome {
    WebDriver driver;

    Driver driverWeb;

    @Before
    public void inicializaTesteHome() {
        driverWeb = new Driver("chrome");
        driver = driverWeb.getDriver();
        driver.get("https://accstorefront.cokecxf-commercec1-s2-public.model-t.cc.commerce.ondemand.com/");
    }

    @Test
    public void primeiroTesteValidaHome() {
        String titulo = getTitulo();
        assertEquals("Para quem é ultra conectado", titulo);
    }

    @Test
    public void segundoTeste(){
        Clickbotao();
        String titulo = getTitulo2();
        assertEquals("503 Service Temporarily Unavailable" , titulo );
    }

    private String getTitulo2() {
        String xpathTitulo = "/html/body/center/h1";
        WebElement h2Titulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = h2Titulo.getText();
        return titulo;
    }

    private void Clickbotao() {
        String xpathBotao = "//*[@id=\"tab-pos\"]/a/span";
        WebElement btnTitulo = driver.findElement(By.xpath(xpathBotao));
        btnTitulo.click();
    }

    private String getTitulo() {
        String xpathTitulo = "//div[2]/div/div/div[1]/strong";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        return titulo;
    }

    @After
    public void finalizaTesteHome() {
        driver.quit();
    }

}
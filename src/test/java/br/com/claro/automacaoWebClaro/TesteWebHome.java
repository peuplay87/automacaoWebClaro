package br.com.claro.automacaoWebClaro;

import br.com.claro.automacaoWebClaro.core.Driver;
import br.com.claro.pages.CursoPage;
import br.com.claro.pages.PrincipalPage;
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

    PrincipalPage principalPage;

    CursoPage cursoPage;

    @Before
    public void inicializaTesteHome() {
        driverWeb = new Driver("chrome");
        driver = driverWeb.getDriver();
        driver.get("https://accstorefront.cokecxf-commercec1-s2-public.model-t.cc.commerce.ondemand.com/");
        principalPage = new PrincipalPage(driver);
    }

    @Test
    public void acessarHome() {
        String titulo = principalPage.getTitulo();
        assertEquals("Para quem é ultra conectado", titulo);
    }

    @Test
    public void acessarPaginaCelulares(){
        cursoPage = new CursoPage(driver);
        principalPage.ClickCelulares();
        String titulo = cursoPage.getTitulo2();
        assertEquals("Celular e Smartphone Claro" , titulo );
    }



    @After
    public void finalizaTesteHome() {
        driver.quit();
    }

}
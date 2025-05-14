package br.com.claro.automacaoWebClaro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class TesteWebHome {
    ChromeDriver driver;

    @Before
    public void inicializaTesteHome() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accstorefront.cokecxf-commercec1-s2-public.model-t.cc.commerce.ondemand.com/");
    }

    @Test
    public void primeiroTesteValidaHome() {
        String xpathTitulo = "//div[2]/div/div/div[1]/strong";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        assertEquals("O básico para o dia a dia", titulo);
    }

    @After
    public void finalizaTesteHome() {
        driver.quit();
    }

}
package com.example.olanome;

import com.example.olanome.util.DSL;
import com.example.olanome.util.DriverFactory;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TesteCaixaPreta {
    private AndroidDriver<MobileElement> driver;
    private final DSL dsl = new DSL();

    @Before
    public void setUp() {

        driver = DriverFactory.getDriver();
    }

    @Test
    public void testarNome() {
        dsl.escrever(By.id("com.example.olanome:id/et_inserirNome"), "Pablo");
        dsl.clicar(By.id("com.example.olanome:id/bt_ok"));
        Assert.assertEquals("Olá, Bem vindo Pablo",
                dsl.obterTexto(By.id("com.example.olanome:id/tv_olaNome")));

        dsl.limparEditText(By.id("com.example.olanome:id/et_inserirNome"));
        dsl.escrever(By.id("com.example.olanome:id/et_inserirNome"), "Ana");
        dsl.selecionarSexo("feminino");
        dsl.clicar(By.id("com.example.olanome:id/bt_ok"));
        Assert.assertEquals("Olá, Bem vinda Ana",
                dsl.obterTexto(By.id("com.example.olanome:id/tv_olaNome")));
    }

    @After
    public void tearDown() {
        DriverFactory.finalizarDriver();
    }
}

package com.example.olanome.util;


import static com.example.olanome.util.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class DSL {
    public void escrever(By by, String texto) {
        getDriver().findElement(by).sendKeys(texto);
    }

    public void clicar(By by) {
        getDriver().findElement(by).click();
    }

    public String obterTexto(By by) {
        return getDriver().findElement(by).getText();
    }

    public void limparEditText(By by) {
        getDriver().findElement(by).clear();
    }

    public void selecionarSexo(String sexo) {
        DriverFactory.getDriver().findElementById("com.example.olanome:id/sexoSpinner").click();
        if (sexo.equals("feminino")) {
            DriverFactory.getDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/" +
                    "android.widget.FrameLayout/android.widget.ListView/android.widget." +
                    "CheckedTextView[2]").click();
        } else {
            DriverFactory.getDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/" +
                    "android.widget.FrameLayout/android.widget.ListView/android.widget." +
                    "CheckedTextView[1]").click();
        }
    }

}

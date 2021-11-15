package com.example.olanome;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Teste {
    private AndroidDriver driver;
/*
    @Test
    public void devePreencherCampoTexto() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "K7AXB60350088V6");
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability("appPackage", "com.example.olanome");
        desiredCapabilities.setCapability("appActivity", "com.example.olanome.MainActivity");


        URL remoteUrl = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        MobileElement el1 = (MobileElement) driver.findElementById("com.example.olanome:id/et_inserirNome");
        el1.click();
        el1.sendKeys("Pablo");
        MobileElement el2 = (MobileElement) driver.findElementById("com.example.olanome:id/bt_ok");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementById("com.example.olanome:id/tv_olaNome");
        el3.click();
        String texto = el3.getText();
        Assert.assertEquals("Olá, Bem vindo Pablo", texto);



        driver.quit();
    }
*/
    @Test
    public void deveTestarSpinner() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "K7AXB60350088V6");
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability("appPackage", "com.example.olanome");
        desiredCapabilities.setCapability("appActivity", "com.example.olanome.MainActivity");


        URL remoteUrl = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        MobileElement el1 = (MobileElement) driver.findElementById("com.example.olanome:id/et_inserirNome");
        el1.click();
        el1.sendKeys("Pablo");
        MobileElement el2 = (MobileElement) driver.findElementById("android:id/text1");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementById("com.example.olanome:id/bt_ok");
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementById("com.example.olanome:id/tv_olaNome");
        el5.click();
        Assert.assertEquals("Olá, Bem vindo Pablo",el5.getText());

        MobileElement el6 = (MobileElement) driver.findElementById("com.example.olanome:id/et_inserirNome");
        el6.clear();
        el6.sendKeys("Ana");
        MobileElement el7 = (MobileElement) driver.findElementById("com.example.olanome:id/sexoSpinner");
        el7.click();
        MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
        el8.click();
        MobileElement el9 = (MobileElement) driver.findElementById("com.example.olanome:id/bt_ok");
        el9.click();
        MobileElement el10 = (MobileElement) driver.findElementById("com.example.olanome:id/tv_olaNome");
        el10.click();
        Assert.assertEquals("Olá, Bem vinda Ana",el10.getText());



        driver.quit();
    }

}

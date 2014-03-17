package com;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OperateElement {

    public static void main(String[] args) throws InterruptedException {
        WebDriver dr = new FirefoxDriver();

        File file = new File("src/OperateElement.htm");
        String filePath = "file:///" + file.getAbsolutePath();
        System.out.printf("����ҳ�� %s \n", filePath);

        dr.get(filePath);
        Thread.sleep(1000);

//      click
        dr.findElement(By.linkText("Link1")).click();
        Thread.sleep(1000);
        dr.findElement(By.linkText("Link1")).click();

//û���ҵ�����sendKey��clear��Ԫ��

        Thread.sleep(1000);
        System.out.println("browser will be close");
        dr.quit();  
    }

}

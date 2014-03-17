package com;

import java.io.File;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Formrb {
	  public static void main(String[] args) throws InterruptedException {
          WebDriver driver = new FirefoxDriver();

          File file = new File("src/formrb.htm");
          String filePath = "file:///" + file.getAbsolutePath();
          System.out.println("�򿪽���ҳ�� %s \n"+filePath);

          driver.get(filePath);
          Thread.sleep(1000);

  //      ѡ��checkbox
          driver.findElement(By.cssSelector("input[type=checkbox]")).click();
          Thread.sleep(1000);

  //      ѡ��radio
          driver.findElement(By.cssSelector("input[type=radio]")).click();
          Thread.sleep(1000);

  //      ѡ�������˵��е����һ��
          List<WebElement> options = driver.findElement(By.tagName("select")).findElements(By.tagName("option"));
         //ѡ�����һ��ķ���
          options.get(options.size() - 1).click();
          Thread.sleep(1000);

  //      ����ύ��ť
          driver.findElement(By.cssSelector("input[type=submit]")).click();
          Thread.sleep(3000);
          //��λ������
          Alert al = driver.switchTo().alert();
          //�������������
          System.out.println(al.getText());
          //���ȷ��
          al.accept();

          Thread.sleep(1000);
          System.out.println("browser will be close");
          driver.quit();  
      }


}

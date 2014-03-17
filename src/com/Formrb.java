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
          System.out.println("打开进入页面 %s \n"+filePath);

          driver.get(filePath);
          Thread.sleep(1000);

  //      选中checkbox
          driver.findElement(By.cssSelector("input[type=checkbox]")).click();
          Thread.sleep(1000);

  //      选中radio
          driver.findElement(By.cssSelector("input[type=radio]")).click();
          Thread.sleep(1000);

  //      选择下拉菜单中的最后一项
          List<WebElement> options = driver.findElement(By.tagName("select")).findElements(By.tagName("option"));
         //选择最后一项的方法
          options.get(options.size() - 1).click();
          Thread.sleep(1000);

  //      点击提交按钮
          driver.findElement(By.cssSelector("input[type=submit]")).click();
          Thread.sleep(3000);
          //定位弹出框
          Alert al = driver.switchTo().alert();
          //输出弹出框内容
          System.out.println(al.getText());
          //点击确定
          al.accept();

          Thread.sleep(1000);
          System.out.println("browser will be close");
          driver.quit();  
      }


}

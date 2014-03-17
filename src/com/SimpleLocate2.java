package com;


import java.io.File;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleLocate2 {
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		File file = new File("src/checkbox.htm");
		String filePath = "file://"+file.getAbsolutePath();
		System.out.println("打开进入页面："+filePath);
		driver.get(filePath);
		Thread.sleep(2000);

		List<WebElement> checkboxs = driver.findElements(By.cssSelector("input[type=checkbox]"));
		Thread.sleep(2000);
		//把所有checkboxs都勾选
		for(WebElement checkbox:checkboxs){
			checkbox.click();
		}
		Thread.sleep(2000);
		//刷新后，都变成非选中状态
		//driver.navigate().refresh();
		
		//打印有多少个checkbox
		System.out.printf("有%d个checkbox\n", checkboxs.size());
		
		List<WebElement> inputs = driver.findElements(By.tagName("input"));
		Thread.sleep(2000);
		//反勾选checkbox框
		for(WebElement input:inputs){
			if(input.getAttribute("type").equals("checkbox")){
				input.click();
			}
		}
		Thread.sleep(2000);
		
	 //勾选最后一个checkbox
	 driver.findElements(By.cssSelector("input[type=checkbox]")).get(checkboxs.size()-1).click();
		
	 Thread.sleep(10000);
	 //退出页面
	 System.out.println("blowser will be close");
	 driver.quit();
		
	}

}

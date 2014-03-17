package com;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ButtonGroup13 {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		File file =new File("src/ButtonGroup.htm");
		
		String filepath = "file:///"+file.getAbsolutePath();
		System.out.println("´ò¿ªÒ³Ãæ"+filepath);
		driver.get(filepath);
		driver.manage().window().maximize();
		
		//List<WebElement> elements = driver.findElements(By.cssSelector("div[class=btn]"));
		List<WebElement> elements = driver.findElement(By.className("btn-group")).findElements(By.className("btn"));
		for(WebElement element:elements)
		{
			if((element.getText()).equals("second")){
				
				element.click();
				Thread.sleep(3000);
				driver.switchTo().alert().accept();
				break;
			}
				
		}
		Thread.sleep(2000);
		
		System.out.println("blowser will be closed");
		driver.quit();
	}
}

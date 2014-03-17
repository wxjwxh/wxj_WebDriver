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
		System.out.println("�򿪽���ҳ�棺"+filePath);
		driver.get(filePath);
		Thread.sleep(2000);

		List<WebElement> checkboxs = driver.findElements(By.cssSelector("input[type=checkbox]"));
		Thread.sleep(2000);
		//������checkboxs����ѡ
		for(WebElement checkbox:checkboxs){
			checkbox.click();
		}
		Thread.sleep(2000);
		//ˢ�º󣬶���ɷ�ѡ��״̬
		//driver.navigate().refresh();
		
		//��ӡ�ж��ٸ�checkbox
		System.out.printf("��%d��checkbox\n", checkboxs.size());
		
		List<WebElement> inputs = driver.findElements(By.tagName("input"));
		Thread.sleep(2000);
		//����ѡcheckbox��
		for(WebElement input:inputs){
			if(input.getAttribute("type").equals("checkbox")){
				input.click();
			}
		}
		Thread.sleep(2000);
		
	 //��ѡ���һ��checkbox
	 driver.findElements(By.cssSelector("input[type=checkbox]")).get(checkboxs.size()-1).click();
		
	 Thread.sleep(10000);
	 //�˳�ҳ��
	 System.out.println("blowser will be close");
	 driver.quit();
		
	}

}

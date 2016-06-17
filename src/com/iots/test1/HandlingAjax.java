package com.iots.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingAjax {
static String baseURL;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		baseURL="http://www.amazon.in";
		driver.get(baseURL);
		Actions abc = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[1]"));
		abc.moveToElement(element).build().perform();
		WebElement xyz=driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
		abc.keyDown(Keys.SHIFT).moveToElement(xyz).sendKeys("DELLXPs").build().perform();
		abc.contextClick(xyz).build().perform();
		
	}

}

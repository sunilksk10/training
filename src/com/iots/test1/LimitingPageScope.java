package com.iots.test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LimitingPageScope {
public static String baseURL;
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new FirefoxDriver();
		baseURL="http://www.ebay.com";
		driver.get(baseURL);
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer = driver.findElement(By.xpath(".//*[@id='footerFragment']/div"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement col = driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		System.out.println(col.findElements(By.tagName("a")).size());
		String BeforeClicking = null;
		String AfterClicking;
		
		for (int i = 0; i < col.findElements(By.tagName("a")).size(); i++) 
		{
			//System.out.println(col.findElements(By.tagName("a")).get(i).getText());
			if(col.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
			{
				BeforeClicking = driver.getTitle();
				col.findElements(By.tagName("a")).get(i).click();
				break;
			}
			AfterClicking = driver.getTitle();	
			if(BeforeClicking!=AfterClicking)
			{
				boolean abc = driver.findElement(By.xpath(".//*[@class='gh-w']")).isDisplayed();
				if(abc==true)
				System.out.println("PASS");
			}
			else
			{
				System.out.println("Fail");
			}
		}
			driver.close();
	}

}

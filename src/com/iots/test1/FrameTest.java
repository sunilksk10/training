package com.iots.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {
static String baseURL;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		baseURL="https://netbanking.hdfcbank.com/netbanking/";
		driver.get(baseURL);
		System.out.println(driver.getPageSource());
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("input[class='input_password']")).sendKeys("10101250");
		
	}

}

package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Customizedxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunil\\Downloads\\techie tool\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("sunil.10ksk@gmail.com");
		driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("114211981$un!l");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

}
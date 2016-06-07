package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("http://facebook.com");
driver.findElement(By.id("email")).sendKeys("sunil.10ksk@gmail.com");
driver.findElement(By.id("pass")).sendKeys("1");

//driver.findElement(By.linkText("Forgot your password?")).click();
//driver.findElement(By.partialLinkText("Forgot your")).click();
driver.findElement(By.xpath(".//*[@value='Log In']")).click();
//driver.findElement(By.xpath(".//*[@id='u_0_o']")).click();

	}
}

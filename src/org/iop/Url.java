package org.iop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\eclipse-java-luna-SR2-win32-x86_64\\eclipse\\May23\\Biu\\driver\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	String title=driver.getTitle();
	System.out.print(title);
	String url=driver.getCurrentUrl();
	System.out.print(url);	
	WebElement user=driver.findElement(By.id("email"));
	user.sendKeys("st5216022@gmail.com");
	WebElement pass=driver.findElement(By.id("pass"));
	pass.sendKeys("vhnsdfkbgcfdsvfs");
	WebElement click=driver.findElement(By.id("u_0_b"));
	click.click();
		}

	}




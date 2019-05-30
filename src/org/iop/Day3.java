package org.iop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\eclipse-java-luna-SR2-win32-x86_64\\eclipse\\May23\\Biu\\driver\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.youtube.com/watch?v=I2wMdt9SSoo");
	String title=driver.getTitle();
	System.out.print(title);
	String url=driver.getCurrentUrl();
	System.out.print(url);
	
	WebElement play=driver.findElement(By.className("ytp-large-play-button ytp-button"));
	play.click();
	
	}

	}




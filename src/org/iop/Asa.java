package org.iop;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asa {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Java\\eclipse-java-luna-SR2-win32-x86_64\\eclipse\\May23\\Biu\\driver\\chromedriver.exe ");
WebDriver driver = new ChromeDriver();
		
		//Launching sample website
		driver.get("https://www.google.com/");
		//driver.manage().window().maximize();
		
		//Get list of web-elements with tagName  - a
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int brokenlink=0;int notbrokenlink=0;
		
		//Traversing through the list and printing its text along with link address
		for(WebElement link:allLinks){
			String href = link.getAttribute("href");
			String text = link.getText();
			System.out.println("Link:"+text);
			System.out.println("URL:"+href);
			try
			{
				URL url=new URL("https://www.google.com/");
				HttpURLConnection con=(HttpURLConnection)url.openConnection();
				int code = con.getResponseCode();
				if(code==200)
				{
					System.out.println("Link is a not broken");
					notbrokenlink++;
				}
				else
				{
					System.out.println("Link is a broken");
					System.out.println(con.getResponseMessage());

					brokenlink++;
				}
			}
			
			catch(Exception e)
			{
				System.out.println("Link is broken2:");
				brokenlink++;
			}
			System.out.println("===============================================");
		}
		System.out.println("total number of links:"+allLinks.size());
		System.out.println("Number of Broken Links"+brokenlink);
		System.out.println("Number of non Broken Links"+notbrokenlink);
	
}
}

	

package com.exception;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampleprectice {


	public static void main(String[] args) {

		ChromeDriver S = new ChromeDriver();
		S.get("https://rahulshettyacademy.com/AutomationPractice/");
	    S.findElement(By.id("dropdown-class-example")).sendKeys("option");
	    S.findElement(By.xpath("//input[@value='radio1']")).click();
	    
	    
	
	}

}

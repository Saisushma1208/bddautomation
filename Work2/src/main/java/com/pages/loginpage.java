package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
    public WebDriver driver;
    By username = By.name("email");
    By password = By.id("pass");
    By login = By.id("loginbutton");
    
    
    public loginpage(WebDriver driver) {
		
		this.driver = driver;
	}
    public void Fb_username() {
    	driver.findElement(username).sendKeys("india");
    	}
	public void Fb_password() {
		driver.findElement(password).sendKeys("12345");
		}
	
	public void Fb_login() {
		
		driver.findElement(login).click();
	}

}

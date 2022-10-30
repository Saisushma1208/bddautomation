package three;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Neww {
	
	@Test
	void test1(){

		WebDriverManager.chromedriver().setup();
		ChromeDriver E =new ChromeDriver();
		E.get("https://rahulshettyacademy.com/AutomationPractice//");
		E.manage().window().maximize();
		E.findElement(By.id("dropdown-class-example")).sendKeys("option2");
		//System.out.println(E.findElement(By.id("dropdown-class-example")).getAttribute("value"));
		Assert.assertEquals(E.findElement(By.id("dropdown-class-example")).getAttribute("value"),"option3");
		
		
		
		boolean dis = E.findElement(By.id("autocomplete")).isDisplayed();
				
		   E.findElement(By.id("autocomplete")).sendKeys("india");
		   String actual = E.findElement(By.id("autocomplete")).getAttribute("id");
		  // Assert.assertEquals(dis, false);
		   
		   Assert.assertEquals(actual, "india");
		   
}
}

package three;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login1 {
	ChromeDriver d;
	void enterTextInTextBox(String identifedBy,String idfenficationvalue,String value) {
		if(identifedBy.equals("id"))
			d.findElement(By.id(idfenficationvalue)).sendKeys("sushma");
		else if (identifedBy.equals("name"))
			d.findElement(By.name(idfenficationvalue)).sendKeys(value);
		else
			d.findElement(By.xpath(idfenficationvalue)).sendKeys(value);
		}
	
	void objectClick1(String identifedBy,String idfenficationvalue) {
		if(identifedBy.equals("id"))
			d.findElement(By.id(idfenficationvalue)).click();
		else if (identifedBy.equals("name"))
			d.findElement(By.id(idfenficationvalue)).click();
		else
			d.findElement(By.xpath(idfenficationvalue)).click();	
	}
	
	public static void main(String[] args) {
      WebDriverManager.chromedriver().setup();
      Login1 h=new Login1();
      h.d=new ChromeDriver();
      h.d.get("https://rahulshettyacademy.com/AutomationPractice/");
      //autocomplete
      h.enterTextInTextBox("id","autocomplete","saisushma");
      h.objectClick1("xpath","//input[@value='radio2']");
	}
		
	}



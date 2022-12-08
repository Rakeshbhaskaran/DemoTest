package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ktmTest {

	public ktmTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void ktm() {
	WebDriverManager.chromedriver().setup();
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.ktm.com/en-in.html");
	d.quit();	
		
		
	}

}

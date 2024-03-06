package JavaClassPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaClass {
	
	WebDriver driver = new ChromeDriver();
	String website = "https://www.google.com";
	
	@BeforeTest 
	
	public void myBeforTest() {
		
		
		String myname = "Toqa Aqeel";
		
		System.out.println(myname.charAt(2));
		System.out.println(myname.contains("m"));
		
		
//		String website = "https://www.google.com";
		
		
		
		
	}
	
	
	@Test
	
	public void myfirstTest() {
		
		
		driver.get(website.toUpperCase());

		String name = "Toqa";
		
		
	}
	
	
	@AfterTest
	
	public void myfirstAfterTest() {
		
		
	}
	
	

}

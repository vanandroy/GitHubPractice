package PracticeCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice1 {
	
	@Test
	public static void Lead() {
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println(c);
		WebDriver driver=new ChromeDriver();
		driver.get("");
	}

}
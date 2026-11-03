package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TdemoTest {
	@Test
	public void createsampletest() {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("sample created");
		driver.quit();
	}

}
	


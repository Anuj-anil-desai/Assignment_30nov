package testngprogram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assinment_nov30 {
	
	
	
	
	@Test()
	public static void verify_Inquary_fileds() {
		
		WebDriver driver1=new WebDriver(System.getProperty("D:\\selenium file\\drive\\chromedriver.exe"));		
		ChromeDriver driver =new ChromeDriver();
		
		
		driver.get("https://techpub-connect-demo.netlify.app/html/contactus.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000l));
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Test data");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9256365121");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Inquary");
		driver.findElement(By.xpath("//textarea[@name=\"commnent\"]")).sendKeys("test data inquary");
		driver.findElement(By.xpath("(//button)[1]")).click();
		driver.close();
	}

}

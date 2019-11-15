package FirstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "F:/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jesi.tamil09@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Mahasvin@2013");
		//driver.findElement(By.xpath("//input[@id='u_0_2']")).click();
		driver.findElement(By.xpath("//button[@name='login']")).click();
		//button[@id='loginbutton']
		
		//driver.quit();
		
		//ORANGEHRM
		//ADMIN
		//ADMIN

	}

}

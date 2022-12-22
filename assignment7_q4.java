import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment7_q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(driver.getCurrentUrl());
		
		if(driver.getCurrentUrl().contains("dashboard")) {
			
			System.out.println("yes, it consists of dashboard");
		}
		
driver.findElement(By.xpath("//li/span/img")).click();
driver.findElement(By.linkText("Logout")).click();

if(driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")) {
	System.out.println("user is navigated to login page");
}

driver.close();
	}

}

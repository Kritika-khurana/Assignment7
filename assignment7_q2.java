import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment7_q2 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub

			
			

			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
				
			
			WebElement PR = driver.findElement(By.xpath("//input[@name='password']//following::span"));

			if (PR.getText().equals("Required")) {

				System.out.println("Password field is required to login ");

			}
			driver.quit();
		}
}
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_7_q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Task 1 Open below application
		 * https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		 * 
		 * Click on login button (No need to enter login details)
		 * 
		 * Verify required fields present for username and password
		 * 
		 * Verify that username and password have border of 1px. Note- use
		 * getCssProperty to fetch css details
		 */

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String u = driver.findElement(By.name("username")).getCssValue("border");
		String p = driver.findElement(By.name("password")).getCssValue("border");
		if ((u.contains("1px")) && (p.contains("1px"))) {

			System.out.println("border size of username & password is 1 px");

		}
		WebElement UR = driver.findElement(By.xpath("//input[@name='username']//following::span[1]"));
		WebElement PR = driver.findElement(By.xpath("//input[@name='password']//following::span"));

		if (UR.getText().equals("Required") && (PR.getText().equals("Required"))) {

			System.out.println("UserName & Password fields are required to login ");

		}
		driver.quit();
	}
}

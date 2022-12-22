import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment7_q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("mukesh");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//p[text()='Invalid credentials']
		WebElement message=driver.findElement(By.xpath("//p[text()='Invalid credentials']"));
		if(message.getText().equalsIgnoreCase("invalid credentials")) {
			
			System.out.println("the message we are getting is "+message.getText());
		}
		
		
		
		driver.quit();

	}

}

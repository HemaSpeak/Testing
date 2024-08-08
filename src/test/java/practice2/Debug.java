package practice2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Debug {

	public static void main(String[] args) {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\hemas\\Downloads\\edgedriver_win64");
		WebDriver driver = new EdgeDriver();

		
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.findElement(By.id("mail")).sendKeys("hema");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement until=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("mail")));
		until.sendKeys("hema");
		
		
	}

}

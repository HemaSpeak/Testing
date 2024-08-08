package practice2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Website {

	
		public static void main(String[] args) throws IOException, Throwable {
			System.setProperty("webdriver.Chrome.driver", "C:\\Users\\hemas\\Downloads\\edgedriver_win64");
			WebDriver driver = new EdgeDriver();

			// driver.navigate().to("https://www.naukri.com/registration/createAccount?othersrcp=22636");
			driver.navigate().to("https://chercher.tech/practice/frames-example-selenium-webdriver");
			 driver.manage().window().maximize();
			 driver.findElement(By.xpath("//h2[contains(text(),'experienced')]")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//button[contains(@class,'uploadResume')]")).click();
			 Runtime.getRuntime().exec("C:\\Users\\hemas\\OneDrive\\Documents\\FileUpload1.exe");
			driver.switchTo().frame("frame1");
			 /*String title=driver.getTitle();
			 System.out.println(title);
			 String url=driver.getCurrentUrl();
			 System.out.println(url);
			 String currenturl=driver.getCurrentUrl();
			 System.out.println(currenturl);
			WebElement usernametext=driver.findElement(By.id("email"));
			usernametext.sendKeys("hemaspeaksu@facebook.com");
			WebElement userpassword=driver.findElement(By.id("pass"));
		   userpassword.sendKeys("Motiv");
	       //	driver.findElement(By.linkText(""))
			// driver.switchTo().newWindow(WindowType.TAB);
			// driver.navigate().back();
			// driver.navigate().forward();
			// driver.navigate().refresh();
			// driver.close();*/
			 

	}

}

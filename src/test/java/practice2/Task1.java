package practice2;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\hemas\\Downloads\\edgedriver_win64");
		WebDriver driver = new EdgeDriver();

		
		driver.navigate().to("https://www.flipkart.com");
		
		driver.manage().window().maximize();
		
		List<String> l = new LinkedList<>();
		List<String> l2 = new LinkedList<>();
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Redmi mobiles",Keys.ENTER);
		List<WebElement> w = driver.findElements(By.xpath("//div[@class=\"KzDlHZ\"]"));
		List<WebElement> d = driver.findElements(By.xpath("//div[@class=\"Nx9bqj _4b5DiR\"]"));
		for(WebElement x:w) {
			String j = x.getText();
			System.out.println(j);
			l.add(j);
		}
		for(WebElement x1:d) {
			String k = x1.getText();
			System.out.println(k);
			l2.add(k);
		}
		l.addAll(l2);
		System.out.println(l);
		l2.addAll(l);
		System.out.println(l2);
		
		

	}

}

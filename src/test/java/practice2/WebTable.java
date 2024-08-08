package practice2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\hemas\\Downloads\\edgedriver_win64");
		WebDriver driver = new EdgeDriver();

		
		driver.navigate().to("https://demo.guru99.com/test/web-table-element.php");
		WebElement table = driver.findElement(By.xpath("//table[@class=\"dataTable\"]"));
		List<WebElement>v=table.findElements(By.tagName("tr"));
		for(int i=0;i<v.size();i++)
		{
			WebElement c=v.get(i);
			List<WebElement> tdata=c.findElements(By.tagName("td"));
			for(int j=0;j<tdata.size();j++)
			{
				WebElement data=tdata.get(j);
				String text=data.getText();
				String b="Apollo Hospitals";
				if(text.equals(b)) {
					System.out.println(v.get(i).getText());
				}
			}
		}

	}

}


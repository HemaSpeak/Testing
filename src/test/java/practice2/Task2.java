package practice2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.collect.Table.Cell;

public class Task2 {

	public static void main(String[] args) throws Throwable {
		
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
File f = new File("C:\\Users\\hemas\\OneDrive\\Desktop\\excel1.xlsx");

XSSFWorkbook v = new XSSFWorkbook();
XSSFSheet h = v.createSheet("abc");
for(int i = 0;i<l.size();i++)
{
	XSSFRow row =h.createRow(i);
	XSSFCell cell=row.createCell(0);
	cell.setCellValue(l.get(i));
	
}
for(int i = 0;i<l2.size();i++) {
	XSSFRow row =h.getRow(i);
	if (row==null) {
		row=h.createRow(i);
		
	}
	XSSFCell cell= row.createCell(1);
	cell.setCellValue(l2.get(i));
}
FileOutputStream f1 = new FileOutputStream(f);
v.write(f1);
f1.close();
	}

}

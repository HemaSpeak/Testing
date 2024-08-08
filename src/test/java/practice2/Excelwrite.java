package practice2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class Excelwrite {

	public static void main(String[] args) throws Throwable {
		File f = new File ("\\Users\\hemas\\OneDrive\\Desktop\\excel.xlsx");
		XSSFWorkbook w = new XSSFWorkbook();
		XSSFSheet s = w.createSheet("abc");
		XSSFRow r = s.createRow(0);
		for(int i=0;i<10;i++) {
			XSSFCell c = r.createCell(i);
			c.setCellValue("Testing");
		}
		
		
		FileOutputStream f2 = new FileOutputStream(f);
		w.write(f2);
		f2.close();
		
	}

}

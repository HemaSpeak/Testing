package practice2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Testing {

	public static void main(String[] args) throws Throwable {
	
		File f = new File ("\\Users\\hemas\\OneDrive\\Desktop\\excel.xlsx");
		FileInputStream f1=new FileInputStream(f);
		XSSFWorkbook w = new XSSFWorkbook(f1);
		XSSFSheet s = w.getSheet("abc");
		int rows=s.getPhysicalNumberOfRows();
		for(int i =0 ;i<rows;i++)
		{
			XSSFRow r = s.getRow(i);
			int cellsize= r.getPhysicalNumberOfCells();
			for(int j=0;j<cellsize;j++)
			{
				XSSFCell cell = r.getCell(j);
				int cellType = cell.getCellType();
				if(cellType==1) {
					String value = cell.getStringCellValue();
					System.out.println(value);
				}
				else if (cellType==0)
				{
					if (DateUtil.isCellDateFormatted(cell)) {
						Date d=cell.getDateCellValue();
						System.out.println(d);
						SimpleDateFormat sd = new SimpleDateFormat("MMMM/dd/yyyy");
						String value = sd.format(d);
						System.out.println(value);
					}
				}
				
			}
		}

	}

}

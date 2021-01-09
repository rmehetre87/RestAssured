package Utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	public ExcelUtils(String excelpath, String sheetname) {
		try {
			
		 workbook = new XSSFWorkbook(excelpath);
		 sheet = workbook.getSheet(sheetname);
		 
		}catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
	}
	
	public static void getcelldata(int rownum, int colnum) {
		
		DataFormatter format = new DataFormatter();
		Object value = format.formatCellValue(sheet.getRow(rownum).getCell(colnum));
		System.out.println(value);
			
	}
	
	public static void getrowcount() {
				
		int rowcount = sheet.getPhysicalNumberOfRows();
		System.out.println("no of rows = "+rowcount);
	
		
	}


}

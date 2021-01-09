package Utils;

public class ExcelUtiltest {
	
	public static void main(String[] args) {
		
		String excelpath = "./data/Testdata_Rest.xlsx";
		String sheetname = "Sheet1";
		
		ExcelUtils excel = new ExcelUtils(excelpath, sheetname);
		
		excel.getrowcount();
		excel.getcelldata(1,0);
		excel.getcelldata(1,1);
		excel.getcelldata(1,2);		
		
	}
	
	

}

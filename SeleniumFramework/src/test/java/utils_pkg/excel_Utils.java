package utils_pkg;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_Utils {

//	static String excelPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	//constructor
	public excel_Utils(String excelPath, String sheetName) {
		try {
			//this is used for both xlsx and xls workbook
			workbook = new XSSFWorkbook(excelPath);
			//for the reefrence to the sheet
			sheet = workbook.getSheet(sheetName);
		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
	
	//Main Method
	public static void main(String[] args) {
		get_RowCount();
		get_CellData_String(0,0);
        get_CellData_Number(1,1);

	}
	
	
	//Method to get the row count
	public static int get_RowCount() {
		int rowCnt = 0;
		try {
	
			rowCnt = sheet.getPhysicalNumberOfRows(); //getting the # of rows in the file
			System.out.println("No of rows: "+ rowCnt);
			
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return rowCnt;
		
		
		//for old excelformat (xls) the below can be used
		//HSSFWorkbook workbook = new HSSFWorkbook("excel file location");
	}
	

	//Method to the column count
	public static int get_ColCount() {
		int colCnt = 0;
		try {
			colCnt = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No of columns: "+ colCnt);
			
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return colCnt;
		
	}
	
	
	//Method to get the string data values from the excel test data
	public static String get_CellData_String(int rowNum, int colNum) {
		String cellData = null;
		try {
			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
//			System.out.println("Cell Data: " + cellData);
			
		}
		catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return cellData;
		
	}
	
	//Method to get the numeric data values from the excel test data
	public static void get_CellData_Number(int rowNum, int colNum ) {
		try {
			double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println("Cell Data: " + cellData);
			
		}
		catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
	}
}

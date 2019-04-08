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
	public static void get_RowCount() {
		
		try {
	
			int rowCnt = sheet.getPhysicalNumberOfRows(); //getting the # of rows in the file
			System.out.println("No of rows: "+ rowCnt);
			
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
		
		//for old excelformat (xls) the below can be used
		//HSSFWorkbook workbook = new HSSFWorkbook("excel file location");
	}
	
	//Method to get the string data values from the excel test data
	public static void get_CellData_String(int rowNum, int colNum) {
		try {
			String cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println("Cell Data: " + cellData);
			
		}
		catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
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

package utils_pkg;

import org.testng.annotations.DataProvider;

public class excel_DataProvider {

	//removed main method as using testng annotations 
	/*	public static void main(String[] args) {
		   String excelpth = System.getProperty("user.dir"); 
		   String excelPath = 	excelpth+ "\\excel_Files\\TestData.xlsx";
		   test_Data(excelPath,"Sheet1");	
		} */
	
	//getting the data values from excel to the data object
	@DataProvider(name = "testdata1")
	public Object[][] getdata() {
		   String excelpth = System.getProperty("user.dir"); 
		   String excelPath = 	excelpth+ "\\excel_Files\\TestData.xlsx";
		   Object data[][] = test_Data(excelPath,"Sheet1");	
		   return data;

	}
	
	public static Object[][] test_Data(String excelPath, String sheetName) {
		excel_Utils excel = new excel_Utils(excelPath, sheetName);
		
		int rowCount = excel.get_RowCount();
		int colCount = excel.get_ColCount();
		Object data[][] = new Object[rowCount-1][colCount];
		for(int i=1; i<rowCount; i++) {
			for(int j=0; j<colCount; j++) {
				String cellData = excel.get_CellData_String(i, j);
				System.out.print(cellData+" | ");
				data[i-1][j] = cellData;
			}
			System.out.println();
		}
		return data;
	}
}

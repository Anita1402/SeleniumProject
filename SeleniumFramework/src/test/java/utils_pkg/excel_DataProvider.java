package utils_pkg;

public class excel_DataProvider {
	public static void main(String[] args) {
		   String excelPath = 	"C:\\Users\\Anita\\git\\SeleniumProject\\SeleniumFramework\\excel_Files\\TestData.xlsx";
		   test_Data(excelPath,"Sheet1");	
		}
	
	public static void test_Data(String excelPath, String sheetName) {
		excel_Utils excel = new excel_Utils(excelPath, sheetName);
		
		int rowCount = excel_Utils.get_ColCount();
		int colCount = excel_Utils.get_RowCount();
		
		for(int i=1; i<rowCount; i++) {
			for(int j=0; j<colCount; j++) {
				String cellData = excel_Utils.get_CellData_String(i, j);
				System.out.println(cellData + " | ");
			}
			System.out.println();
		}
		
	}
}

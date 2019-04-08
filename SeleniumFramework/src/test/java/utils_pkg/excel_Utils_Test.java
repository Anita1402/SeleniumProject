package utils_pkg;

public class excel_Utils_Test {
	
	
	public static void main(String[] args) {

		String excelPath = System.getProperty("user.dir");
		excel_Utils excels = new excel_Utils(excelPath+"/excel_Files/TestData.xlsx", "Sheet1");

		excels.get_RowCount();
		excels.get_CellData_String(0, 0);
		excels.get_CellData_Number(1, 1);
	}

	
	


}

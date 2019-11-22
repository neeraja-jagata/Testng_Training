package parameterization;

import utilities.ExcelReader;

public class ExcelReadingTest {

	public static void main(String[] args) {
     
		ExcelReader excel=new ExcelReader("C:\\Users\\Neeraja\\Documents\\study\\udemy\\TestData\\testngData.xlsx");
		
		String sheetName="loginTest";
		int rows=excel.getRowCount(sheetName);
		int cols= excel.getColumnCount(sheetName);
		String[][] data=new String[rows-1][cols];
		System.out.println("rows-->"+rows+"		cols-->"+cols);
		for(int rowNum=2; rowNum<=rows; rowNum++) {
			for(int colNum=0; colNum<cols; colNum++) {
				data[rowNum-2][colNum]=excel.getCellData(sheetName, colNum, rowNum);
			}
		}
		for(int i=0;i<rows-1;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(data[i][j]+"	");
			}
		}


	}

}

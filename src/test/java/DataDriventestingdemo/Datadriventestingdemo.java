package DataDriventestingdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriventestingdemo {

	public static void main(String[] args) {

		// for data driven testing we will add dependency of apachepoi and poioopxml in
		// pom.xml
		XSSFWorkbook ExcelWbook = null;// for accessing workbook
		XSSFSheet ExcelWsheet;// for accessing sheet
		XSSFRow Row;// access of row
		XSSFCell Cell;// access of cell

		// create an object of class to open file
		File excelFile = new File("C:\\excel\\hamza.xlsx");
		FileInputStream inputstream = null;

		// create an object of fileInputStream to read data from file
		try {
			inputstream = new FileInputStream(excelFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// excel--workbook--sheet--row--cell
		// create onject of xssf workbook to handle excel file
		try {
			ExcelWbook = new XSSFWorkbook(inputstream);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// to access workbook sheet
		ExcelWsheet = ExcelWbook.getSheetAt(0);
		// get total row count
		int ttlRows = ExcelWsheet.getLastRowNum();
		// get total no of cells
		int ttlColumns = ExcelWsheet.getRow(0).getLastCellNum();

		for (int currentRow = 0; currentRow < ttlRows; currentRow++) {
			for (int currentCell = 0; currentCell < ttlColumns; currentCell++) {
				System.out.println(ExcelWsheet.getRow(currentRow).getCell(currentCell).toString());
				System.out.println("\t");// for new tab

			}
			System.out.println("\n");// new line
		}
		try {
			ExcelWbook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

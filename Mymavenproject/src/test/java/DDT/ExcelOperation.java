package DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelOperation {
	@Test
	public void performOpeartion() throws IOException {
		FileInputStream file = new FileInputStream(".\\src\\test\\resources\\ExcelData\\execl1.xlsx");
		Workbook workbook = new XSSFWorkbook(file);
		int sheetcount=workbook.getNumberOfSheets();
		System.out.println("sheet count: "+sheetcount);
		for(int i=0; i<sheetcount;i++) {
			System.out.println("sheet name: "+workbook.getSheetName(i));
		}
		workbook.createSheet("TestSheet");
		//workbook.removeSheetAt(2);
		
		Sheet sheet = workbook.getSheet("Sheet1");
		String st=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(st);
		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);
		Row row = sheet.getRow(1);
		int cellcount = row.getLastCellNum();
		System.out.println(cellcount);FileOutputStream fout = new FileOutputStream(".\\src\\test\\resources\\ExcelData\\execl1.xlsx");
		workbook.write(fout);
		fout.flush();
		fout.close();
	}
}


import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.management.RuntimeErrorException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws Exception {
		try {
			FileInputStream fileinputstream = new FileInputStream(
					"C:/Users/Lenovo/eclipse-workspace/mavenproject/src/main/resources/Book1.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fileinputstream);
			XSSFSheet sheet = workbook.getSheet("sheet1");
			for (int i = 1; i <= sheet.getLastRowNum(); i++) {
				Row row = sheet.getRow(i);
				for (int j = 0; j < row.getLastCellNum(); j++) {
					Cell cell = row.getCell(j);
					switch (cell.getCellType().getCode()) {
					case 1:
						System.out.println(cell.getStringCellValue());
						break;
					case 0:
						System.out.println(cell.getNumericCellValue());
						break;

					}
				}
			}

			workbook.close();

		} catch (Exception e) {
			throw new Exception(e);
		}

	}

}

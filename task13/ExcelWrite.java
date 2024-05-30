
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws Exception {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("student Details");

		Map<String, Object[]> data = new TreeMap<String, Object[]>();

		data.put("1", new Object[] { "Name", "Age", "Email" });
		data.put("2", new Object[] { "John Doe", "30", "johm@test.com" });
		data.put("3", new Object[] { "Jane Doe", "28", "john@test.com" });
		data.put("4", new Object[] { "Bob Smith", "35", "jacky@example.com" });
		data.put("5", new Object[] { "Swapnil", "37", "swapnil@example.com" });

		// Iterating over data and writing it to sheet
		Set<String> keyset = data.keySet();

		int rownum = 0;

		for (String key : keyset) {

			// Creating a new row in the sheet
			XSSFRow row = sheet.createRow(rownum++);

			Object[] objArr = data.get(key);

			int cellnum = 0;

			for (Object obj : objArr) {

				// This line creates a cell in the next
				// column of that row
				XSSFCell cell = row.createCell(cellnum++);

				if (obj instanceof String)
					cell.setCellValue((String) obj);

				else if (obj instanceof Integer)
					cell.setCellValue((Integer) obj);
			}
		}

		// Try block to check for exceptions
		try {

			// Writing the workbook
			FileOutputStream out = new FileOutputStream(
					("C:/Users/Lenovo/eclipse-workspace/mavenproject/src/main/resources/Book1.xlsx"));
			workbook.write(out);

			System.out.println("excel sheet write successfull");

		} catch (Exception e) {

			throw new Exception();
		}
	}
}

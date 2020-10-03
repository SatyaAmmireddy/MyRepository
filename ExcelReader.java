package ExcelReaderData;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	private static String s = "Sheet1";
	private static String s1 = "C:\\Users\\sathya ammireddy\\Desktop\\TestData.xlsx";
	private static int iteration=0;
	
	 
	public Map<String, String> get(String testcasename, String columnName1, String columnName2) throws Exception {
		Map<String, String> map = new HashMap(); 
		FileInputStream fis;
		 fis = new FileInputStream(s1);
		 XSSFWorkbook wb = new XSSFWorkbook(fis);
		 XSSFSheet ws = wb.getSheet(s);
		 int rows = ws.getLastRowNum();
		 String fromCity = null;
		 String toCity = null;
		 System.out.println(ws.getRow(iteration+1).getCell(0).getStringCellValue());
		 if(testcasename.equalsIgnoreCase(ws.getRow(iteration+1).getCell(0).getStringCellValue()) && rows == iteration) {
			 if(columnName1.equalsIgnoreCase(ws.getRow(0).getCell(1).getStringCellValue()) && columnName2.equalsIgnoreCase(ws.getRow(0).getCell(2).getStringCellValue())) {
				 fromCity = ws.getRow(iteration+1).getCell(1).getStringCellValue();
				 toCity = ws.getRow(iteration+1).getCell(2).getStringCellValue();
				 map.put(fromCity, toCity);
			 }
		 }
		 
		 
//		 for(int i=1;i<=rows;i++){
//			 if(testcasename.equalsIgnoreCase(ws.getRow(i).getCell(0).getStringCellValue())){
//				fromCity = ws.getRow(i).getCell(1).getStringCellValue();
//				toCity = ws.getRow(i).getCell(2).getStringCellValue();
//				if(columnName.equalsIgnoreCase("Source")) {
//					return fromCity;
//				}
//				else {
//					return toCity;
//				}
//			 }
//		 }
		 iteration++;
		 return map;
	}
}

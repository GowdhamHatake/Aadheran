package ecom.boss.test.bas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Hell {
	
public static void main(String[] args) throws IOException {
	
File f = new File("C:\\Users\\Hp\\eclipse-workspace\\Base1\\Excel\\Mons.xlsx");

Workbook wb = new XSSFWorkbook();

Sheet sheet = wb.createSheet("Rat1");

Row row = sheet.createRow(5);

Cell cell = row.createCell(6);

cell.setCellValue(548.25416);

FileOutputStream fos = new FileOutputStream(f);
wb.write(fos);
System.out.println("Done");

}

}

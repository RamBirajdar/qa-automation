package testNGpractice;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDrivernTest {
  
	public static void main(String args[]) throws BiffException, IOException {
		File f = new File("F:/Selenium_Test Data/Input.xlsx");
		Workbook w = Workbook.getWorkbook(f);
		Sheet s = w.getSheet("Sheet1");
		
		int rows = s.getRows();
		
		System.out.println(rows);
		
	}
}

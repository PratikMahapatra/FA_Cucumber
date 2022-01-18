package com.mindtree.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWrite {
	Workbook workbook;
	Object[][] data;
	FileInputStream inputStream;
	Sheet sheet = null;

	public ExcelReadWrite(String path) {
		try {
			inputStream = new FileInputStream(new File(path));
			workbook = new XSSFWorkbook(inputStream);
			sheet = workbook.getSheetAt(0);
			workbook.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Object[][] readExcel() {
		int rowNumber = sheet.getLastRowNum() + 1;
		int colNumber = sheet.getRow(0).getLastCellNum();
		data = new Object[rowNumber][colNumber];
		for (int i = 0; i < rowNumber; i++) {
			for (int j = 0; j < colNumber; j++) {
				data[i][j] = sheet.getRow(i).getCell(j).toString();
			}
		}
		return data;
	}

}

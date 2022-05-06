package com.UtilsLayer;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.BaseLayer.BaseClass;

public class ExcelReader extends BaseClass {
	public static XSSFWorkbook workbook;

	public ExcelReader(String path) {
		File f = new File(path);

		try {
			FileInputStream fis = new FileInputStream(f);

			workbook = new XSSFWorkbook(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getDataFromExcel(int sheetIndex, int rows, int columns) {
		return workbook.getSheetAt(sheetIndex).getRow(rows).getCell(columns).getStringCellValue();
	}

	public int countTotalRows(int sheetIndex) {
		return workbook.getSheetAt(sheetIndex).getLastRowNum();
	}

	public int countTotalColumns(int sheetIndex) {
		return workbook.getSheetAt(sheetIndex).getRow(0).getLastCellNum();
	}

}

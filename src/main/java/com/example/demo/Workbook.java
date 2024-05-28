package com.example.demo;

import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Workbook {
	
	
	
	private XSSFWorkbook generateExcel(List<ExamRecord> examRecords) {
	    XSSFWorkbook workbook = new XSSFWorkbook();
	    XSSFSheet sheet = workbook.createSheet("Exam Records");

	    // Create header row
	    Row headerRow = sheet.createRow(0);
	    headerRow.createCell(0).setCellValue("ID");
	    headerRow.createCell(1).setCellValue("Student Name");
	    headerRow.createCell(2).setCellValue("Exam Year");
	    headerRow.createCell(3).setCellValue("Score");

	    // Populate data rows
	    int rowNum = 1;
	    for (ExamRecord record : examRecords) {
	        Row dataRow = sheet.createRow(rowNum++);
	        dataRow.createCell(0).setCellValue(record.getId());
	        dataRow.createCell(1).setCellValue(record.getStudentName());
	        dataRow.createCell(2).setCellValue(record.getExamYear());
	        dataRow.createCell(3).setCellValue(record.getScore());
	    }

	    return workbook;
	}


}

package com.example.demo;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//ExamRecordController.java (Controller)
@RestController
@RequestMapping("/api/exam-records")
public class ExamRecordController {
 @Autowired
 private ExamRecordService examRecordService;

 @GetMapping("/export-excel")
 public void exportExcel(HttpServletResponse response) throws IOException {
     XSSFWorkbook workbook = examRecordService.generateExcel();

     // Set response headers
     response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
     response.setHeader("Content-Disposition", "attachment; filename=exam_records.xlsx");

     // Write workbook to response output stream
     workbook.write(response.getOutputStream());
     workbook.close();
 }
}
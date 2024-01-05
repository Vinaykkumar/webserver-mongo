//package com.example.demo.contr;
//import org.apache.poi.ss.usermodel.*;
//
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//public class ExcelUtils {
//
//    public static void readExcel(String filePath) throws IOException {
//        try (Workbook workbook = WorkbookFactory.create(new FileInputStream(filePath))) {
//            // Your code to read from the workbook
//        }
//    }
//
//    public static void writeExcel(String filePath, String sheetName) throws IOException {
//        try (Workbook workbook = new XSSFWorkbook()) {
//            Sheet sheet = workbook.createSheet(sheetName);
//            // Your code to write to the workbook
//
//            try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
//                workbook.write(fileOut);
//            }
//        }
//    }
//}

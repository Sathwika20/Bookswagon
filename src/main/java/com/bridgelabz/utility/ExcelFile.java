package com.bridgelabz.utility;

import com.bridgelabz.base.Base;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFile extends Base {
    static String projectPath;
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

    public ExcelFile(String excelFileName,String sheetName){
        try {
            projectPath = System.getProperty("user.dir");
            workbook = new XSSFWorkbook(projectPath+"/"+ excelFileName);
            sheet = workbook.getSheet(sheetName);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    //getRowCount() method counts the No.Of.Rows from the excelSheet
    public  int getRowCount() {
        int rowCount = 0;
        try {
            //to get the rows from the sheet
            rowCount = sheet.getPhysicalNumberOfRows();
            //RowCount = sheet.getLastRowNum();
            System.out.println("Number of rows : "+rowCount);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
        return rowCount;
    }
    //getColCount() method counts the No.Of.Columns from the excelSheet
    public  int getColCount() {
        int colCount = 0;
        try {
            //to get columns from the sheet
            colCount = sheet.getRow(0).getPhysicalNumberOfCells();
//            colCount = sheet.getRow(0).getLastCellNum();
            System.out.println("Number of columns : "+colCount);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
        return colCount;
    }
    //getCellData() method is used to get the cellData from the excelSheet
    public  String getCellData(int rowNum,int colNum) {
        String cellData = null;
        try {
            DataFormatter dataFormatter = new DataFormatter();
            //getRow returns a row and getCell returns the cell value representing a column
            cellData = dataFormatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
//            cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
            System.out.println("Data is : "+cellData);
        } catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();

        }
        return cellData;

    }
}

package com.bridgelabz.utility;

import com.bridgelabz.base.Base;
import org.testng.annotations.DataProvider;

public class ReadExcel extends Base {
    @DataProvider(name = "data-provider")
    public static Object[][] testData(){
        //creating the object for ExcelUtils Class
        ExcelFile excel = new ExcelFile("ExcelFile.xlsx", "Sheet1");
        int rowCount = excel.getRowCount();
        int colCount = excel.getColCount();
        //We create a 2D Array
        //We write rowCount-1 because 1 is considered as 0, As per java total number of rows will be row+1 including 0 but practically they are equal to rows
        //So we write rowCount-1
        Object[][] data = new Object[rowCount - 1][colCount];
        //For loop for rowCount
        for(int i=1;i<rowCount;i++){
            //For loop for columnCount
            for(int j=0;j<colCount;j++){
                //We store the rows and columns value in cellData
                String cellData = excel.getCellData(i,j);
                System.out.print(cellData+" | ");
                data[i-1][j] = cellData;
            }
            System.out.println();
        }
        return data;
    }
}

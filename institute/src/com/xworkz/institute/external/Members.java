package com.xworkz.institute.external;



import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Members {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Items_db";
        String excelPath = "D:\\Spring\\details.xlsx";
        String username = "root";
        String password = "root";
        String insertQuery = "INSERT INTO Items_tb VALUES (?,?,?,?,?,?)";
        try (FileInputStream fis = new FileInputStream(excelPath);
             Workbook workbook = new XSSFWorkbook(fis);
             Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Sheet sheet = workbook.getSheetAt(0);
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                int Product_Id = (int) row.getCell(0).getNumericCellValue();
                String Product_Name = row.getCell(1).getStringCellValue();
                String Product_Brand = row.getCell(2).getStringCellValue();
                long Product_Price = (long) row.getCell(3).getNumericCellValue();
                float Product_rating = (float) row.getCell(4).getNumericCellValue();
                int Product_Count = (int) row.getCell(5).getNumericCellValue();
                preparedStatement.setInt(1, Product_Id);
                preparedStatement.setString(2, Product_Name);
                preparedStatement.setString(3, Product_Brand);
                preparedStatement.setLong(4, Product_Price);
                preparedStatement.setFloat(5, Product_rating);
                preparedStatement.setInt(6, Product_Count);
            }
            preparedStatement.executeBatch();
            System.out.println("Excel data inserted into database successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

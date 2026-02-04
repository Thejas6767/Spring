package com.xworkz.ceo.external;


import com.xworkz.ceo.entity.CeoEntity;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.io.FileInputStream;
import java.io.IOException;

public class CeoRunner {
    public static void main(String[] args) {

        String excelPath = "D:\\ceo.xlsx";

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("student");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try (FileInputStream fis = new FileInputStream(excelPath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            tx.begin();

            Sheet sheet = workbook.getSheetAt(0);

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);

                CeoEntity ceo = new CeoEntity();

                ceo.setCeoId((int) row.getCell(0).getNumericCellValue());
                ceo.setCeoName(row.getCell(1).getStringCellValue());
                ceo.setCompanyName(row.getCell(2).getStringCellValue());
                ceo.setNetWorth(row.getCell(3).getNumericCellValue());

                em.persist(ceo);
            }

            tx.commit();
            System.out.println("CEO data inserted successfully!");

        } catch (IOException e) {
            if (tx.isActive()) tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }
}
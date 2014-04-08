/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harkon.jdocs.main;

import com.harkon.jdocs.utils.WorksheetUtil;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class Main_old {

    public static void main(String args[]) {
//        try {
//            //create a POIFSFileSystem object to read the data
//            POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream("c:/Users/Harris/Desktop/kino/kino_2012_01.xls"));
//            // create a workbook out of the input stream
//            HSSFWorkbook wb = new HSSFWorkbook(fs);
//            // get a reference to the worksheet
//            HSSFSheet sheet = wb.getSheetAt(0);
//
//            for (int i=0;i<sheet.getLastRowNum();i++){
//                System.out.println(sheet.getRow(i).cellIterator());
//            }
//        } catch (IOException ex) {
//            Logger.getLogger(Main_old.class.getName()).log(Level.SEVERE, null, ex);
//        }

//        HSSFSheet sheet = WorksheetUtil.getWorksheet("c:/Users/Harris/Desktop/kino/kino_2012_01.xls");
//        String r = sheet.getRow(2).getCell(0).getStringCellValue();
//        System.out.println(r);

    }
}

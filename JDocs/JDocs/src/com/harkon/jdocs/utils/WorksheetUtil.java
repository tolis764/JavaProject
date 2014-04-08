/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.harkon.jdocs.utils;

//import com.sun.star.io.IOException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

/**
 *
 * @author HaRRiSK
 */

public class WorksheetUtil {

    private static HSSFSheet worksheet;

    static {

         

    }
    public static HSSFSheet getWorksheet (String fullname){
        try {
            //create a POIFSFileSystem object to read the data
            POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream(fullname));
            // create a workbook out of the input stream
            HSSFWorkbook wb = new HSSFWorkbook(fs);
            // get a reference to the worksheet
            worksheet = wb.getSheetAt(0);

//            for (int i=0;i<sheet.getLastRowNum();i++){
//                System.out.println(sheet.getRow(i).cellIterator());
//            }
        } catch (IOException ex) {
            Logger.getLogger(WorksheetUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return worksheet;
    }



}

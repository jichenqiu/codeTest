/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceltest;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jxl.Cell;
import jxl.NumberCell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 *
 * @author 纪晨秋
 */
public class Exceltext {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            /* try {
           Workbook book= Workbook.getWorkbook(new File("F://班级工作/储运14-5班 成绩表.xls"));
           for (int m = 0; m < book.getNumberOfSheets(); m++) {
           Sheet sheet=book.getSheet(m);
           for (int i = 0; i <sheet.getRows() ; i++) {
           for (int j = 0; j < sheet.getColumns(); j++) {
           Cell cell=sheet.getCell(j, i);
           String cellinfo=cell.getContents();
           System.out.print(cellinfo+"\t\t") ;
           }
           System.out.println();
           }
           }
           book.close();
           } catch (IOException ex) {
           Logger.getLogger(Exceltext.class.getName()).log(Level.SEVERE, null, ex);
           } catch (BiffException ex) {
           Logger.getLogger(Exceltext.class.getName()).log(Level.SEVERE, null, ex);
           }
             */
            Workbook wb1 = Workbook.getWorkbook(new File("F://java学习/管道高程.xls"));
            for (int m = 0; m < wb1.getNumberOfSheets(); m++) {
                Sheet sheet = wb1.getSheet(m);
                // Dpaint dpaint = new Dpaint();
                for (int i = 1; i < sheet.getColumns(); i++) {
                    Cell c1, c2, c3, c4;
                    NumberCell cn1, cn2, cn3, cn4;
                    c1 = sheet.getCell(i - 1, 0);
                    cn1 = (NumberCell) c1;
                    System.out.println((int)cn1.getValue());
                    //dpaint.a=(int)cellnum[0].getValue();
                    c2 = sheet.getCell(i - 1, 1);
                    cn2 = (NumberCell) c2;
                     System.out.println((int)cn2.getValue());
                    //dpaint.b=(int)cellnum[1].getValue();
                    c3 = sheet.getCell(i, 0);
                    cn3 = (NumberCell) c3;
                    // dpaint.c=(int)cellnum[2].getValue();
                    c4 = sheet.getCell(i, 1);
                    cn4 = (NumberCell) c4;
                    // dpaint.d=(int)cellnum[3].getValue();
                    //dpaint.paint(getGraphics());

                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Exceltext.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BiffException ex) {
            Logger.getLogger(Exceltext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

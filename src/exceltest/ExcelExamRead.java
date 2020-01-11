/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceltest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;  
import org.apache.poi.ss.usermodel.Sheet;  
import org.apache.poi.ss.usermodel.Workbook;  

/**
 * @author 纪晨秋
 * @date 2019-9-6 19:42:57
 * @version V1.0
 * @desc
 */
public class ExcelExamRead {

    /**
     * 读Excel文件内容
     */
    public void showExcel(String excelName) {
        File file = new File(excelName);
        FileInputStream in = null;
        try {
        // 创建对Excel工作簿文件的引用
            in = new FileInputStream(file);
            XSSFWorkbook hwb = new XSSFWorkbook(in);
            for (int sheetNum = 0; sheetNum < hwb.getNumberOfSheets(); sheetNum++) {
                XSSFSheet sheet = hwb.getSheetAt(sheetNum);// 根据指定的名字来引用此Excel中的有效工作表
        // 读取Excel 工作表的数据
                if (sheet == null) {
                    continue;  
                }  
            System.out.println("下面是Excel文件" + file.getAbsolutePath() +"," +sheet.getSheetName()+"的内容：");
            XSSFRow row = null;
            XSSFCell cell = null;
            int rowNum = 0;
        // 行标
            int colNum = 0;
        // 列标
//            System.out.println(hwb.getNumberOfSheets());
//            System.out.println(sheet.getFirstRowNum());
//            System.out.println(sheet.getLastRowNum());
                        
            for (; rowNum <= sheet.getLastRowNum(); rowNum++) {
        // 获取第rowNum行
                row = sheet.getRow((short) rowNum);
//                System.out.println(row.getFirstCellNum());
//                System.out.println(row.getPhysicalNumberOfCells());
                for (colNum = row.getFirstCellNum(); colNum < row.getPhysicalNumberOfCells(); colNum++) {
                    cell = row.getCell((short) colNum);// 根据当前行的位置来创建一个单元格对象
                    System.out.print(getCellValue(cell)+ "\t");// 获取当前单元格中的内容
                }
                System.out.println(); // 换行
            }
            }
            
            
            in.close();
        } catch (Exception e) {
            System.out.println("读取Excel文件" + file.getAbsolutePath() + "失败：" + e);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e1) {
                }
            }
        }
    }
    
    public static String getCellValue(Cell cell){  
        String cellValue = "";  
        if(cell == null){  
            return cellValue;  
        }  
        //把数字当成String来读，避免出现1读成1.0的情况  
        if(cell.getCellType() == CellType.NUMERIC){  
            cell.setCellType(CellType.STRING);  
        }  
        //判断数据的类型  
        switch (cell.getCellType()){  
            case NUMERIC: //数字  
                cellValue = String.valueOf(cell.getNumericCellValue());  
                break;  
            case STRING: //字符串  
                cellValue = String.valueOf(cell.getStringCellValue());  
                break;  
            case BOOLEAN: //Boolean  
                cellValue = String.valueOf(cell.getBooleanCellValue());  
                break;  
            case FORMULA: //公式  
                cellValue = String.valueOf(cell.getCellFormula());  
                break;  
            case BLANK: //空值   
                cellValue = "";  
                break;  
            case ERROR: //故障  
                cellValue = "非法字符";  
                break;  
            default:  
                cellValue = "未知类型";  
                break;  
        }  
        return cellValue;  
    } 

    public static void main(String[] args) {
        ExcelExamRead excel = new ExcelExamRead();
        String excelName = "C:\\Users\\Administrator\\Documents\\NetBeansProjects\\codeText\\变流量.xlsx";
        excel.showExcel(excelName);
    }
}

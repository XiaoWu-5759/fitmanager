package com.simba.fitmanager.util;

//import org.apache.poi.ss.usermodel.*;

import com.simba.fitmanager.dao.Fit;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 操作excel表
 * xlsx表
 * 表格格式应该是
 * 序号  配件码 状态
 * 2019年5月15日
 */
public class ExcelUtil {

    public static List<Fit> importExcel(String fileName) throws Exception{

        try {
//            POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream("d:/test.xls"));    
//            HSSFWorkbook wb = new HSSFWorkbook(fs);  //得到Excel工作簿对象   
//            HSSFSheet sheet = wb.getSheetAt(0);   //得到Excel工作表对象   
//            HSSFRow row = sheet.getRow(i);  //得到Excel工作表的行   
//            HSSFCell cell = row.getCell(( short) j);  //得到Excel工作表指定行的单元格 
//            cellStyle = cell.getCellStyle();  //得到单元格样式  



            List<Fit> fitList = new ArrayList<>();

            InputStream inputStream = new FileInputStream(fileName);
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(inputStream);
            XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);
//            XSSFRow firstRow = xssfSheet.getRow(0);
//            System.out.println(xssfSheet.getLastRowNum());
            for (int i =1; i <= xssfSheet.getLastRowNum(); i++){
                XSSFRow xssfRow = xssfSheet.getRow(i);
//                int minCell = xssfRow.getFirstCellNum();
//                int maxCell = xssfRow.getLastCellNum();
                XSSFCell fitNum = xssfRow.getCell(1);
                XSSFCell state = xssfRow.getCell(2);
//                System.out.println(fitNum+"+"+state);
//                System.out.println(String.valueOf(fitNum)+"+"+String.valueOf(state));
                Fit fit = new Fit();
                fit.setFitNum(String.valueOf(fitNum));
                fit.setState(String.valueOf(state));
                // 整合时间格式
                Date date = new Date();          // 获取当前时间
                Timestamp createTime = new Timestamp(date.getTime());
                fit.setCreacteTime(createTime);
//                System.out.println(fit.toString());
                fitList.add(fit);
//                System.out.println(fitList.get(i-1));
            }
            System.out.println("解析成功");
            return fitList;
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}

package test;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.CellRangeAddress;

import java.io.FileOutputStream;

/**
 * Created by liumeng09 on 2017/6/30.
 */
public class MergeCell {
    /**
     * 合并单元格
     * @Title:MergeCell
     * @Description:
     * @param args
     * @Date:2015年11月4日 下午2:36:46
     * @return: void
     * @throws Exception
     */
    @SuppressWarnings({ "resource", "deprecation" })
    public static void main(String[] args) throws Exception
    {
        //创建workbook
        HSSFWorkbook workbook = new HSSFWorkbook();
        //创建sheet页
        HSSFSheet sheet = workbook.createSheet("学生表");
        //创建单元格
        HSSFRow row = sheet.createRow(0);


        HSSFCell c4 = row.createCell(4);
        c4.setCellValue(new HSSFRichTextString("2015年分数"));
        HSSFCell c5 = row.createCell(7);
        c5.setCellValue(new HSSFRichTextString("2014年分数"));

        HSSFRow row1 = sheet.createRow(1);
        HSSFCell c0 = row1.createCell(0);
        c0.setCellValue(10);
        HSSFCell c1 = row1.createCell(1);
        c1.setCellValue(11);
        HSSFCell c2 = row1.createCell(2);
        c2.setCellValue(new HSSFRichTextString("性别"));
        HSSFCell c3 = row1.createCell(3);
        c3.setCellValue(new HSSFRichTextString("年龄"));
        HSSFCell c6 = row1.createCell(4);
        c6.setCellValue(new HSSFRichTextString("语文"));
        HSSFCell c7 = row1.createCell(5);
        c7.setCellValue(new HSSFRichTextString("数学"));
        HSSFCell c8 = row1.createCell(6);
        c8.setCellValue(new HSSFRichTextString("外语"));
        HSSFCell c9 = row1.createCell(7);
        c9.setCellValue(new HSSFRichTextString("语文"));
        HSSFCell c10 = row1.createCell(8);
        c10.setCellValue(new HSSFRichTextString("数学"));
        HSSFCell c11 = row1.createCell(9);
        c11.setCellValue(new HSSFRichTextString("外语"));

        CellRangeAddress region1 = new CellRangeAddress(0, 0,(short)4,  (short)6);
        CellRangeAddress region2 = new CellRangeAddress(0, 0,(short)7,  (short)9);
//        CellRangeAddress region3 = new CellRangeAddress(0, 1, (short)2, (short)2);
//        CellRangeAddress region4 = new CellRangeAddress(0,1, (short)3,  (short)3);
//        CellRangeAddress region5 = new CellRangeAddress(0, 0, (short)4, (short)6);
//        CellRangeAddress region6 = new CellRangeAddress(0, 0,(short)7,  (short)9);
        sheet.addMergedRegion(region1);
        sheet.addMergedRegion(region2);
//        sheet.addMergedRegion(region3);
//        sheet.addMergedRegion(region4);
//        sheet.addMergedRegion(region5);
//        sheet.addMergedRegion(region6);

        FileOutputStream stream = new FileOutputStream("d:/student.xls");
        workbook.write(stream);
    }
}

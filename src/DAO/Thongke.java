package DAO;
import DTO.HoaDon;
//import DTO.HoaDonDTO;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
 
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
public class Thongke {
    private static HSSFCellStyle createStyleForTitle(HSSFWorkbook workbook) {
        HSSFFont font = workbook.createFont();
        //font.setBold(true);
        font.setFontName("Times New Roman");
        font.setFontHeightInPoints((short) 10); 
        font.setColor(IndexedColors.WHITE.getIndex());
        HSSFCellStyle style = workbook.createCellStyle();
        style.setFont(font);
        style.setFillForegroundColor(IndexedColors.BLUE.getIndex());
        //style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        //style.setBorderBottom(BorderStyle.THIN);
        return style;
    }
     private static void autosizeColumn(Sheet sheet, int lastColumn) {
        for (int columnIndex = 0; columnIndex < lastColumn; columnIndex++) {
            sheet.autoSizeColumn(columnIndex);
        }
    }
     
    public static void run(ArrayList<HoaDon> a,String tu_ng,String den_ng,String msp, String makh,int sl, int tt) throws IOException {
 
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Hóa đơn");
 
        //List<HoaDonDTO> list = IEBillDAO.listHoaDon();
 
        int rownum = 0;
        Cell cell;
        Row row;
        
        HSSFCellStyle style = createStyleForTitle(workbook);
        row = sheet.createRow(rownum);
        
        int n1 = sheet.getRow(0).getPhysicalNumberOfCells();
        autosizeColumn(sheet, n1);
        
       //cell.setCellStyle(style);
       
        cell = row.createCell(0);
        cell.setCellValue("Từ ngày");
        //cell.setCellStyle(style);
        
        
        cell = row.createCell(1);
        cell.setCellValue("Đến ngày");
        //cell.setCellStyle(style);
       
        cell = row.createCell(2);
        cell.setCellValue("Mã Sản phẩm");
        //cell.setCellStyle(style);
        
        cell = row.createCell(3);
        cell.setCellValue("Mã KH");
        //cell.setCellStyle(style);
        
        //cell = row.createCell(4);
        //cell.setCellValue("Tổng tiền");
        //cell.setCellStyle(style);
        
        /*cell = row.createCell(5, CellType.STRING);
        cell.setCellValue("Mã khuyến mãi");
        cell.setCellStyle(style);*/
 
        
        /*for (HoaDon hd :a) {
            rownum++;
            row = sheet.createRow(rownum);*/
 
            
            cell = row.createCell(0);
            cell.setCellValue(tu_ng);
            
            cell = row.createCell(1);
            cell.setCellValue(den_ng);
            
            cell = row.createCell(2);
            cell.setCellValue(msp);
            
            cell = row.createCell(3);
            cell.setCellValue(makh);  
          
            
            
            
        
        cell=row.createCell(0);
        cell.setCellValue("Tổng số lượng sản phẩm bán:");
        
        cell=row.createCell(1);
        cell.setCellValue(sl);
        
        cell=row.createCell(2);
        cell.setCellValue("Tổng doanh thu:");
        
        cell=row.createCell(3);
        cell.setCellValue(tt);
        cell=row.createCell(4);
        
        File file = new File("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\QuanLyBanMayTinh\\QuanLyBanMayTinh\\src\\DAO\\Thongke.xls");
        file.getParentFile().mkdirs();
 
        FileOutputStream outFile = new FileOutputStream(file);
        workbook.write(outFile);
        System.out.println("Created file: " + file.getAbsolutePath());
 
    }

    
}

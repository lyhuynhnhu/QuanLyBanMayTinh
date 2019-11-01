package BUS;

import DAO.CTHoaDonDAO;
import DTO.ChiTietHoaDon;
import java.util.ArrayList;

public class CTHoaDonBUS {
    static ArrayList<ChiTietHoaDon> dscthd;
    public ArrayList<ChiTietHoaDon> docDSCTHD(){
        CTHoaDonDAO data= new CTHoaDonDAO();
        if(dscthd==null){
        } else {
            dscthd= new ArrayList<ChiTietHoaDon>();
        } 
        dscthd= data.docDSCTHD();
        return dscthd;
    }
    public ArrayList<ChiTietHoaDon> timCTHD(String ma){
        CTHoaDonDAO data= new CTHoaDonDAO();
        dscthd= data.timCTHD(ma);
        return dscthd;
    }
    public void them(ChiTietHoaDon cthddto){
        CTHoaDonDAO data= new CTHoaDonDAO();
        data.them(cthddto);
        dscthd.add(cthddto);
    }
    public void xoa(String x){
        CTHoaDonDAO data= new CTHoaDonDAO();
        data.xoa(x);
    }
//    public ArrayList<ChiTietHoaDon> timTheongay(String tu, String den){
//        CTHoaDonDAO data= new CTHoaDonDAO();
//        dscthd=data.timTheongay(tu,den);
//        return dscthd;
//    }
}

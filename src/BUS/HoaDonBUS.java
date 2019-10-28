package BUS;

import DAO.HoaDonDAO;
import DTO.HoaDon;
import java.util.ArrayList;

public class HoaDonBUS {
    static ArrayList<HoaDon> dshd;
    public ArrayList<HoaDon> docDSHD(){
        HoaDonDAO data= new HoaDonDAO();
        if(dshd==null){
        } else {
            dshd= new ArrayList<HoaDon>();
        } 
        dshd= data.docDSHD();
        return dshd;
    }
    public void them(HoaDon hoaDonDTO){
        HoaDonDAO data= new HoaDonDAO();
        data.them(hoaDonDTO);
        dshd.add(hoaDonDTO);
    }
    public void sua(HoaDon hoaDonDTO){
        HoaDonDAO data= new HoaDonDAO();
        data.sua(hoaDonDTO);
        dshd.add(hoaDonDTO);
    }
    public void xoa(String x){
        HoaDonDAO data= new HoaDonDAO();
        data.xoa(x);
    }
    public ArrayList<HoaDon> timTheongay(String tu, String den){
        HoaDonDAO data= new HoaDonDAO();
        dshd=data.timTheongay(tu,den);
        return dshd;
    }
}

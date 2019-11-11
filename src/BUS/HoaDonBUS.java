package BUS;

import DAO.HoaDonDAO;
import DTO.HoaDon;
import java.sql.SQLException;
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
    public void xoa(String x){
        HoaDonDAO data= new HoaDonDAO();
        data.xoa(x);
    }
     public int demsl() throws SQLException{
        HoaDonDAO data=new HoaDonDAO();
        return data.demsl();}
    public ArrayList<HoaDon> timTheongay(String tu, String den){
        HoaDonDAO data= new HoaDonDAO();
        dshd=data.timTheongay(tu,den);
        return dshd;
    }
    public ArrayList<HoaDon> timTheomahd(String ma){
        HoaDonDAO data= new HoaDonDAO();
        dshd=data.timTheoMaHD(ma);
        return dshd;
    }
    public ArrayList<HoaDon> timTheomakh(String ma){
        HoaDonDAO data= new HoaDonDAO();
        dshd=data.timTheoMaKH(ma);
        return dshd;
    }
    public ArrayList<HoaDon> timTheomanv(String ma){
        HoaDonDAO data= new HoaDonDAO();
        dshd=data.timTheoMaNV(ma);
        return dshd;
    }
    public ArrayList<HoaDon> timTheomakm(String ma){
        HoaDonDAO data= new HoaDonDAO();
        dshd=data.timTheoMaKM(ma);
        return dshd;
    }
}

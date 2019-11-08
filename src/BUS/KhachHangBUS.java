package BUS;
import DAO.KhachHangDAO;
import DTO.KhachHang;
import java.util.ArrayList;

public class KhachHangBUS {
    static ArrayList<KhachHang> dskh;
    public ArrayList<KhachHang> docDSKH(){
        KhachHangDAO data= new KhachHangDAO();
        if(dskh==null){
        } else {
            dskh= new ArrayList<KhachHang>();
        } 
        dskh= data.docDSKH();
        return dskh;
    }
    public void them(KhachHang khachHangDTO){
        KhachHangDAO data= new KhachHangDAO();
        data.them(khachHangDTO);
        dskh.add(khachHangDTO);
    }
    public void sua(KhachHang khachHangDTO){
        KhachHangDAO data= new KhachHangDAO();
        data.sua(khachHangDTO);
        dskh.add(khachHangDTO);
    }
    public void xoa(String x){
        KhachHangDAO data= new KhachHangDAO();
        data.xoa(x);
    }
    public ArrayList<KhachHang> timTheoten(String ten){
        KhachHangDAO data=new KhachHangDAO();
        dskh=data.timTheoTen(ten);
        return dskh;
    }
    public ArrayList<KhachHang> timTheoma(String ma){
        KhachHangDAO data=new KhachHangDAO();
        dskh=data.timTheoMa(ma);
        return dskh;
    }
    public ArrayList<KhachHang> timTheoloai(String loai){
        KhachHangDAO data=new KhachHangDAO();
        dskh=data.timTheoLoai(loai);
        return dskh;
    }
    public ArrayList<KhachHang> timTheosdt(String sdt){
        KhachHangDAO data=new KhachHangDAO();
        dskh=data.timTheoSDT(sdt);
        return dskh;
    }
}

package BUS;

import DAO.KhuyenMaiDAO;
import DTO.KhuyenMai;
import java.util.ArrayList;

public class KhuyenMaiBUS {
    static ArrayList<KhuyenMai> dskm;
    public ArrayList<KhuyenMai> docDSKM(){
        KhuyenMaiDAO data= new KhuyenMaiDAO();
        if(dskm==null){
        } else {
            dskm= new ArrayList<KhuyenMai>();
        } 
        dskm= data.docDSKM();
        return dskm;
    }
    public void them(KhuyenMai kmDTO){
        KhuyenMaiDAO data= new KhuyenMaiDAO();
        data.them(kmDTO);
        dskm.add(kmDTO);
    }
    public void sua(KhuyenMai kmDTO){
        KhuyenMaiDAO data= new KhuyenMaiDAO();
        data.sua(kmDTO);
        dskm.add(kmDTO);
    }
    public void xoa(String x){
        KhuyenMaiDAO data= new KhuyenMaiDAO();
        data.xoa(x);
    }
    public ArrayList<KhuyenMai> timTheoten(String ten){
        KhuyenMaiDAO data=new KhuyenMaiDAO();
        dskm=data.timTheoTen(ten);
        return dskm;
    }
    public ArrayList<KhuyenMai> timTheoma(String ma){
        KhuyenMaiDAO data=new KhuyenMaiDAO();
        dskm=data.timTheoMa(ma);
        return dskm;
    }
    public ArrayList<KhuyenMai> timTheogtri(String gtri){
        KhuyenMaiDAO data=new KhuyenMaiDAO();
        dskm=data.timTheoGtri(gtri);
        return dskm;
    }
    public ArrayList<KhuyenMai> timTheongay(String tu, String den){
        KhuyenMaiDAO data= new KhuyenMaiDAO();
        dskm=data.timTheongay(tu,den);
        return dskm;
    }
}
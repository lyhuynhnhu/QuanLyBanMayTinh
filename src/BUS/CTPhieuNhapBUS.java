package BUS;

import DAO.CTPhieuNhapDAO;
import DTO.ChiTietPhieuNhap;
import java.util.ArrayList;

public class CTPhieuNhapBUS {
    static ArrayList<ChiTietPhieuNhap> dsctpn;
    public ArrayList<ChiTietPhieuNhap> docDSCTPN(){
        CTPhieuNhapDAO data= new CTPhieuNhapDAO();
        if(dsctpn==null){
        } else {
            dsctpn= new ArrayList<ChiTietPhieuNhap>();
        } 
        dsctpn= data.docDSCTPN();
        return dsctpn;
    }
    public ArrayList<ChiTietPhieuNhap> timCTPN(String ma){
        CTPhieuNhapDAO data= new CTPhieuNhapDAO();
        dsctpn= data.timCTPN(ma);
        return dsctpn;
    }
    public void them(ChiTietPhieuNhap ctpndto){
        CTPhieuNhapDAO data= new CTPhieuNhapDAO();
        data.them(ctpndto);
        //dsctpn.add(ctpndto);
    }
    public void xoa(String x){
        CTPhieuNhapDAO data= new CTPhieuNhapDAO();
        data.xoa(x);
    }
//    public ArrayList<ChiTietPhieuNhap> timTheongay(String tu, String den){
//        CTPhieuNhapDAO data= new CTPhieuNhapDAO();
//        dsctpn=data.timTheongay(tu,den);
//        return dsctpn;
//    }
}

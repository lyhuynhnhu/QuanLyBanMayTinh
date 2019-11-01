package BUS;

import DAO.PhieuNhapDAO;
import DTO.PhieuNhap;
import java.util.ArrayList;

public class PhieuNhapBUS {
    static ArrayList<PhieuNhap> dspn;
    public ArrayList<PhieuNhap> docDSPN(){
        PhieuNhapDAO data= new PhieuNhapDAO();
        if(dspn==null){
        } else {
            dspn= new ArrayList<PhieuNhap>();
        } 
        dspn= data.docDSPN();
        return dspn;
    }
    public void them(PhieuNhap phieuNhapDTO){
        PhieuNhapDAO data= new PhieuNhapDAO();
        data.them(phieuNhapDTO);
        dspn.add(phieuNhapDTO);
    }
    public void xoa(String x){
        PhieuNhapDAO data= new PhieuNhapDAO();
        data.xoa(x);
    }
    public ArrayList<PhieuNhap> timTheongay(String tu, String den){
        PhieuNhapDAO data= new PhieuNhapDAO();
        dspn=data.timTheongay(tu,den);
        return dspn;
    }
    public ArrayList<PhieuNhap> timTheomapn(String ma){
        PhieuNhapDAO data=new PhieuNhapDAO();
        dspn=data.timTheomapn(ma);
        return dspn;
    }
    public ArrayList<PhieuNhap> timTheonsx(String nsx){
        PhieuNhapDAO data=new PhieuNhapDAO();
        dspn=data.timTheonhasx(nsx);
        return dspn;
    }
    public ArrayList<PhieuNhap> timTheonv(String nv){
        PhieuNhapDAO data=new PhieuNhapDAO();
        dspn=data.timTheonv(nv);
        return dspn;
    }
}

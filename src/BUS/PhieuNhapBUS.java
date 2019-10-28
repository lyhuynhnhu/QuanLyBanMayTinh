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
    public void sua(PhieuNhap phieuNhapDTO){
        PhieuNhapDAO data= new PhieuNhapDAO();
        data.sua(phieuNhapDTO);
        dspn.add(phieuNhapDTO);
    }
    public ArrayList<PhieuNhap> timTheongay(String tu, String den){
        PhieuNhapDAO data= new PhieuNhapDAO();
        dspn=data.timTheongay(tu,den);
        return dspn;
    }
}

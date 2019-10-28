package BUS;

import DTO.PhieuBaoHanh;
import DAO.PhieuBaoHanhDAO;
import java.util.ArrayList;

public class PhieuBaoHanhBUS {
    static ArrayList<PhieuBaoHanh> dspbh;
    public ArrayList<PhieuBaoHanh> docDSPBH(){
        PhieuBaoHanhDAO data= new PhieuBaoHanhDAO();
        if(dspbh==null){
        } else {
            dspbh= new ArrayList<PhieuBaoHanh>();
        } 
        dspbh= data.docDSPBH();
        return dspbh;
    }
    public void them(PhieuBaoHanh phieuBaoHanh){
        PhieuBaoHanhDAO data= new PhieuBaoHanhDAO();
        data.them(phieuBaoHanh);
        dspbh.add(phieuBaoHanh);
    }
    public void sua(PhieuBaoHanh phieuBaoHanh){
        PhieuBaoHanhDAO data= new PhieuBaoHanhDAO();
        data.sua(phieuBaoHanh);
        dspbh.add(phieuBaoHanh);
    }
    public void xoa(String x){
        PhieuBaoHanhDAO data= new PhieuBaoHanhDAO();
        data.xoa(x);
    }
    public ArrayList<PhieuBaoHanh> timTheomabh(String ma){
        PhieuBaoHanhDAO data=new PhieuBaoHanhDAO();
        dspbh=data.timTheoMaBH(ma);
        return dspbh;
    }
    public ArrayList<PhieuBaoHanh> timTheomahd(String ma){
        PhieuBaoHanhDAO data=new PhieuBaoHanhDAO();
        dspbh=data.timTheoMaHD(ma);
        return dspbh;
    }
    public ArrayList<PhieuBaoHanh> timTheomasp(String ma){
        PhieuBaoHanhDAO data=new PhieuBaoHanhDAO();
        dspbh=data.timTheoMaSP(ma);
        return dspbh;
    }
    public ArrayList<PhieuBaoHanh> timTheoloai(String loai){
        PhieuBaoHanhDAO data=new PhieuBaoHanhDAO();
        dspbh=data.timTheoLoai(loai);
        return dspbh;
    }
}

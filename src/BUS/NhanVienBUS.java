package BUS;

import DAO.NhanVienDAO;
import DTO.NhanVien;
import java.util.ArrayList;

public class NhanVienBUS {
    public static ArrayList<NhanVien> dsnv;
    public ArrayList<NhanVien> docDSNV(){
        NhanVienDAO data= new NhanVienDAO();
        if(dsnv==null){
        } else {
            dsnv= new ArrayList<NhanVien>();
        } 
        dsnv= data.docDSNV();
        return dsnv;
    }
    public void them(NhanVien nhanVienDTO){
        NhanVienDAO data= new NhanVienDAO();
        data.them(nhanVienDTO);
        dsnv.add(nhanVienDTO);
    }
    public void sua(NhanVien nhanVienDTO){
        NhanVienDAO data= new NhanVienDAO();
        data.sua(nhanVienDTO);
        dsnv.add(nhanVienDTO);
    }
    public void xoa(String x){
        NhanVienDAO data= new NhanVienDAO();
        data.xoa(x);
    }
    public ArrayList<NhanVien> timTheoten(String ten){
        NhanVienDAO data=new NhanVienDAO();
        dsnv=data.timTheoTen(ten);
        return dsnv;
    }
    public ArrayList<NhanVien> timTheoma(String ma){
        NhanVienDAO data=new NhanVienDAO();
        dsnv=data.timTheoMa(ma);
        return dsnv;
    }
    public ArrayList<NhanVien> timTheochucvu(String chucvu){
        NhanVienDAO data=new NhanVienDAO();
        dsnv=data.timTheoChucvu(chucvu);
        return dsnv;
    }
    public ArrayList<NhanVien> timTheogtinh(String gtinh){
        NhanVienDAO data=new NhanVienDAO();
        dsnv=data.timTheoGtinh(gtinh);
        return dsnv;
    }
}

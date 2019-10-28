package BUS;

import DAO.SanPhamDAO;
import DTO.SanPham;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class SanPhamBUS {
    public static ArrayList<SanPham> dssp;
    public ArrayList<SanPham> docDSSP(){
        SanPhamDAO data= new SanPhamDAO();
        if(dssp==null){
        } else {
            dssp= new ArrayList<SanPham>();
        } 
        dssp= data.docDSSP();
        return dssp;
    }
    public void them(SanPham sanPhamDTO){
        SanPhamDAO data= new SanPhamDAO();
        data.them(sanPhamDTO);
        dssp.add(sanPhamDTO);
    }
    public void sua(SanPham sanPhamDTO){
        SanPhamDAO data= new SanPhamDAO();
        data.sua(sanPhamDTO);
        dssp.add(sanPhamDTO);
    }
    public void xoa(String x){
        SanPhamDAO data= new SanPhamDAO();
        data.xoa(x);
    }
    
    public ArrayList<SanPham> timTheoma(String ma){
        SanPhamDAO data= new SanPhamDAO();
        dssp=data.timTheoMa(ma);
        return dssp;
    }
    public ArrayList<SanPham> timTheoten(String ten){
        SanPhamDAO data= new SanPhamDAO();
        dssp=data.timTheoTen(ten);
        return dssp;
    }
    public ArrayList<SanPham> timTheogia(String giatu, String giaden){
        SanPhamDAO data= new SanPhamDAO();
        dssp=data.timTheogia(giatu,giaden);
        return dssp;
    }
}

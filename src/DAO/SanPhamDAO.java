package DAO;

import DTO.SanPham;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SanPhamDAO extends MyConnect{
    
    public ArrayList docDSSP() {
        ArrayList dssp=new ArrayList<SanPham>();
        String sql="Select * From SanPham";
        getData(sql, dssp);
        return dssp;
    }
    
    public void them(SanPham sp){
        try{
            getConnect();
            String qry="Insert into SanPham values (";
            qry += "'"+sp.masp+"'";
            qry += ","+"'"+sp.tensp+"'";
            qry += ","+"'"+sp.xuatxu+"'";
            qry += ","+"'"+sp.nsx+"'";
            qry += ","+"'"+sp.tgbaohanh+"'";
            qry += ","+sp.kichthuoc;
            qry += ","+sp.khluong;
            qry += ","+sp.sl;
            qry += ","+"'"+sp.dongia+"'";
            qry += ","+"'"+sp.ghichu+"'";
            qry += ")";
            st= conn.createStatement();
            st.executeUpdate(qry);
            closeConnect();
        }catch (SQLException ex){
             Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void xoa (String masp){
        try{
            getConnect();
            String qry="Delete from SanPham where MaSP='"+masp+"'";
            st= conn.createStatement();
            st.executeUpdate(qry);
            closeConnect();
        }catch (Exception e){
            
        }
    }
    public void sua (SanPham sanphamDTO){
        try{
            getConnect();
            String qry="Update SanPham set";
            qry += " TenSP='"+sanphamDTO.tensp+"'"; 
            qry += ",XuatXu='"+sanphamDTO.xuatxu+"'";
            qry += ",NhaSanXuat='"+sanphamDTO.nsx+"'";
            qry += ",TGBH='"+sanphamDTO.tgbaohanh+"'";
            qry += ",KichThuoc="+sanphamDTO.kichthuoc;
            qry += ",KhoiLuong="+sanphamDTO.khluong;
            qry += ",SoLuong="+sanphamDTO.sl;
            qry += ",DonGia='"+sanphamDTO.dongia+"'";
            qry += ",GhiChu='"+sanphamDTO.ghichu+"'";
            qry += " "+"where MaSP='"+sanphamDTO.masp+"'";
            st= conn.createStatement();
            st.executeUpdate(qry);
            closeConnect();
        }catch (Exception e){
            
        }
    }
    
    public ArrayList<SanPham> timTheoTen(String ten){
        ArrayList dssp= new ArrayList<SanPham>();
        String qry="select * from SanPham where TenSP like '%"+ten+"%'";
        getData(qry, dssp);
        return dssp;
    }
    public ArrayList<SanPham> timTheoMa(String ma){
        ArrayList dssp= new ArrayList<SanPham>();
        String qry="select * from SanPham where MaSP like '%"+ma+"%'";
        getData(qry, dssp);
        return dssp;
    }
    public ArrayList<SanPham> timTheoXuatxu(String xxu) {
        ArrayList dssp= new ArrayList<SanPham>();
        String qry="select * from SanPham where XuatXu like '%"+xxu+"%'";
        getData(qry, dssp);
        return dssp;
    }
    public ArrayList<SanPham> timTheoNhasx(String nsx) {
        ArrayList dssp= new ArrayList<SanPham>();
        String qry="select * from SanPham where NhaSanXuat like '%"+nsx+"%'";
        getData(qry, dssp);
        return dssp;
    }
    public ArrayList<SanPham> timTheogia(String giatu, String giaden){
        ArrayList dssp= new ArrayList<SanPham>();
        String qry="select * from SanPham where DonGia>='"+giatu+"' and DonGia<='"+giaden+"'";
        getData(qry, dssp);
        return dssp;
    }
    public void updateSLSPKhiNhapHang(int slTon, int slNhap, String ma){
        int slHientai= slTon+slNhap;
        try {
            getConnect();
            String qry="Update SanPham set SoLuong= "+slHientai+" where MASP='"+ma+"'";
            st=conn.createStatement();
            st.executeUpdate(qry);
            closeConnect();
        } catch (Exception e) {
        }
    }
    public void getData(String qry, ArrayList dssp){   
        try {
            getConnect();
            st=conn.createStatement();
            rs= st.executeQuery(qry);
            while (rs.next()) {
                SanPham sp=new SanPham();
                sp.masp= rs.getString(1);
                sp.tensp= rs.getString(2);
                sp.xuatxu= rs.getString(3);
                sp.nsx= rs.getString(4);
                sp.tgbaohanh= rs.getString(5);
                sp.kichthuoc= rs.getFloat(6);
                sp.khluong= rs.getFloat(7);
                sp.sl= rs.getInt(8);
                sp.dongia= rs.getString(9);
                dssp.add(sp);
            }
            closeConnect();
        } catch (Exception e) {
        }
    }
}
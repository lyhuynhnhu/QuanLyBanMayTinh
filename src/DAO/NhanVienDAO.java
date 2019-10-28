package DAO;

import DTO.NhanVien;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NhanVienDAO extends MyConnect
{
    public ArrayList docDSNV(){
        ArrayList dsnv= new ArrayList<NhanVien>();
        try{
            getConnect();
            String qry="select * from NhanVien";
            st=conn.createStatement();
            rs= st.executeQuery(qry);
            while(rs.next()){
                NhanVien nv= new NhanVien();
                nv.MaNV=rs.getString(1);
                nv.Ten=rs.getString(2);
                nv.GioiTinh=rs.getString(3);
                nv.DiaChi=rs.getString(4);
                nv.Dthoai=rs.getString(5);
                nv.NgaySinh=rs.getString(6);
                nv.ChucVu=rs.getString(7);
                nv.Luong=rs.getInt(8);
                dsnv.add(nv);
            }
            closeConnect();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsnv;
    }
    
    public void them(NhanVien nv){
        try {
            getConnect();
            String qry="Insert into NhanVien values(";
            qry+= "'"+nv.MaNV+"'";
            qry+= ","+"'"+nv.Ten+"'";
            qry+= ","+"'"+nv.GioiTinh+"'";
            qry+= ","+"'"+nv.DiaChi+"'";
            qry+= ","+"'"+nv.Dthoai+"'";
            qry+= ","+"'"+nv.NgaySinh+"'";
            qry+= ","+"'"+nv.ChucVu+"'";
            qry+= ","+nv.Luong;
            qry+= ")";
            st=conn.createStatement();
            st.executeUpdate(qry);
            closeConnect();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void xoa(String ma){
        try {
            getConnect();
            String qry="Delete from NhanVien where MaNV='"+ma+"'";
            st=conn.createStatement();
            st.executeUpdate(qry);
            closeConnect();
        } catch (Exception e) {
        }
    }
    public void sua(NhanVien nv){
        try {
            getConnect();
            String qry="Update NhanVien set";
            qry+= " TenNV='"+nv.Ten+"'";
            qry+= ",GioiTinh='"+nv.GioiTinh+"'";
            qry+= ",Diachi='"+nv.DiaChi+"'";
            qry+= ",DienThoai='"+nv.Dthoai+"'";
            qry+= ",NgaySinh='"+nv.NgaySinh+"'";
            qry+= ",ChucVu='"+nv.ChucVu+"'";
            qry+= ",Luong="+nv.Luong;
            qry+= " "+"where MaNV='"+nv.MaNV+"'";
            st=conn.createStatement();
            st.executeUpdate(qry);
            closeConnect();
        } catch (Exception e) {
        }
    }
    public ArrayList<NhanVien> timTheoTen(String ten){
        ArrayList dsnv= new ArrayList<NhanVien>();
        try {
            getConnect();
            String qry="select * from NhanVien where TenNV like '%"+ten+"%'";
            st=conn.createStatement();
            rs= st.executeQuery(qry);
            while (rs.next()) {
                NhanVien nv= new NhanVien();
                nv.MaNV=rs.getString(1);
                nv.Ten=rs.getString(2);
                nv.GioiTinh=rs.getString(3);
                nv.DiaChi=rs.getString(4);
                nv.Dthoai=rs.getString(5);
                nv.NgaySinh=rs.getString(6);
                nv.ChucVu=rs.getString(7);
                nv.Luong=rs.getInt(8);
                dsnv.add(nv);
            }
            closeConnect();
        } catch (Exception e) {
        }
        return dsnv;
    }
    public ArrayList<NhanVien> timTheoMa(String ma){
        ArrayList dsnv= new ArrayList<NhanVien>();
        try {
            getConnect();
            String qry="select * from NhanVien where MaNV like '%"+ma+"%'";
            st=conn.createStatement();
            rs= st.executeQuery(qry);
            while (rs.next()) {
                NhanVien nv= new NhanVien();
                nv.MaNV=rs.getString(1);
                nv.Ten=rs.getString(2);
                nv.GioiTinh=rs.getString(3);
                nv.DiaChi=rs.getString(4);
                nv.Dthoai=rs.getString(5);
                nv.NgaySinh=rs.getString(6);
                nv.ChucVu=rs.getString(7);
                nv.Luong=rs.getInt(8);
                dsnv.add(nv);
            }
            closeConnect();
        } catch (Exception e) {
        }
        return dsnv;
    }
}

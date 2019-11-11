package DAO;

import DTO.KhachHang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KhachHangDAO extends MyConnect{
    public ArrayList docDSKH(){
        ArrayList dskh= new ArrayList<KhachHang>();
        String qry="select * from KhachHang";
        getData(qry, dskh);
        return dskh;
    }
    public void them(KhachHang kh){
        try {
            getConnect();
            String qry="Insert into KhachHang values(";
            qry+= "'"+kh.makh+"'";
            qry+= ","+"'"+kh.tenkh+"'";
            qry+= ","+"'"+kh.diachi+"'";
            qry+= ","+"'"+kh.dienthoai+"'";
            qry+= ","+"'"+kh.LoaiKH+"'";
            qry+= ","+kh.diem;
            qry+= ")";
            st=conn.createStatement();
            st.executeUpdate(qry);
            closeConnect();
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void xoa(String ma){
        try {
            getConnect();
            String qry="Delete from KhachHang where MaKH='"+ma+"'";
            st=conn.createStatement();
            st.executeUpdate(qry);
            closeConnect();
        } catch (Exception e) {
        }
    }
    public void sua(KhachHang kh){
        try {
            getConnect();
            String qry="Update KhachHang set";
            qry+= " TenKH='"+kh.tenkh+"'";
            qry+= ",DiaChi='"+kh.diachi+"'";
            qry+= ",DienThoai='"+kh.dienthoai+"'";
            qry+= ",LOAIKH='"+kh.LoaiKH+"'";
            qry+= ",DiemTichLuy="+kh.diem;
            qry+= " "+"where MAKH='"+kh.makh+"'";
            st=conn.createStatement();
            st.executeUpdate(qry);
            closeConnect();
        } catch (Exception e) {
        }
    }
    public int demsl() throws SQLException{
     getConnect();
     String sql="SELECT COUNT(MaKH) from khachhang";
     st=conn.createStatement();
         return st.executeUpdate(sql);
     
    }
    
    public ArrayList<KhachHang> timTheoTen(String ten){
        ArrayList dskh= new ArrayList<KhachHang>();
        String qry="select * from KhachHang where TenKH like '%"+ten+"%'";
        getData(qry, dskh);
        return dskh;
    }
    public ArrayList<KhachHang> timTheoMa(String ma){
        ArrayList dskh= new ArrayList<KhachHang>();
        String qry="select * from KhachHang where MaKH like '%"+ma+"%'";
        getData(qry, dskh);
        return dskh;
    }
    public ArrayList<KhachHang> timTheoLoai(String loai){
        ArrayList dskh= new ArrayList<KhachHang>();
        String qry="select * from KhachHang where LOAIKH like '%"+loai+"%'";
        getData(qry, dskh);
        return dskh;
    }
    public ArrayList<KhachHang> timTheoSDT(String sdt){
        ArrayList dskh= new ArrayList<KhachHang>();
        String qry="select * from KhachHang where DienThoai='"+sdt+"'";
        getData(qry, dskh);
        return dskh;
    }
    public void getData(String qry, ArrayList dskh) {
        try {
            getConnect();           
            st=conn.createStatement();
            rs= st.executeQuery(qry);
            while (rs.next()) {
                KhachHang kh= new KhachHang();
                kh.makh=rs.getString(1);
                kh.tenkh=rs.getString(2);
                kh.diachi=rs.getString(4);
                kh.dienthoai=rs.getString(3);
                kh.LoaiKH=rs.getString(5);
                kh.diem=rs.getInt(6);
                dskh.add(kh);
            }
            closeConnect();
        } catch (Exception e) {
        }
    }
    
}
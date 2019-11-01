package DAO;

import DTO.KhuyenMai;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger; 

public class KhuyenMaiDAO extends MyConnect{
    public ArrayList docDSKM(){
        ArrayList dskm= new ArrayList<KhuyenMai>();
        String qry= "select * from KhuyenMai";
        getData(qry, dskm);
        return dskm;
    }
    public void them(KhuyenMai km){
        try{
            getConnect();
            String qry="Insert into KhuyenMai values(";
            qry+= "'"+km.MaKM+"'";
            qry+= ",'"+km.TenKM+"'";
            qry+= ",'"+km.GiaTri+"'";
            qry+= ",'"+km.NgayBD+"'";
            qry+= ",'"+km.NgayKT+"'";
            qry+= ")";
            st= conn.createStatement();
            st.executeUpdate(qry);
            closeConnect();
        }catch (SQLException ex){
            Logger.getLogger(KhuyenMaiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void xoa(String ma){
        try{
            getConnect();
            String qry="Delete from KhuyenMai where MaKM='"+ma+"'";
            st= conn.createStatement();
            st.executeUpdate(qry);
            closeConnect();
        }catch (Exception e){
            
        }
    }
    public void sua (KhuyenMai km){
        try{
            getConnect();
            String qry="Update KhuyenMai set";
            qry+= " TenKM='"+km.TenKM+"'";
            qry+= ",GiaTri='"+km.GiaTri+"'";
            qry+= ",NgayBD='"+km.NgayBD+"'";
            qry+= ",NgayKT='"+km.NgayKT+"'";
            qry+= " "+"where MaKM='"+km.MaKM+"'";
            st=conn.createStatement();
            st.executeUpdate(qry);
            closeConnect();
        }catch (Exception e){
            
        }
    }
    public ArrayList<KhuyenMai> timTheoMa(String ma){
        ArrayList dskm= new ArrayList<KhuyenMai>();
        String qry="select * from KhuyenMai where MaKM like '%"+ma+"%'";
        getData(qry, dskm);
        return dskm;
    }
    public ArrayList<KhuyenMai> timTheoTen(String ten){
        ArrayList dskm= new ArrayList<KhuyenMai>();
        String qry="select * from KhuyenMai where TenKM like '%"+ten+"%'";
        getData(qry, dskm);
        return dskm;
    }
    public ArrayList<KhuyenMai> timTheoGtri(String gtri){
        ArrayList dskm= new ArrayList<KhuyenMai>();
        String qry="select * from KhuyenMai where GiaTri like '%"+gtri+"%'";
        getData(qry, dskm);
        return dskm;
    }
    public ArrayList<KhuyenMai> timTheongay(String tu, String den){
        ArrayList dskm= new ArrayList<KhuyenMai>();
        String qry="select * from KhuyenMai where NgayBD>='"+tu+"' and NgayKT<='"+den+"'";
        getData(qry, dskm);
        return dskm;
    }
    public void getData(String qry, ArrayList dskm){
        try {
            getConnect();
            st=conn.createStatement();
            rs= st.executeQuery(qry);
            while (rs.next()) {
                KhuyenMai km= new KhuyenMai();
                km.MaKM= rs.getString(1);
                km.TenKM= rs.getString(2);
                km.GiaTri= rs.getString(3);                
                km.NgayBD= rs.getString(4);
                km.NgayKT= rs.getString(5);
                dskm.add(km);
            }
            closeConnect();
        } catch (Exception e) {
        }
    }
}
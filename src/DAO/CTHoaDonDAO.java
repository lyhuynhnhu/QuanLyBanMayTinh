package DAO;

import DTO.ChiTietHoaDon;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CTHoaDonDAO extends MyConnect{
    public ArrayList docDSCTHD(){
        ArrayList dscthd= new ArrayList<ChiTietHoaDon>();
        String qry="select * from ChiTietHoaDon";
        getData(qry, dscthd);
        return dscthd;
    }
    public ArrayList<ChiTietHoaDon> timCTHD(String ma){
        ArrayList dscthd= new ArrayList<ChiTietHoaDon>();
        String qry= "select * from ChiTietHoaDon where MaHD='"+ma+"'";
        getData(qry, dscthd);
        return dscthd;
    }
    public ArrayList<ChiTietHoaDon> locTheoMaSP(String mahd,String masp){
        ArrayList dscthd= new ArrayList<ChiTietHoaDon>();
        String qry= "select * from ChiTietHoaDon where MaHD="+mahd+" AND MaSP="+masp+"";
        getData(qry, dscthd);
        return dscthd;
    }
    public ArrayList<ChiTietHoaDon> timTheoMaSP(String ma){
        ArrayList dscthd= new ArrayList<ChiTietHoaDon>();
        String qry= "select * from ChiTietHoaDon where MaSP like '%"+ma+"%'";
        getData(qry, dscthd);
        return dscthd;
    }
    public void them(ChiTietHoaDon cthd){
        try {
            getConnect();
            String qry="Insert into ChiTietHoaDon values(";
            qry+= "'"+cthd.mahd+"'";
            qry+= ","+"'"+cthd.masp+"'";
            qry+= ","+cthd.soluong;
            qry+= ","+"'"+cthd.dongia+"'";
            qry+= ")";
            st=conn.createStatement();
            st.executeUpdate(qry);
            closeConnect();
        } catch (SQLException ex) {
            Logger.getLogger(CTHoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void xoa(String ma){
        try {
            getConnect();
            String qry="Delete from ChiTietHoaDon where MaHD='"+ma+"'";
            st=conn.createStatement();
            st.executeUpdate(qry);
            closeConnect();
        } catch (Exception e) {
        }
    }
    public void getData(String qry, ArrayList dscthd){
        try{
            getConnect();
            st=conn.createStatement();
            rs= st.executeQuery(qry);
            while(rs.next()){
                ChiTietHoaDon cthd= new ChiTietHoaDon();
                cthd.mahd=rs.getString(1);
                cthd.masp=rs.getString(2);
                cthd.soluong=rs.getInt(3);
                cthd.dongia=rs.getString(4);
                dscthd.add(cthd);
            }
            closeConnect();
        } catch (Exception ex) {
        }
    }
}

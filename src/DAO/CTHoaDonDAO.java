package DAO;

import DTO.ChiTietHoaDon;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CTHoaDonDAO extends MyConnect{
    public ArrayList docDSCTHD(){
        ArrayList dscthd= new ArrayList<ChiTietHoaDon>();
        try{
            getConnect();
            String qry="select * from ChiTietHoaDon";
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
        } catch (SQLException ex) {
            Logger.getLogger(CTHoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    public void sua(ChiTietHoaDon cthd){
        try {
            getConnect();
            String qry="Update ChiTietHoaDon set";
            qry+= " MASP='"+cthd.masp+"'";
            qry+= ",SOLUONG='"+cthd.soluong+"'";
            qry+= ",DONGIA='"+cthd.dongia+"'";
            qry+= " "+"where MaHD='"+cthd.mahd+"'";
            st=conn.createStatement();
            st.executeUpdate(qry);
            closeConnect();
        } catch (Exception e) {
        }
    }
    
}

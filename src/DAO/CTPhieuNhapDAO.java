package DAO;

import DTO.ChiTietPhieuNhap;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CTPhieuNhapDAO extends MyConnect{
    public ArrayList docDSCTPN(){
        ArrayList dsctpn= new ArrayList<ChiTietPhieuNhap>();
        try{
            getConnect();
            String qry= "select * from ChiTietPhieuNhap";
            st=conn.createStatement();
            rs=st.executeQuery(qry);
            while(rs.next()){
                ChiTietPhieuNhap ctpn= new ChiTietPhieuNhap();
                ctpn.mapn= rs.getString(1);
                ctpn.masp= rs.getString(2);
                ctpn.slnhap= rs.getInt(3);                
                ctpn.dgnhap= rs.getString(4);
                dsctpn.add(ctpn);
            }
            closeConnect();
        }catch(SQLException ex){
             Logger.getLogger(CTPhieuNhapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsctpn;
    }
    public void them(ChiTietPhieuNhap ctpn){
        try{
            getConnect();
            String qry="Insert into ChiTietPhieuNhap values (";
            qry += "'"+ctpn.mapn+"'";
            qry += ","+"'"+ctpn.masp+"'";
            qry += ","+ctpn.slnhap;
            qry += ",'"+ctpn.dgnhap+"'";
            qry += ")";
            st= conn.createStatement();
            st.executeUpdate(qry);
            closeConnect();
        }catch (SQLException ex){
             Logger.getLogger(CTPhieuNhapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void sua(ChiTietPhieuNhap ctpn){
        try {
            getConnect();
            String qry="Update ChiTietPhieuNhap set";
            qry+= " MaSP='"+ctpn.masp+"'";
            qry+= ",SLNhap="+ctpn.slnhap;
            qry+= ",DGNhap='"+ctpn.dgnhap+"'";
            qry+= " "+"where MaPN='"+ctpn.mapn+"'";
            st=conn.createStatement();
            st.executeUpdate(qry);
            closeConnect();
        } catch (Exception e) {
        }
    }
}

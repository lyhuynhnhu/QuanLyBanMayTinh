package DAO;

import DTO.NhaSX;

import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NhaSXDAO extends MyConnect{
    public ArrayList docDSNSX(){
        ArrayList dsnsx= new ArrayList<NhaSX>();
        try{
            getConnect();
            String qry="select * from NhaSanXuat";
            st=conn.createStatement();
            rs= st.executeQuery(qry);
            while(rs.next()){
                NhaSX nsx= new NhaSX();
                nsx.Mansx=rs.getString(1);
                nsx.Tennsx=rs.getString(2);
                dsnsx.add(nsx);
            }
            closeConnect();
        } catch (SQLException ex) {
            Logger.getLogger(NhaSXDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsnsx;
    }
    public ArrayList<NhaSX> timTheoTen(String ten){
        ArrayList dsnsx= new ArrayList<NhaSX>();
        try {
            getConnect();
            String qry="select * from NhaSanXuat where TenNSX like '%"+ten+"%'";
            st=conn.createStatement();
            rs= st.executeQuery(qry);
            while (rs.next()) {
                NhaSX nsx= new NhaSX();
                nsx.Mansx=rs.getString(1);
                nsx.Tennsx=rs.getString(2);
                dsnsx.add(nsx);
            }
            closeConnect();
        } catch (Exception e) {
        }
        return dsnsx;
    }
    public ArrayList<NhaSX> timTheoMa(String ma){
        ArrayList dsnsx= new ArrayList<NhaSX>();
        try {
            getConnect();
            String qry="select * from NhaSanXuat where MaNSX like '%"+ma+"%'";
            st=conn.createStatement();
            rs= st.executeQuery(qry);
            while (rs.next()) {
                NhaSX nsx= new NhaSX();
                nsx.Mansx=rs.getString(1);
                nsx.Tennsx=rs.getString(2);
                dsnsx.add(nsx);
            }
            closeConnect();
        } catch (Exception e) {
        }
        return dsnsx;
    }
}

package DAO;

import DTO.NhaSX;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NhaSXDAO extends MyConnect{
    public ArrayList docDSNSX(){
        ArrayList dsnsx= new ArrayList<NhaSX>();
        String qry="select * from NhaSanXuat";
        getData(qry, dsnsx);
        return dsnsx;
    }
    
    public void them(NhaSX nsx){
        try {
            getConnect();
            String qry="Insert into NhaSanXuat values(";
            qry+= "'"+nsx.Mansx+"'";
            qry+= ","+"'"+nsx.Tennsx+"'";
            qry+= ")";
            st=conn.createStatement();
            st.executeUpdate(qry);
            closeConnect();
        } catch (SQLException ex) {
            Logger.getLogger(NhaSXDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void xoa(String ma){
        try {
            getConnect();
            String qry="Delete from NhaSanXuat where MaNSX='"+ma+"'";
            st=conn.createStatement();
            st.executeUpdate(qry);
            closeConnect();
        } catch (Exception e) {
        }
    }
    public void sua(NhaSX nsx){
        try {
            getConnect();
            String qry="Update NhaSanXuat set";
            qry+= " TenNSX='"+nsx.Tennsx+"'";
            qry+= " "+"where MaNSX='"+nsx.Mansx+"'";
            st=conn.createStatement();
            st.executeUpdate(qry);
            closeConnect();
        } catch (Exception e) {
        }
    }
    
    public ArrayList<NhaSX> timTheoTen(String ten){
        ArrayList dsnsx= new ArrayList<NhaSX>();
        String qry="select * from NhaSanXuat where TenNSX like '%"+ten+"%'";
        getData(qry, dsnsx);
        return dsnsx;
    }
    public ArrayList<NhaSX> timTheoMa(String ma){
        ArrayList dsnsx= new ArrayList<NhaSX>();
        String qry="select * from NhaSanXuat where MaNSX like '%"+ma+"%'";
        getData(qry, dsnsx);
        return dsnsx;
    }
    
    public void getData(String qry, ArrayList dsnsx){
        try {
            getConnect();
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
    }
}
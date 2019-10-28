package DAO;

import DTO.PhieuNhap;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PhieuNhapDAO extends MyConnect{
    public ArrayList docDSPN(){
        ArrayList dspn= new ArrayList<PhieuNhap>();
        try{
            getConnect();
            String qry= "select * from phieunhap";
            st=conn.createStatement();
            rs=st.executeQuery(qry);
            while(rs.next()){
                PhieuNhap pn=new PhieuNhap();
                pn.mapn= rs.getString(1);
                pn.mansx= rs.getString(2);
                pn.manv= rs.getString(3);                
                pn.ngaylap= rs.getString(4);
                dspn.add(pn);
            }
            closeConnect();
        }catch(SQLException ex){
             Logger.getLogger(PhieuNhapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dspn;
    }
    public void them(PhieuNhap pn){
        try{
            getConnect();
            String qry="Insert into phieunhap values (";
            qry += "'"+pn.mapn+"'";
            qry += ","+"'"+pn.mansx+"'";
            qry += ","+"'"+pn.manv+"'";
            qry += ",'"+pn.ngaylap+"'";
            qry += ")";
            st= conn.createStatement();
            st.executeUpdate(qry);
            closeConnect();
        }catch (SQLException ex){
             Logger.getLogger(PhieuNhapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void sua(PhieuNhap pn){
        try {
            getConnect();
            String qry="Update phieunhap set";
            qry+= " MaNSX='"+pn.mansx+"'";
            qry+= ",MaNV='"+pn.manv+"'";
            qry+= ",NgayLap='"+pn.ngaylap+"'";
            qry+= " "+"where MaPN='"+pn.mapn+"'";
            st=conn.createStatement();
            st.executeUpdate(qry);
            closeConnect();
        } catch (Exception e) {
        }
    }
    public ArrayList<PhieuNhap> timTheongay(String tu, String den){
        ArrayList dspn= new ArrayList<PhieuNhap>();
        try {
            getConnect();
            String qry="select * from phieunhap where NgayLap>='"+tu+"' and NgayLap<='"+den+"'";
            st=conn.createStatement();
            rs= st.executeQuery(qry);
            while (rs.next()) {
                PhieuNhap pn= new PhieuNhap();
                pn.mapn= rs.getString(1);
                pn.mansx= rs.getString(2);
                pn.manv= rs.getString(3);                
                pn.ngaylap= rs.getString(4);
                dspn.add(pn);
            }
            closeConnect();
        } catch (Exception e) {
        }
        return dspn;
    }
}

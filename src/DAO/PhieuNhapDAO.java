package DAO;

import DTO.PhieuNhap;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PhieuNhapDAO extends MyConnect{
    public ArrayList docDSPN(){
        ArrayList dspn= new ArrayList<PhieuNhap>();
        String qry= "select * from phieunhap";
        getData(qry, dspn);
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
    public void xoa(String ma){
        try {
            getConnect();
            String qry="Delete from PhieuNhap where MaPN='"+ma+"'";
            st=conn.createStatement();
            st.executeUpdate(qry);
            closeConnect();
        } catch (Exception e) {
        }
    }
    public ArrayList<PhieuNhap> timTheongay(String tu, String den){
        ArrayList dspn= new ArrayList<PhieuNhap>();
        String qry="select * from phieunhap where NgayLap>='"+tu+"' and NgayLap<='"+den+"'";
        getData(qry, dspn);
        return dspn;
    }
    public ArrayList<PhieuNhap> timTheomapn(String ma){
        ArrayList dspn= new ArrayList<PhieuNhap>();
        String qry="select * from PhieuNhap where MaPN like '%"+ma+"%'";
        getData(qry, dspn);
        return dspn;
    }
    public ArrayList<PhieuNhap> timTheonhasx(String nsx){
        ArrayList dspn= new ArrayList<PhieuNhap>();
        String qry="select * from PhieuNhap where MaNSX like '%"+nsx+"%'";
        getData(qry, dspn);
        return dspn;
    }
    public ArrayList<PhieuNhap> timTheonv(String nv){
        ArrayList dspn= new ArrayList<PhieuNhap>();
        String qry="select * from PhieuNhap where MaNV like '%"+nv+"%'";
        getData(qry, dspn);
        return dspn;
    }
    public void getData(String qry, ArrayList dspn){
        try {
            getConnect();           
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
    }     
}

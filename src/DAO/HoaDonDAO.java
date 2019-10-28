package DAO;

import BUS.HoaDonBUS;
import DTO.HoaDon;
import java.util.List;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HoaDonDAO extends MyConnect{
    public ArrayList docDSHD(){
        ArrayList dshd= new ArrayList<HoaDon>();
        try{
            getConnect();
            String qry="select * from HoaDon";
            st=conn.createStatement();
            rs= st.executeQuery(qry);
            while(rs.next()){
                HoaDon hd= new HoaDon();
                hd.mahd=rs.getString(1);
                hd.makh=rs.getString(2);
                hd.manv=rs.getString(3);
                hd.ngaylap=rs.getString(4);
                hd.makm=rs.getString(5);
                hd.tongtien=rs.getString(6);
                dshd.add(hd);
            }
            closeConnect();
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dshd;
    }
    public void them(HoaDon hd){
        try {
            getConnect();
            String qry="Insert into HoaDon values(";
            qry+= "'"+hd.mahd+"'";
            qry+= ","+"'"+hd.makh+"'";
            qry+= ","+"'"+hd.manv+"'";           
            qry+= ","+"'"+hd.ngaylap+"'";
            qry+= ","+"'"+hd.makm+"'";
            qry+= ","+"'"+hd.tongtien+"'";
            qry+= ")";
            st=conn.createStatement();
            st.executeUpdate(qry);
            closeConnect();
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void xoa(String ma){
        try {
            getConnect();
            String qry="Delete from HoaDon where MaHD='"+ma+"'";
            st=conn.createStatement();
            st.executeUpdate(qry);
            closeConnect();
        } catch (Exception e) {
        }
    }
    
    public void sua(HoaDon hd){
        try {
            getConnect();
            String qry="Update HoaDon set";
            qry+= " MaKH='"+hd.makh+"'";
            qry+= ",MaNV='"+hd.manv+"'";
            qry+= ",NgayLap='"+hd.ngaylap+"'";
            qry+= ",MaKM='"+hd.makm+"'";
            qry+= ",TongTien='"+hd.tongtien+"'";            
            qry+= " "+"where MaHD='"+hd.mahd+"'";
            st=conn.createStatement();
            st.executeUpdate(qry);
            closeConnect();
        } catch (Exception e) {
        }
    }
    public ArrayList<HoaDon> timTheongay(String tu, String den){
        ArrayList dshd= new ArrayList<HoaDon>();
        try {
            getConnect();
            String qry="select * from hoadon where NgayLap>='"+tu+"' and NgayLap<='"+den+"'";
            st=conn.createStatement();
            rs= st.executeQuery(qry);
            while (rs.next()) {
                HoaDon hd=new HoaDon();
                hd.mahd=rs.getString(1);
                hd.makh=rs.getString(2);
                hd.manv=rs.getString(3);
                hd.ngaylap=rs.getString(4);
                hd.makm=rs.getString(5);
                hd.tongtien=rs.getString(6);
                dshd.add(hd);
            }
            closeConnect();
        } catch (Exception e) {
        }
        return dshd;
    }
}

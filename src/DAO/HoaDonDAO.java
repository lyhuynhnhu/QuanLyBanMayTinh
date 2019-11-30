package DAO;

import DTO.HoaDon;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HoaDonDAO extends MyConnect{
    public ArrayList docDSHD(){
        ArrayList dshd= new ArrayList<HoaDon>();
        String qry="select * from hoadon";
        getData(qry, dshd);
        return dshd;
    }
    public void them(HoaDon hd){
        try {
            getConnect();
            String qry="Insert into hoadon values(";
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
    public int demsl() throws SQLException{
        getConnect();
        String sql="SELECT COUNT(MaHD) from hoadon";
     st=conn.createStatement();
         return st.executeUpdate(sql);
    }
    public void xoa(String ma){
        try {
            getConnect();
            String qry="Delete from hoadon where MaHD='"+ma+"'";
            st=conn.createStatement();
            st.executeUpdate(qry);
            closeConnect();
        } catch (Exception e) {
        }
    }
    public ArrayList<HoaDon> timTheongay(String tu, String den){
        ArrayList dshd= new ArrayList<HoaDon>();
        String qry="select * from hoadon where NgayLap>='"+tu+"' and NgayLap<='"+den+"'";
        getData(qry, dshd);
        return dshd;
    }
    public ArrayList<HoaDon> timTheoMaHD(String ma){
        ArrayList dshd= new ArrayList<HoaDon>();
        String qry="select * from hoadon where MaHD like '%"+ma+"%'";
        getData(qry, dshd);
        return dshd;
    }
    public ArrayList<HoaDon> timTheoMaKH(String ma){
        ArrayList dshd= new ArrayList<HoaDon>();
        String qry="select * from hoadon where MaKH like '%"+ma+"%'";
        getData(qry, dshd);
        return dshd;
    }
    public ArrayList<HoaDon> timTheoMaNV(String ma){
        ArrayList dshd= new ArrayList<HoaDon>();
        String qry="select * from hoadon where MaNV like '%"+ma+"%'";
        getData(qry, dshd);
        return dshd;
    }
    public ArrayList<HoaDon> timTheoMaKM(String ma){
        ArrayList dshd= new ArrayList<HoaDon>();
        String qry="select * from hoadon where MaKM like '%"+ma+"%'";
        getData(qry, dshd);
        return dshd;
    }
    public void getData(String qry, ArrayList dshd){
        try {
            getConnect();           
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
    }
}

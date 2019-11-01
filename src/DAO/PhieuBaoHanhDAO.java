package DAO;

import DTO.PhieuBaoHanh;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PhieuBaoHanhDAO extends MyConnect{
    public ArrayList docDSPBH(){
        ArrayList dspbh= new ArrayList<PhieuBaoHanh>();
        String sqlString="select * from PhieuBaoHanh";
        getData(sqlString, dspbh);
        return dspbh;
    }
    
    public void them(PhieuBaoHanh bh){
        try {
            getConnect();
            String sql="Insert into PhieuBaoHanh values(";
            sql+= "'"+bh.MaBH+"'";
            sql+= ",'"+bh.MaHD+"'";
            sql+= ",'"+bh.MaSP+"'";
            sql+= ",'"+bh.Loai+"'";
            sql+= ",'"+bh.TinhTrang+"')";
            st=conn.createStatement();
            st.executeUpdate(sql);
            closeConnect();
        } catch (Exception e) {
            Logger.getLogger(PhieuBaoHanhDAO.class.getName()).log(Level.SEVERE, null, e);            
        }
    }
    public void xoa(String ma){
        try {
            getConnect();
            String qry="Delete from PhieuBaoHanh where MaBH='"+ma+"'";
            st=conn.createStatement();
            st.executeUpdate(qry);
            closeConnect();
        } catch (Exception e) {
        }
    }    
    public void sua(PhieuBaoHanh bh){
        try {
            getConnect();
            String sql="Update PhieuBaoHanh set";
            sql+= " MaHD='"+bh.MaHD+"'";
            sql+= ",MaSP='"+bh.MaSP+"'";
            sql+= ",Loai='"+bh.Loai+"'";
            sql+= ",TinhTrang='"+bh.TinhTrang+"'";
            sql+= " where MaBH='"+bh.MaBH+"'";
            st=conn.createStatement();
            st.executeUpdate(sql);
            closeConnect();
        } catch (Exception e) {
        }
    }
    
    public ArrayList<PhieuBaoHanh> timTheoMaBH(String ma){
        ArrayList dspbh= new ArrayList<PhieuBaoHanh>();
        String qry="select * from PhieuBaoHanh where MaBH like '%"+ma+"%'";
        getData(qry, dspbh);
        return dspbh;
    }
    public ArrayList<PhieuBaoHanh> timTheoMaHD(String ma){
        ArrayList dspbh= new ArrayList<PhieuBaoHanh>();
        String qry="select * from PhieuBaoHanh where MaHD like '%"+ma+"%'";
        getData(qry, dspbh);
        return dspbh;
    }
    public ArrayList<PhieuBaoHanh> timTheoMaSP(String ma){
        ArrayList dspbh= new ArrayList<PhieuBaoHanh>();
        String qry="select * from PhieuBaoHanh where MaSP like '%"+ma+"%'";
        getData(qry, dspbh);
        return dspbh;
    }
    public ArrayList<PhieuBaoHanh> timTheoLoai(String loai){
        ArrayList dspbh= new ArrayList<PhieuBaoHanh>();
        String qry="select * from PhieuBaoHanh where Loai like '%"+loai+"%'";
        getData(qry, dspbh);
        return dspbh;
    }
    public void getData(String qry, ArrayList dspbh){
        try {
            getConnect();
            st=conn.createStatement();
            rs= st.executeQuery(qry);
            while (rs.next()) {
                PhieuBaoHanh bh= new PhieuBaoHanh();
                bh.MaBH=rs.getString(1);
                bh.MaHD=rs.getString(2);
                bh.MaSP=rs.getString(3);
                bh.Loai=rs.getString(4);
                bh.TinhTrang=rs.getString(5);
                dspbh.add(bh);
            }
            closeConnect();
        } catch (Exception e) {
        }
    }
}
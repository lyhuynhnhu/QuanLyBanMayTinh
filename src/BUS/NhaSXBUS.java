package BUS;

import DTO.NhaSX;
import DAO.NhaSXDAO;
import java.util.ArrayList;

public class NhaSXBUS {
    static ArrayList<NhaSX> dsnsx;
    public ArrayList<NhaSX> docDSNSX(){
        NhaSXDAO data= new NhaSXDAO();
        if(dsnsx==null){
        } else {
            dsnsx= new ArrayList<NhaSX>();
        } 
        dsnsx= data.docDSNSX();
        return dsnsx;
    }
    public void them(NhaSX nhasxDTO){
        NhaSXDAO data= new NhaSXDAO();
        data.them(nhasxDTO);
        dsnsx.add(nhasxDTO);
    }
    public void sua(NhaSX nhasxDTO){
        NhaSXDAO data= new NhaSXDAO();
        data.sua(nhasxDTO);
        dsnsx.add(nhasxDTO);
    }
    public void xoa(String x){
        NhaSXDAO data= new NhaSXDAO();
        data.xoa(x);
    }
    public ArrayList<NhaSX> timTheoten(String ten){
        NhaSXDAO data=new NhaSXDAO();
        dsnsx=data.timTheoTen(ten);
        return dsnsx;
    }
    public ArrayList<NhaSX> timTheoma(String ma){
        NhaSXDAO data=new NhaSXDAO();
        dsnsx=data.timTheoMa(ma);
        return dsnsx;
    }
}

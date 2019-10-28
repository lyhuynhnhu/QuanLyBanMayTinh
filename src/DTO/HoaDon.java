package DTO;

public class HoaDon {
    public String mahd, makh, manv, ngaylap, makm, tongtien;
    
    public String getmahd(){
        return mahd;
    }
    public void setmahd(String mahd){
        this.mahd=mahd;
    }
    
    public String getmakh(){
        return makh;
    }
    public void setmakh(String makh){
        this.makh=makh;
    }
    
    public String getngaylap(){
        return ngaylap;
    }
    public void setngaylap(String ngaylap){
        this.ngaylap=ngaylap;
    }
    
    public String getmanv(){
        return manv;
    }
    public void setmanv(String manv){
        this.manv=manv;
    }
    
    public String gettongtien(){
        return tongtien;
    }
    public void settongtien(String tongtien){
        this.tongtien=tongtien;
    }
    
    public String getMaKM(){
        return makm;
    }
    public void setMaKM(String makm){
        this.makm=makm;
    }
    
    public HoaDon(){
        
    }
    public HoaDon(String mahd, String makh, String ngaylap, String manv, String makm, String tongtien){
        this.mahd=mahd;
        this.makh=makh;
        this.ngaylap=ngaylap;
        this.manv=manv;
        this.makm=makm;
        this.tongtien=tongtien;
        
    }
}

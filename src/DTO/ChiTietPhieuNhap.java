package DTO;

public class ChiTietPhieuNhap {
    public String mapn,masp;
    public int slnhap;
    public String dgnhap;
    
    public String getmapn(){
        return mapn;
    }
    public void setmapn(String mapn){
        this.mapn=mapn;
    }
    public String getmasp(){
        return masp;
    }
    public void setmasp(String masp){
        this.masp=masp;
    }
    public int getslnhap(){
        return slnhap;
    }
    public void setslnhap(int slnhap){
        this.slnhap=slnhap;
    }

    public String getDgnhap() {
        return dgnhap;
    }

    public void setDgnhap(String dgnhap) {
        this.dgnhap = dgnhap;
    }
    
    public ChiTietPhieuNhap(){
        
    }
    public ChiTietPhieuNhap( String mapn, String masp, int slnhap, String dgnhap){
        this.mapn=mapn;
        this.masp=masp;
        this.slnhap=slnhap;
        this.dgnhap=dgnhap;
        
    }
}

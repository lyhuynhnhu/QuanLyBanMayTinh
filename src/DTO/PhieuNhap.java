package DTO;

public class PhieuNhap {
    public String mapn, ngaylap, manv, mansx;

    public String getMapn() {
        return mapn;
    }

    public void setMapn(String mapn) {
        this.mapn = mapn;
    }

    public String getNgaylap() {
        return ngaylap;
    }

    public void setNgaylap(String ngaylap) {
        this.ngaylap = ngaylap;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getMansx() {
        return mansx;
    }

    public void setMansx(String mansx) {
        this.mansx = mansx;
    }
    
    public PhieuNhap(){
        
    }
    public PhieuNhap(String mapn, String ngaylap, String nsx, String manv){
        this.mapn=mapn;
        this.ngaylap=ngaylap;
        this.manv=manv;
        this.mansx=nsx;
    }
}

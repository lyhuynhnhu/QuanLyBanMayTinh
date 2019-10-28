package DTO;

public class KhuyenMai {
    public String MaKM, TenKM, GiaTri, NgayBD, NgayKT;

    public KhuyenMai(String MaKM, String TenKM, String GiaTri, String NgayBD, String NgayKT){
        this.MaKM=MaKM;
        this.TenKM=TenKM;
        this.GiaTri=GiaTri;
        this.NgayBD=NgayBD;
        this.NgayKT=NgayKT;
    }
    
    public KhuyenMai(){
        
    }
    public String getMaKM() {
        return MaKM;
    }

    public void setMaKM(String MaKM) {
        this.MaKM = MaKM;
    }

    public String getTenKM() {
        return TenKM;
    }

    public void setTenKM(String TenKM) {
        this.TenKM = TenKM;
    }

    public String getGiaTri() {
        return GiaTri;
    }

    public void setGiaTri(String GiaTri) {
        this.GiaTri = GiaTri;
    }

    public String getNgayBD() {
        return NgayBD;
    }

    public void setNgayBD(String NgayBD) {
        this.NgayBD = NgayBD;
    }

    public String getNgayKT() {
        return NgayKT;
    }

    public void setNgayKT(String NgayKT) {
        this.NgayKT = NgayKT;
    }
    
}

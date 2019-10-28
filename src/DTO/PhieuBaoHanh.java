package DTO;

public class PhieuBaoHanh {
    public String MaBH, MaHD, MaSP, TinhTrang, Loai;

    public PhieuBaoHanh(String MaBH, String MaHD, String MaSP, String TinhTrang, String Loai){
        this.MaBH=MaBH;
        this.MaHD=MaHD;
        this.MaSP=MaSP;
        this.Loai=Loai;
        this.TinhTrang=TinhTrang;
    }
    public PhieuBaoHanh(){
        
    }
    public String getMaBH() {
        return MaBH;
    }

    public void setMaBH(String MaBH) {
        this.MaBH = MaBH;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }
    
}

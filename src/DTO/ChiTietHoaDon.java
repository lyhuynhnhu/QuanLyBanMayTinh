package DTO;

public class ChiTietHoaDon {
    public  String mahd;
    public String masp;
    public int soluong;
    public String dongia;

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getDongia() {
        return dongia;
    }

    public void setDongia(String dongia) {
        this.dongia = dongia;
    }

    
    public ChiTietHoaDon(){
        
    }
    public ChiTietHoaDon(String mahd, String masp, int soluong, String dongia){
        this.mahd=mahd;
        this.masp=masp;
        this.soluong=soluong;
        this.dongia=dongia;
    }
    
}

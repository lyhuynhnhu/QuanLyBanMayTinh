
package DTO;

public class SanPham {
    public String masp;
    public String tensp;
    public String xuatxu;
    public String nsx;
    public String tgbaohanh;
    public float kichthuoc;
    public float khluong;
    public int sl;
    public String dongia;
    public String ghichu;
    
    public SanPham(String ma, String tensp, String tgbh, String xx, String nsx, float kt, float  kl, int sl, String dg){
        this.masp=ma;
        this.tensp=tensp;
        this.xuatxu=xx;
        this.nsx=nsx;
        this.tgbaohanh=tgbh;
        this.kichthuoc=kt;
        this.khluong=kl;
        this.sl=sl;
        this.dongia=dg;
    }
    
    public SanPham(){
        
    }

    public String getMa(){
        return masp;
    }
    public void setMa(String ma){
        this.masp=ma;
    }
    
    public String getTenSP(){
        return tensp;
    }
    public void setTenSP(String tensp){
        this.tensp=tensp;
    }   
    
    public String getTGBaoHanh(){
        return tgbaohanh;
    }
    public void setTGBaoHanh(String tgbh){
        this.tgbaohanh=tgbh;
    }
    
    public String getXuatXu(){
        return xuatxu;
    }
    public void setXuatXu(String xx){
        this.xuatxu=xx;
    }
    
    public String getNSX(){
        return nsx;
    }
    public void setNSX(String nsx){
        this.nsx=nsx;
    }
    
    public float getKthuoc(){
        return kichthuoc;
    }
    public void setKthuoc(float kt){
        this.kichthuoc=kt;
    }
    
    public float getKluong(){
        return khluong;
    }
    public void setKluong(float kl){
        this.khluong=kl;
    }
    
    public int getSL(){
        return sl;
    }
    public void setSL(int sl){
        this.sl=sl;
    }
    
    public String getDG(){
        return dongia;
    }
    public void setDG(String dg){
        this.dongia=dg;
    }
      
}



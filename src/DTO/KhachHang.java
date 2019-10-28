package DTO;

public class KhachHang {
    public String makh, tenkh, diachi, dienthoai, LoaiKH;
    public int diem;
    
    public String getmakh(){
        return makh;
    }
    public void setmakh(String makh){
        this.makh=makh;
    }
    
    public String gettenkh(){
        return tenkh;
    }
    public void settenkh(String tenkh){
        this.tenkh=tenkh;
    }
    
    public String getdiachi(){
        return diachi;
    }
    public void setdiachi(String diachi){
        this.diachi=diachi;
    }
    
    public String getsdt(){
        return dienthoai;
    }
    public void setsdt(String tensdt){
        this.dienthoai=tensdt;
    }
    
    public String getLoai(){
        return LoaiKH;
    }
    public void setLoai(String loai){
        this.LoaiKH=loai;
    }
    
    public int getDiem(){
        return diem;
    }
    public void setDiem(int diem){
        this.diem=diem;
    }
    
    public KhachHang(){
        
    }
    public KhachHang(String makh, String tenkh, String diachi, String sdt, String loai, int diem){
        this.makh=makh;
        this.tenkh=tenkh;
        this.diachi=diachi;
        this.dienthoai=sdt;
        this.LoaiKH=loai;
        this.diem=diem;
    }
    
}

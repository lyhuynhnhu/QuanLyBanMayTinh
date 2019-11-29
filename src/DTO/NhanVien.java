package DTO;

public class NhanVien {

    public String MaNV;
    public String Ten;
    public String GioiTinh;
    public String DiaChi;
    public String Dthoai;
    public String NgaySinh;
    public String ChucVu;
    public int Luong;
    public String TenTK;
    public String MatKhau;
    
    public NhanVien(){
        
    }
    public NhanVien(String MaNV, String Ten,String GioiTinh, String Dthoai, String NgaySinh, String DiaChi, String ChucVu, int Luong, String TenTK, String MatKhau)
    {
        this.MaNV = MaNV;
        this.Ten = Ten;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.DiaChi = DiaChi;
        this.Dthoai = Dthoai;
        this.ChucVu = ChucVu;
        this.Luong = Luong ;
        this.TenTK = TenTK;
        this.MatKhau = MatKhau;
    }
    
    public String getMaNV() {
        return MaNV;
    }
    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    } 
    
    public String getTen()
    {
        return Ten;
    }
    public void setTen(String Ten)
    {
        this.Ten=Ten;
    }

    public String getTenTK() {
        return TenTK;
    }

    public void setTenTK(String TenTK) {
        this.TenTK = TenTK;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }
    
    public String getGioiTinh()
    {
        return GioiTinh;
    }
    public void setGioiTinh(String GioiTinh)
    {
        this.GioiTinh=GioiTinh;
    }
    
    public String getNgaySinh()
    {
        return NgaySinh;
    }
    public void setNgaySinh(String NgaySinh)
    {
        this.NgaySinh=NgaySinh;
    }
    
    public String getDiaChi()
    {
        return DiaChi;
    }
    public void setDiaChi(String DiaChi)
    {
        this.DiaChi=DiaChi;
    }
    
    public String getDthoai()
    {
        return Dthoai;
    }
    public void setDthoai(String dt)
    {
        this.Dthoai=dt;
    }
    
    public String getChucVu()
    {
        return ChucVu;
    }
    public void setChucVu(String ChucVu)
    {
        this.ChucVu=ChucVu;
    }
    
    public float getLuong()
    {
        return Luong;
    }
    public void setLuong(int Luong)
    {
        this.Luong=Luong;
    }
    
}

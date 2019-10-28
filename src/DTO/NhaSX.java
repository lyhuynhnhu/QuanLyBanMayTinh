package DTO;

public class NhaSX {
    public String Mansx, Tennsx;
    
    public NhaSX(String ma, String ten){
        this.Mansx=ma;
        this.Tennsx=ten;
    }
    
    public NhaSX(){
        
    }

    public String getMa(){
        return Mansx;
    }
    public void setMa(String ma){
        this.Mansx=ma;
    }
    
    public String getTenSX(){
        return Tennsx;
    }
    public void setTenSX(String ten){
        this.Tennsx=ten;
    } 
}

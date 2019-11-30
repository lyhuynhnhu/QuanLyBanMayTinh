/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author ADMIN
 */
public class Thongke {
    String mahd;
    String masp;
    String tensp;
    String ngaylap;
    String nv;
    int soluong;
    float dongia;
    float thanhtien;
    public Thongke(){}
    public Thongke(String mahd, String masp, String tensp, String ngaylap, String nv, int soluong, float dongia, float thanhtien)
    {
        this.mahd=mahd;
        this.masp=masp;
        this.tensp=tensp;
        this.ngaylap=ngaylap;
        this.nv=nv;
        this.soluong=soluong;
        this.dongia=dongia;
        this.thanhtien=thanhtien;
    }
    
}

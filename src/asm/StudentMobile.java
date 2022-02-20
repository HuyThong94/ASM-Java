/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm;

import java.util.Scanner;

/**
 *
 * @author Luong Huy Thong
 */
public class StudentMobile extends Student{
    double diemJava;
    double diemAndroid;
    double diemQuanLyDuAn;
    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemAndroid() {
        return diemAndroid;
    }

    public void setDiemAndroid(double diemAndroid) {
        this.diemAndroid = diemAndroid;
    }

    public double getDiemQuanLyDuAn() {
        return diemQuanLyDuAn;
    }

    public void setDiemQuanLyDuAn(double diemQuanLyDuAn) {
        this.diemQuanLyDuAn = diemQuanLyDuAn;
    }
    public StudentMobile(){
        
    }
     public StudentMobile(int maSV, String ten, double diemJava,double diemAndroid, double diemQuanLyDuAn){
        this.maSV = maSV;
        this.tenSV = ten;
        this.diemJava=diemJava;
        this.diemAndroid=diemAndroid;
        this.diemQuanLyDuAn=diemQuanLyDuAn;
     }
   void nhapDuLieu(){
        Scanner ip=new Scanner (System.in);
        super.nhapDuLieu();
        System.out.println("Nhập Điểm Java Của Sinh Viên:");
        diemJava=ip.nextDouble();
        System.out.println("Nhập Điểm Android:");
        diemAndroid=ip.nextDouble();
        System.out.println("Nhập Điểm Quản Lý Dự Án:");
        diemQuanLyDuAn=ip.nextDouble();
        
    }
   void hienThiDuLieu(){
       super.hienThiDuLieu();
        System.out.println("Nhập Điểm Java Của Sinh Viên"+diemJava);
        System.out.println("Nhập Điểm Android"+diemAndroid);
        System.out.println("Nhập Điểm Quản Lý Dự Án"+diemQuanLyDuAn);
        System.out.println("Điểm TRung Bình"+dtrungbinh());
   }
   double dtrungbinh(){        
        return (diemJava+diemAndroid+diemQuanLyDuAn)/3.0;
    }
}

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
public class Student {
    int maSV;
    String tenSV;
    String lop;
    String nganhhoc;
    int dtrungbinh;
   
    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNganhhoc() {
        return nganhhoc;
    }

    public void setNganhhoc(String nganhhoc) {
        this.nganhhoc = nganhhoc;
    }

    public int getDtrungbinh() {
        return dtrungbinh;
    }

    public void setDtrungbinh(int dtrungbinh) {
        this.dtrungbinh = dtrungbinh;
    }
    void nhapDuLieu(){
       Scanner ip= new Scanner(System.in);
       System.out.println("Ten:");
       tenSV= ip.nextLine(); 
       System.out.println("Lop:");
       lop= ip.nextLine();
       System.out.println("Nganh hoc:");
       nganhhoc= ip.nextLine();
       System.out.println("Ma so:");
       maSV= ip.nextInt();
       System.out.println("============******===========");
    }
    void hienThiDuLieu(){
        System.out.println("Ten sinh vien"+tenSV);
        System.out.println("Lop hoc"+lop);
        System.out.println("Nganh hoc"+nganhhoc);
        System.out.println("Ma so"+maSV); 
    }
    //phuong thuc khoi tao khong tham so
    Student() {
        maSV=1;
        tenSV="no name";
        lop="no name";
        nganhhoc="no name";
    }
    //Phung thuc khoi tao co tham so
    public Student(int maSV, String ten, String lop, String nganhhoc) {
        this.maSV = maSV;
        this.tenSV = ten;
        this.lop = lop;
        this.nganhhoc = nganhhoc;
    }
}

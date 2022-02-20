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
public class ASM {

    public static void main(String[] args) {
       int Choice;
        StudentList obj = new StudentList();
        do{
            Scanner input =new Scanner(System.in);
            System.out.println("=============*******============");
            System.out.println("Moi Chon Cong Viec : 1==>6");
            System.out.println("1.Them moi ");
            System.out.println("2.Xuat Danh Sach");
            System.out.println("3.Tim Kiem");
            System.out.println("4.Xoa");
            System.out.println("5.Bang xep hang");
            System.out.println("6.Diem Trung Binh cao nhat: ");
            System.out.println("7.Thoat");
            System.out.println("=============*******============");
            Choice=input.nextInt();
            switch(Choice){
            case 1:
                    System.out.println(" Them Moi Sinh Vien");
                    int n=input.nextInt();
                    for (int i = 0; i <n; i++) {
                        obj.themMoi();
                        }
                    break;
            case 2:
                    System.out.println("Xuat Danh sach sinh vien");
                    obj.xuatDSSV();
                    break;
            case 3:
                    System.out.println("Tim Sinh Vien :"+ "Nhap ma Sinh Vien can tim");
                    int maSV=input.nextInt();
                    if(obj.timSV(maSV)==-1)
                        System.out.println("khong tim thay");
                    else
                        System.out.println("Da Tim Thay");
                    break;
            case 4:
                    System.out.print("Xoa Sinh Vien");
                    System.out.print( "Nhap ma Sinh Vien can xoa: ");
                    int ss= input.nextInt();
                    obj.xoaSV(ss);
                    break;
            case 5:
                    System.out.println("bang xep hang cua sinh vien");
                    obj.bangXepHang();
                    obj.xuatDSSV();
                    break;
            case 6:
                    System.out.println("xuat Sinh vien co diem trung binh cao nhat");
                    System.out.println("nhap so luong sinh vien can xuat");
                    int xx=input.nextInt();
                    obj.bangKhenThuong(xx);
                    break;
            case 7: 
                    System.exit(0);
                    default :
                    System.out.println("ban lua chon cong viec sai"+"tien hanh buoc 1 cua cong viec");
                    Choice=1;
                    break;
            }
        }while(Choice>0 && Choice <7);        
    }
}

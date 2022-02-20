/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm;

/**
 *
 * @author Luong Huy Thong
 */
public class StudentList {
    StudentMobile []ds;
        int soLuong;
        public StudentList() {
        soLuong=0;
        ds= new StudentMobile[20];
    }
    
    void themMoi(){
        StudentMobile svMoi= new StudentMobile();
        svMoi.nhapDuLieu();
        ds[soLuong]=svMoi;
        soLuong++;
    }
    void xuatDSSV(){
        for(int i=0; i<soLuong; i++){
        System.out.println("Sinh vien thu "+i+":");
        ds[i].hienThiDuLieu();
    }       
}

  
    public abstract class DiemTB {}
    void xoaSV(int idXoa){
        int n=timSV(idXoa);
        if (n>=0){
            for(int i=n+1; i<soLuong; i++){
                ds[i-1]=ds[i];
            }
            soLuong--;
            System.out.println("DANH SACH SV CON LAI:");
            xuatDSSV();
        }else
            System.out.println("SV khong tim thay");
        
    }
    
    int timSV(int maSV){
        int kq=-1; 
        for(int i=0; i<soLuong; i++){
            if(ds[i].maSV==maSV){
                kq=i;
                System.out.println("SV DA Tim Thay:");
                ds[i].hienThiDuLieu();
                break;
            }
                
        }
        return kq;
    }
     public void bangXepHang(){
             for(int i=soLuong-1; i>0; i--){
             for (int j=i-1;j>=0;j--){  
             if(ds[i].dtrungbinh() >ds[j].dtrungbinh()){
             StudentMobile sv;
             sv=ds[i];
             ds[i]=ds[j];    
             ds[j]=sv;
            }
        }  
    }   
}
     public void bangKhenThuong(int n){
        bangXepHang();
        for(int i=0; i<n; i++)
        ds[i].hienThiDuLieu();
    }
}

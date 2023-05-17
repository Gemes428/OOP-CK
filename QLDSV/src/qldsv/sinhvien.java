/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qldsv;

/**
 *
 * @author admin
 */
import java.util.List;

public class sinhvien extends person {
    private String maSV; // Mã sinh viên
    private float diemLT, diemTH; // Điểm LT TH của sinh viên

    // Constructor

    public sinhvien() {
    }

    public sinhvien(String maSV, String fullname, String address, float diemLT, float diemTH) {
        super(fullname, address);
        this.maSV = maSV;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    // Các phương thức getter và setter cho các thuộc tính của sinh viên
    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public float getDiemLT() {
        return this.diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return this.diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public float diemTB(){
        return (diemTH + diemLT)/2;
    }
    
    
    public void xepLoaiHocTap() {
        if (diemTB() >= 9) {
            System.out.printf("%12.5s", "Xuat sac");
        } else if (diemTB() >= 8.0) {
            System.out.printf("%11s", "Gioi");
        } else if (diemTB() >= 7) {
            System.out.printf("%10.5s", "Kha");
        } else if (diemTB() >= 5.0) {
            System.out.printf("%5s", "Trung binh");
        } else {
            System.out.printf("%10.5s", "Yeu");
        }
    }

    // Hàm nhập thông tin sinh viên từ bàn phím
    public static sinhvien nhapsv() {
        String masv = input.inputStr("Nhap masv: ");
        String fullname = input.inputStr("Nhap full name: ");
        String address = input.inputStr("Nhap dia chi: ");
        float diemLT = input.inputFloat("Nhap diem lt: ");
        float diemTH = input.inputFloat("Nhap diem th: ");
        return new sinhvien(masv, fullname, address, diemLT, diemTH);
    }

    @Override
    public String toString() {
        return "sinhvien{" + getMaSV() + "\t" + getFullname() + "\t" + getAddress() + "\t" + getDiemLT() + "\t" + getDiemTH() + "\t" + diemTB() + '}';
    }

}

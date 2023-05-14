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
    private float diemTB; // Điểm trung bình của sinh viên

    // Constructor

    public sinhvien() {
    }

    public sinhvien(String maSV, String fullname, String address, float diemTB) {
        super(fullname, address);
        this.maSV = maSV;
        this.diemTB = diemTB;
    }

    // Các phương thức getter và setter cho các thuộc tính của sinh viên
    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }
    
    public void xepLoaiHocTap() {
        if (diemTB >= 9) {
            System.out.println("Xep loai: Xuat sac");
        } else if (diemTB >= 8.0) {
            System.out.println("Xep loai: Gioi");
        } else if (diemTB >= 7) {
            System.out.println("Xep loai: Kha");
        } else if (diemTB >= 5.0) {
            System.out.println("Xep loai: Trung binh");
        } else {
            System.out.println("Xep loai: Yeu");
        }
    }

    // Hàm nhập thông tin sinh viên từ bàn phím
    public static sinhvien nhapsv() {
        String masv = input.inputStr("Nhap masv: ");
        String fullname = input.inputStr("Nhap full name: ");
        String address = input.inputStr("Nhap dia chi: ");
        float diemTB = input.inputFloat("Nhap diem tb: ");
        return new sinhvien(masv, fullname, address, diemTB);
    }

    // Hàm xuất thông tin sinh viên ra màn hình
    public void xuatsv() {
        System.out.println("Ma sinh vien: " + getMaSV());
        System.out.println("Ten sinh vien: " + getFullname());
        System.out.println("Dia chi: " + getAddress());
        System.out.println("Diem tb: " + getDiemTB());
    }

    @Override
    public String toString() {
        return "sinhvien{" + getMaSV() + "\t" + getFullname() + "\t" + getAddress()+ "\t" + getDiemTB() + '}';
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qldsv;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class monhoc {
    private String mamh;
    private String tenMH; // Tên môn học
    private int soTinChi; // Số tín chỉ của môn học
    private float Diem;

    // Hàm khởi tạo (constructor)
    public monhoc(String mamh, String tenMH, int soTinChi) {
        this.mamh = mamh;
        this.tenMH = tenMH;
        this.soTinChi = soTinChi;
    }

    // Các phương thức getter và setter cho các thuộc tính của môn học

    public String getMamh() {
        return this.mamh;
    }

    public void setMamh(String mamh) {
        this.mamh = mamh;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    public float getDiem() {
        return this.Diem;
    }

    public void setDiem(float Diem) {
        this.Diem = Diem;
    }

    public void nhapmh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mamh: ");
        mamh = sc.nextLine();
        System.out.print("Nhap tenmh: ");
        tenMH = sc.nextLine();
        System.out.print("Nhap so tin chi: ");
        soTinChi = sc.nextInt();
        System.out.print("Nhap diem: ");
        Diem = sc.nextFloat();
    }

    public void xuatmh() {
        System.out.println("MaMH: " + mamh);
        System.out.println("Ten mon hoc: " + tenMH);
        System.out.println("So tin chi: " + soTinChi);
    }

}

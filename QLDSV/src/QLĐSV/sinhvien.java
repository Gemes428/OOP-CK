package QLĐSV;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class sinhvien extends person{
    private String maSV; // Mã sinh viên
    private float diemTB; // Điểm trung bình của sinh viên
    private List<monhoc> dsmh; // Danh sách các môn học của sinh viên

    // Constructor
    public sinhvien(String maSV, String ten) {
        this.maSV = maSV;
        this.dsmh = new ArrayList<>();
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

    public List<monhoc> getDsmh() {
        return this.dsmh;
    }

    public void setDsmh(List<monhoc> dsmh) {
        this.dsmh = dsmh;
    }

    // Thêm một môn học cho sinh viên
    public void themMonHoc(monhoc monHoc) {
        dsmh.add(monHoc);
    }

    // Tính điểm trung bình của sinh viên dựa trên điểm các môn học đã đăng ký
    public void tinhDiemTB() {
        float tongDiem = 0;
        int tongSoTinChi = 0;
        for (monhoc mh : dsmh) {
            tongDiem += mh.getDiem() * mh.getSoTinChi();
            tongSoTinChi += mh.getSoTinChi();
        }
        if (tongSoTinChi > 0) {
            this.diemTB = tongDiem / tongSoTinChi;
        } else {
            this.diemTB = 0;
        }
    }

    // Hàm nhập thông tin sinh viên từ bàn phím
    public void nhapsv() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        this.maSV = sc.nextLine();
    }

    // Hàm xuất thông tin sinh viên ra màn hình
    public void xuatsv() {
        System.out.println("Ma sinh vien: " + this.maSV);
    }


    @Override
    public String toString() {
        return "{" + getMaSV() + "\t" + getDiemTB() + "\t" + getDsmh() + "\t" + "}";
    }

}

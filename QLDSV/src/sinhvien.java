package OOP-CK.QLDSV.src;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class sinhvien {
    private String maSV; // Mã sinh viên
    private String ten; // Tên sinh viên
    private float diemTB; // Điểm trung bình của sinh viên
    private List<monhoc> dsmh; // Danh sách các môn học của sinh viên
    private int namSinh; // Năm sinh của sinh viên
    private String gioiTinh; // Giới tính của sinh viên

    // Constructor
    public sinhvien(String maSV, String ten) {
        this.maSV = maSV;
        this.ten = ten;
        this.dsmh = new ArrayList<>();
    }

    // Các phương thức getter và setter cho các thuộc tính của sinh viên
    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public List<monhoc> getDsMonHoc() {
        return dsmh;
    }

    public void setDsMonHoc(List<monhoc> dsmh) {
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
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        this.maSV = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        this.ten = sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        this.namSinh = sc.nextInt();
        sc.nextLine(); // Đọc bỏ ký tự '\n' trong bộ đệm
        System.out.print("Nhap gioi tinh: ");
        this.gioiTinh = sc.nextLine();
    }

    // Hàm xuất thông tin sinh viên ra màn hình
    public void xuatThongTin() {
        System.out.println("Ma sinh vien: " + this.maSV);
        System.out.println("Ho ten: " + this.ten);
        System.out.println("Nam sinh: " + this.namSinh);
        System.out.println("Gioi tinh: " + this.gioiTinh);
    }

}

package QLĐSV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class QLDSV {
    private List<sinhvien> listsv;
 
    public QLDSV() {
        this.listsv = new ArrayList<>();
    }
 
    // Thêm sinh viên vào danh sách
    public void addsv(sinhvien sv) {
        listsv.add(sv);
    }
 
    // Tìm kiếm sinh viên theo mã sinh viên
    public void findsv(String maSV) {
        boolean found = false;
        for (sinhvien sv : listsv) {
            if (sv.getMaSV().equals(maSV)) {
                System.out.println("Sinh vien co ma SV " + maSV + ":");
                sv.xuatThongTin();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay sinh vien co ma SV " + maSV);
        }
    }
 
    // Hiển thị danh sách sinh viên
    public void hienThilistsv() {
        System.out.println("Danh sach sinh vien:");
        for (sinhvien sv : listsv) {
            sv.xuatThongTin();
        }
    }
 
    // Sắp xếp sinh viên theo điểm
    public void sortsvtheodiem() {
        Collections.sort(listsv, new Comparator<sinhvien>() {
            @Override
            public int compare(sinhvien sv1, sinhvien sv2) {
                float diem1 = sv1.tinhDiemTB();
                float diem2 = sv2.tinhDiemTB();
                return Float.compare(diem2, diem1);
            }
        });
 
        System.out.println("Danh sach sinh vien theo diem:");
        for (sinhvien sv : listsv) {
            sv.xuatThongTin();
        }
    }
 
    // Hàm main để chạy thử chương trình
    public static void main(String[] args) {
        QLDSV qlDiem = new QLDSV();
 
        // Tạo danh sách sinh viên
        sinhvien sv1 = new sinhvien("SV001", "Nguyen Van A", 9, 1999, "Nam");
        sinhvien sv2 = new sinhvien("SV002", "Tran Thi B", 8, 2000, "Nu");
        qlDiem.themsinhvien(sv1);
        qlDiem.themsinhvien(sv2);
 
        // Nhập điểm cho sinh viên
        sv1.nhapDiem(new monhoc("Java", 3));
        sv1.nhapDiem(new monhoc("C++", 4));
        sv2.nhapDiem(new monhoc("Java", 3));
        sv2.nhapDiem(new monhoc("C++", 4));
 
        // Tìm kiếm sinh viên theo mã
        qlDiem.timKiemsinhvien("SV001");
 
        // Hi


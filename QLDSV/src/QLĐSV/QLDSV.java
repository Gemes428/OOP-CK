package QLĐSV;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class QLDSV {
    private ArrayList<sinhvien> listsv = new ArrayList<>();
 
    // Thêm sinh viên vào danh sách
    private void addsv(sinhvien sv) {
        listsv.add(sv);
    }
 
    // Tìm kiếm sinh viên theo mã sinh viên
    private void findsv(String maSV) {
        boolean found = false;
        for (sinhvien sv : listsv) {
            if (sv.getMaSV().equals(maSV)) {
                System.out.println("Sinh vien co ma SV " + maSV + ":");
                sv.xuatsv();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay sinh vien co ma SV " + maSV);
        }
    }
 
    // Hiển thị danh sách sinh viên
    private void hienThilistsv() {
        System.out.println("Danh sach sinh vien:");
        for (sinhvien sv : listsv) {
            sv.xuatsv();
        }
    }
 
    // Sắp xếp sinh viên theo điểm
    private void sortsvtheodiem() {
        Collections.sort(listsv, new Comparator<sinhvien>() {
            @Override
            public int compare(sinhvien sv1, sinhvien sv2) {
                if (sv1.getDiemTB() > sv2.getDiemTB()) {
                    return -1;
                } else if (sv1.getDiemTB() < sv2.getDiemTB()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
 
        System.out.println("Danh sach sinh vien theo diem:");
        for (sinhvien sv : listsv) {
            sv.xuatsv();
        }
    }
    private void menu(int choice){
        
        Scanner sc = new Scanner(System.in);
        
        sinhvien sv = new sinhvien(null, null);
        while (true) {
            System.out.println("===== Quan ly diem sinh vien =====");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Hien thi danh sach sinh vien");
            System.out.println("3. Tim kiem sinh vien theo ma");
            System.out.println("4. Sap xep sinh vien theo diem");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("=================================");

            System.out.print("Nhap lua chon cua ban: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    sv.nhapsv();
                    addsv(sv);
                    break;
                case 2:
                    hienThilistsv();
                    break;
                case 3:
                    findsv("Nhap masv: ");
                    break;
                case 4:
                    sortsvtheodiem();
                    break;
                case 0:
                    System.out.println("Chuong trinh da thoat.");
                    return;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        }
    }
}

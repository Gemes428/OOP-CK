package QLĐSV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class QLDSV {
    private List<sinhvien> dssv;

    public QLDSV() {
        dssv = new ArrayList<>();
    }

    public void addSV(sinhvien sv) {
        dssv.add(sv);
    }

    public sinhvien findSV(String maSV) {
        for (sinhvien sv : dssv) {
            if (sv.getMaSV().equals(maSV)) {
                return sv;
            }
        }
        return null;
    }

    public void hienThilistsv() {
        for (sinhvien sv : dssv) {
            System.out.println("Nhap masv: " + sv.getMaSV());
            System.out.println("Nhap tenSV: " + sv.getFullname());
            System.out.println("Nhap dtb: " + sv.getDiemTB());
            System.out.println("-------------------------");
        }
    }

    public void sapXepSVTheoDiem() {
        Collections.sort(dssv, new Comparator<sinhvien>() {
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
    }

    public void menu(int choice) {
        while (true) {
            System.out.println("===== Quan ly diem sinh vien =====");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Hien thi danh sach sinh vien");
            System.out.println("3. Tim kiem sinh vien theo ma");
            System.out.println("4. Sap xep sinh vien theo diem");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("=================================");

            choice = input.inputInt("Nhap lua chon cua ban: ");
            
            switch (choice) {
                case 1:
                    sinhvien sv = sinhvien.nhapsv();
                    dssv.add(sv);
                    break;
                case 2:
                    hienThilistsv();
                    break;
                case 3:
                    findSV("Nhap masv: ");
                    break;
                case 4:
                    sapXepSVTheoDiem();
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

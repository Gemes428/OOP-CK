/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qldsv;

/**
 *
 * @author admin
 */
    
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class qldsv {
    private static Scanner sc = new Scanner(System.in);
    private List<sinhvien> dssv;

    public qldsv() {
        dssv = new ArrayList<>();
    }
    
    public void addSV(sinhvien sv) {
        dssv.add(sv);
    }
    
    public void inputsinhvienInformation() {
        sinhvien sv = new sinhvien();
        System.out.print("Nhap sl sv: ");
        int numberOfsinhviens = sc.nextInt();sc.nextLine();

        for (int i = 0; i < numberOfsinhviens; i++) {
            sinhvien student = sinhvien.nhapsv();
            dssv.add(student);
        }
    }    

    public sinhvien findSV(){
        int count = 0;
        boolean state = true;
        while(state)
        {
            System.out.println("Nhap ma so sv can tim: ");
            String maSV = sc.nextLine();
            for (sinhvien sv : dssv) {
                if (sv.getMaSV().equals(maSV)) {
                    System.out.println(sv.toString());
                    count++;
                    state = false;
                }
            }
            if (count == 0) {
                System.out.println("Ma sv khong dung. Vui long nhap lai!!!");
            }
        }
        
        return null;
    }

    public void hienThilistsv() {
        for (sinhvien sv : dssv) {
            System.out.println("Masv: " + sv.getMaSV());
            System.out.println("TenSV: " + sv.getFullname());
            System.out.println("Dtb: " + sv.getDiemTB());
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
    
    public void loai() {
        for (sinhvien sv : dssv) {
            System.out.println("Masv: " + sv.getMaSV());
            System.out.println("TenSV: " + sv.getFullname());
            System.out.println("Dtb: " + sv.getDiemTB());
            sv.xepLoaiHocTap();
            System.out.println("-------------------------");
        }
    }

    public void menu(int choice) {
        while (true) {
            System.out.println("===== Quan ly diem sinh vien =====");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Hien thi danh sach sinh vien");
            System.out.println("3. Tim kiem sinh vien theo ma");
            System.out.println("4. Sap xep sinh vien theo diem"
                    + "\n5. Xep loai hoc cua sinh vien.");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("=================================");

            choice = input.inputInt("Nhap lua chon cua ban: ");
            
            switch (choice) {
                case 1:
                    inputsinhvienInformation();
                    break;
                case 2:
                    hienThilistsv();
                    break;
                case 3:
                    findSV();
                    break;
                case 4:
                    sapXepSVTheoDiem();
                    hienThilistsv();
                    break;
                case 5:
                    sapXepSVTheoDiem();
                    loai();
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

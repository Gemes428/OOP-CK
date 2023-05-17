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

    public void updatesv() {

        System.out.println("Nhap ma so sv can sua: ");
        String maSV = sc.nextLine();

        for (sinhvien sv : dssv) {
            if (sv.getMaSV().equals(maSV)) {
                // Sửa thông tin sinh viên
                
                String newname = input.inputStr("Nhap full name: ");
                sv.setFullname(newname);
                String newaddress = input.inputStr("Nhap dia chi: ");
                sv.setAddress(newaddress);
                float newdiemLT = input.inputFloat("Nhap diem lt: ");
                sv.setDiemLT(newdiemLT);
                float newdiemTH = input.inputFloat("Nhap diem th: ");
                sv.setDiemTH(newdiemTH);
                
                System.out.println("Successfully.");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên có mã số " + maSV + ".");
    }

    public void deletesv() {
        System.out.println("Nhap ma so sv can xoa: ");
        String masv = sc.nextLine();
    
        for (int i = 0; i < dssv.size(); i++) {
            if (dssv.get(i).getMaSV().equals(masv)) {
                dssv.remove(i);
                System.out.println("Sinh vien co ma so " + masv + " da duoc xoa khoi ds.");
                return;
            }
        }
        System.out.println("Khong tìm sv co masv nay " + masv + ".");
    }    

    public void hienThilistsv() {
        System.out.printf("%105s", "=================================================================================================");
        System.out.println("\n");
        System.out.printf("%20s  %20s  %20s  %15s  %10s  %10s", "Ma sinh vien", "Ten sinh vien", "Dia chi", "Diem LT", "Diem TH", "Diem TB");
        for (sinhvien sv : dssv) {
            System.out.println("\n");
            System.out.printf("%17s  %29s  %12s  %18f  %10f  %10f", sv.getMaSV(), sv.getFullname(), sv.getAddress(), sv.getDiemLT(), sv.getDiemTH(), sv.diemTB());
        }
        System.out.println("\n");
        System.out.printf("%105s", "==================================================================================================");
        System.out.println("\n");
    }

    public void sapXepSVTheoDiem() {
        Collections.sort(dssv, new Comparator<sinhvien>() {
            @Override
            public int compare(sinhvien sv1, sinhvien sv2) {
                if (sv1.diemTB() > sv2.diemTB()) {
                    return -1;
                } else if (sv1.diemTB() < sv2.diemTB()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        hienThilistsv();
    }
    
    public void loai() {
        System.out.printf("%105s", "=======================================================================================================================");
        System.out.println("\n");
        System.out.printf("%20s  %20s  %20s  %15s  %10s  %10s  %12s", "Ma sinh vien", "Ten sinh vien", "Dia chi", "Diem LT", "Diem TH", "Diem TB", "Xep Loai");
        for (sinhvien sv : dssv) {
            System.out.println("\n");
            System.out.printf("%17s  %29s  %12s  %18f  %10f  %10f", sv.getMaSV(), sv.getFullname(), sv.getAddress(), sv.getDiemLT(), sv.getDiemTH(), sv.diemTB(), sv);
            sv.xepLoaiHocTap();
        }
        System.out.println("\n");
        System.out.printf("%105s", "======================================================================================================================");
        System.out.println("\n");
    }

    public void menu(int choice) {
        while (true) {
            System.out.println("===== Quan ly diem sinh vien =====");
            System.out.println("1. Them sinh vien"
                    + "\n2. Sua thong tin sinh vien"
                    + "\n3. Xoa sinh vien");
            System.out.println("4. Hien thi danh sach sinh vien");
            System.out.println("5. Tim kiem sinh vien theo ma");
            System.out.println("6. Sap xep sinh vien theo diem"
                    + "\n7. Xep loai hoc cua sinh vien.");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("=================================");

            choice = input.inputInt("Nhap lua chon cua ban: ");
            
            switch (choice) {
                case 1:
                    inputsinhvienInformation();
                    break;
                case 2:
                    updatesv();
                    break;
                case 3:
                    deletesv();
                    break;
                case 4:
                    hienThilistsv();
                    break;
                case 5:
                    findSV();
                    break;
                case 6:
                    sapXepSVTheoDiem();
                    break;
                case 7:
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

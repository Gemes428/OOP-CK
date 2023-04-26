package QLĐSV;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        QLDSV qldsv = new QLDSV();

        while (true) {
            System.out.println("===== Quan ly diem sinh vien =====");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Hien thi danh sach sinh vien");
            System.out.println("3. Tim kiem sinh vien theo ma");
            System.out.println("4. Sap xep sinh vien theo diem");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("=================================");

            System.out.print("Nhap lua chon cua ban: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    qldsv.addsv(null);
                    break;
                case 2:
                    qldsv.hienThilistsv();
                    break;
                case 3:
                    qldsv.findsv("Nhap masv: ");
                    break;
                case 4:
                    qldsv.sortsvtheodiem();
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

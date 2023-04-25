package OOP-CK.QLDSV.src;

import java.util.Scanner;

public class monhoc {
    private String tenMH; // Tên môn học
    private int soTinChi; // Số tín chỉ của môn học
    private float diem; // Điểm của sinh viên trong môn học

    // Hàm khởi tạo (constructor)
    public monhoc(String tenMH, int soTinChi) {
            this.tenMH = tenMH;
            this.soTinChi = soTinChi;
            this.diem = 0;
    }

    // Các phương thức getter và setter cho các thuộc tính của môn học
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
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public void nhapDiem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem " + this.tenMH + ": ");
        this.diem = sc.nextFloat();
    }
 
    public void xuatThongTin() {
        System.out.println(this.tenMH + " (" + this.soTinChi + " tin chi): " + this.diem);
    }
}

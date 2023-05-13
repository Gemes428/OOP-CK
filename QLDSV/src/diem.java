
import java.util.Scanner;

public class diem {
    private float diem;
    private float diemtb;

    public diem() {
        // Khởi tạo giá trị mặc định cho điểm và điểm trung bình
        this.diem = 0;
        this.diemtb = 0;
    }

    public diem(float diem) {
        this.diem = diem;
        this.diemtb = 0;
    }

    public float getdiem() {
        return diem;
    }

    public void setdiem(float diem) {
        this.diem = diem;
    }

    public float getdiemTb() {
        return diemtb;
    }

    public void setdiemTb(float diemtb) {
        this.diemtb = diemtb;
    }

    public void nhapdiem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem: ");
        diem = sc.nextFloat();
    }

    public void xuatdiem() {
        System.out.println("Diem: " + diem);
        System.out.println("Diem trung binh: " + diemtb);
    }
}

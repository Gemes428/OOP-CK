
import java.util.List;

public class sinhvien extends person {
    private String maSV; // Mã sinh viên
    private float diemTB; // Điểm trung bình của sinh viên
    private List<monhoc> dsmh; // Danh sách các môn học của sinh viên

    // Constructor

    public sinhvien() {
    }

    public sinhvien(String maSV, String fullname, String address, float diemTB, List<monhoc> dsmh) {
        super(fullname, address);
        this.maSV = maSV;
        this.diemTB = diemTB;
        this.dsmh = dsmh;
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
    public static sinhvien nhapsv() {
        String masv = input.inputStr("Nhap masv: ");
        String fullname = input.inputStr("Nhap full name: ");
        String address = input.inputStr("Nhap dia chi: ");
        float diemtb = input.inputFloat("Nhap diem tb: ");
        return new sinhvien(masv, fullname, address, diemtb, null);
    }

    // Hàm xuất thông tin sinh viên ra màn hình
    public void xuatsv() {
        System.out.println("Ma sinh vien: " + getMaSV());
        System.out.println("Ten sinh vien: " + getFullname());
        System.out.println("Dia chi: " + getAddress());
        System.out.println("Diem tb: " + getDiemTB());
    }

    @Override
    public String toString() {
        return "{" + getMaSV() + "\t" + getDiemTB() + "\t" + getDsmh() + "\t" + "}";
    }

}

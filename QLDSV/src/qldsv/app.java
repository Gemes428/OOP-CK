/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qldsv;

/**
 *
 * @author admin
 */
public class app {
     public static void main(String[] args) {
        qldsv ql = new qldsv();
        
        sinhvien sv1 = new sinhvien("121001111", "Nguyen Co Trung Hau", "Di An", 8, 9);
        sinhvien sv2 = new sinhvien("121000487", "Truong Dinh Tien Anh", "Di An", 9, 9);
        sinhvien sv3 = new sinhvien("121000907", "Nguyen Thi Kieu Anh", "Di An", 7, 8);
        ql.addSV(sv1);
        ql.addSV(sv2);
        ql.addSV(sv3);
        
        ql.menu(0);
    }
}

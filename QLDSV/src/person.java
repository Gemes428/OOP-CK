/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class person {
    private String fullname, address;
    private char studentGender;

    public person() {
    }

    public person(String fullname, String address) {
        this.fullname = fullname;
        this.address = address;
    }

    public char getStudentGender() {
        return this.studentGender;
    }

    public void setStudentGender(char studentGender) {
        this.studentGender = studentGender;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "person{" + "fullname=" + fullname + ", address=" + address + '}';
    }
    
}

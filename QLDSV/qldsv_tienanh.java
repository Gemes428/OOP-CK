package QLĐSV;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class diem {
    private static Scanner scanner = new Scanner(System.in);
    private static HashMap<String, monhoc> courseMap = new HashMap<>();
    private static ArrayList<sinhvien> studentList = new ArrayList<>();

    public static void main(String[] args) {
        inputCourseInformation();
        inputStudentInformation();
        // inputGradeInformation();

        System.out.println("===== Student Grade List =====");
        printGradeListByCourse();

        System.out.println("===== Course Grade List =====");
        printGradeListByStudent();
    }

    private static void inputCourseInformation() {
        System.out.print("Enter the number of courses: ");
        int numberOfCourses = scanner.nextInt();

        for (int i = 0; i < numberOfCourses; i++) {
            System.out.print("Enter the course code: ");
            String courseCode = scanner.next();

            System.out.print("Enter the course name: ");
            String courseName = scanner.next();

            System.out.print("Enter the so tin chi: ");
            int soTinChi = scanner.nextInt();

            System.out.print("Enter the course name: ");
            Float diem = scanner.nextFloat();

            monhoc course = new monhoc(courseCode, courseName, soTinChi, diem);
            courseMap.put(courseCode, course);
        }
    }

    private static void inputStudentInformation() {
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the student ID: ");
            String studentID = scanner.nextLine();

            System.out.print("Enter the student name: ");
            String studentName = scanner.nextLine();

            System.out.print("Enter the student address: ");
            String studentadd = scanner.nextLine();

            System.out.print("Enter the dtb: ");
            Float dtb = scanner.nextFloat();

            System.out.print("Enter the student gender (M/F): ");
            char studentGender = scanner.next().charAt(0);

            sinhvien student = new sinhvien(studentID, studentName, studentadd, i, null);
            studentList.add(student);
        }
    }

    // private static void inputGradeInformation() {
    //     for (monhoc course : courseMap.values()) {
    //         System.out.println("===== Enter Grades for Course: " + course.getTenMH() + " =====");

    //         for (sinhvien student : studentList) {
    //             System.out.print("Enter grade for " + student.getFullname() + ": ");
    //             double grade = scanner.nextDouble();

    //             course.(student, grade);
    //         }
    //     }
    // }

    private static void printGradeListByCourse() {
        for (monhoc course : courseMap.values()) {
            System.out.println("Course: " + course.getTenMH());
            System.out.println("Student Name\tGrade");

            for (sinhvien student : studentList) {
                double grade = course.getDiem();
                System.out.println(student.getFullname() + "\t" + grade);
            }

            System.out.println();
        }
    }

    private static void printGradeListByStudent() {
        for (sinhvien student : studentList) {
            System.out.println("Student: " + student.getFullname());
            System.out.println("Course Name\tGrade");

            for (monhoc course : courseMap.values()) {
                double grade = course.getDiem();
                System.out.println(course.getTenMH() + "\t" + grade);
            }

            System.out.println();
        }
    }
}
   


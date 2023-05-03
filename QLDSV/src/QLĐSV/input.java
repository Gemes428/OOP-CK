package QLĐSV;

import java.util.Scanner;

public class input {
    public static Scanner sc = new Scanner(System.in);
    public static int inputInt(String content) {
        int result = 0;
        System.out.println(content);
        result = sc.nextInt();
        return result;
    }

    public static float inputFloat(String content) {
        float result = 0;
        System.out.println(content);
        result = sc.nextFloat();
        return result;
    }
    
    public static String inputStr(String content) {
        String result = "";
        System.out.println(content);
        result = sc.nextLine();
        result = sc.nextLine();
        return result;
    }
}

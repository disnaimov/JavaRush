package Lesson7_arrays;

import java.util.Scanner;

public class Lesson7_z3 {
    public static void main(String[] args) {
        int [] arr2 = new int[10];
        String[] arr1 = new String[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your strings");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
        String str4 = scanner.nextLine();
        String str5 = scanner.nextLine();
        String str6 = scanner.nextLine();
        String str7 = scanner.nextLine();
        String str8 = scanner.nextLine();
        String str9 = scanner.nextLine();
        String str10 = scanner.nextLine();
        arr1[0] = str1;
        arr1[1] = str2;
        arr1[2] = str3;
        arr1[3] = str4;
        arr1[4] = str5;
        arr1[5] = str6;
        arr1[6] = str7;
        arr1[7] = str8;
        arr1[8] = str9;
        arr1[9] = str10;
        for (int i = 0; i < 10; i++){
            arr2[i] = arr1[i].length();
        }
        for (int i = 0; i < 10; i++){
            System.out.println(arr2[i]);
        }
    }
}

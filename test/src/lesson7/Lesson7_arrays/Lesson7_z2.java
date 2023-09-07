package Lesson7_arrays;

import java.util.Scanner;

public class Lesson7_z2 {
    public static void main(String[] args) {
        System.out.println("\nz2");
        String[] arr1 = new String[10];
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Input your array elements");
        String str1 = scanner1.nextLine();
        String str2 = scanner1.nextLine();
        String str3 = scanner1.nextLine();
        String str4 = scanner1.nextLine();
        String str5 = scanner1.nextLine();
        String str6 = scanner1.nextLine();
        String str7 = scanner1.nextLine();
        String str8 = scanner1.nextLine();

        arr1[0] = str1;
        arr1[1] = str2;
        arr1[2] = str3;
        arr1[3] = str4;
        arr1[4] = str5;
        arr1[5] = str6;
        arr1[6] = str7;
        arr1[7] = str8;

        for (int i = arr1.length-1; i >= 0; i--){
            System.out.println(arr1[i]);
        }
    }
}

package Lesson7_arrays;

import java.util.Scanner;

public class Lesson7_z5 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your numbers");
        int a;
        int b = 10;
        for (int i = 0; i < arr.length; i++){
            a = scanner.nextInt();
            arr[i] = a;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = arr[i];
        }
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = arr[b];
            b++;
        }
        for (int i = 0; i < arr1.length; i++){
            System.out.println(arr2[i]);
        }
    }
}

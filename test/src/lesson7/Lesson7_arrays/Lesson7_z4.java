package Lesson7_arrays;

import java.util.Scanner;

public class Lesson7_z4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your numbers");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++){
            int j = scanner.nextInt();
            arr[i] = j;
        }
        int g = arr.length;
        int temp;
        for (int i = 0; i < g/2; i++){
            temp = arr[g-i-1];
            arr[g-i-1] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

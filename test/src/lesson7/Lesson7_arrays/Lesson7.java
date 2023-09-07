package Lesson7_arrays;

import java.util.Scanner;

public class Lesson7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your number");
        int num1 = scanner.nextInt();
        System.out.println("Input your number");
        int num2 = scanner.nextInt();
        System.out.println("Input your number");
        int num3 = scanner.nextInt();
        System.out.println("Input your number");
        int num4 = scanner.nextInt();
        System.out.println("Input your number");
        int num5 = scanner.nextInt();
        int[] arr = {num1, num2, num3, num4, num5};
        int max = 0;
       for(int i = 0; i < arr.length; i++){
           if(arr[i] > max){
               max = arr[i];
           }
       }
        System.out.println(max);
       scanner.close();
    }
}

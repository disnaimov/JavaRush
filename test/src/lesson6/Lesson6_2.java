import java.util.Arrays;
import java.util.Scanner;

public class Lesson6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number");
        int num1 = scanner.nextInt();
        System.out.println("Input second number");
        int num2 = scanner.nextInt();
        int max = 0;
        if(num1 < num2){
            max = num2;
        } else if (num1 > num2) {
            max = num1;
        }
        System.out.println(max);
        System.out.println("\nz2");

        System.out.println("Input first number");
        int num3 = scanner.nextInt();
        System.out.println("Input second number");
        int num4 = scanner.nextInt();
        System.out.println("Input third number");
        int num5 = scanner.nextInt();
        System.out.println("Input fourth number");
        int num6 = scanner.nextInt();
        System.out.println("Input fifth number");
        int num7 = scanner.nextInt();
        int[] arr  = {num3, num4, num5, num6, num7};
        int max2 = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}

package lesson6;
import java.util.Scanner;

public class Lesson5_2 {
    public static void main(String[] args) {

        System.out.println("z1");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first number");
        int a = scanner.nextInt();

        System.out.println("Input second number");
        int b = scanner.nextInt();

        System.out.println(a + b);

        System.out.println("\nz2");
        int min = 0;
        if(a < b){
            min = a;
        } else if (a > b) {
            min = b;
        }
        System.out.println(min);

        System.out.println("\nz3");

        System.out.println("Input length");
        int n = scanner.nextInt();
        System.out.println("Input your numbers");
        int max = 0;
        int myArr[] = new int[n];
        for (int i = 0; i < n; i++){
            int d = scanner.nextInt();
            myArr[i] = d;
        }
        for (int i = 0; i < myArr.length; i++){
            if (max < myArr[i]){
                max = myArr[i];
            }
            System.out.println(myArr[i]);
        }
        System.out.println("max of your numbers is " + max);
    }
}

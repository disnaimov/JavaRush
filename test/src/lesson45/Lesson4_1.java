package lesson45;
import java.util.Scanner;

public class Lesson4_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nz1");

        int a = 1;
        while (a <= 10){
            System.out.println(a);
            a++;
        }

        System.out.println("\nz2");

        int b = 10;
        while (b > 0){
            System.out.println(b);
            b--;
        }

        System.out.println("\nz3");

        System.out.println("\nInput string");
        String str = scanner.nextLine();

        System.out.println("\nInput number");
        int num = scanner.nextInt();

        int c = 1;

        while (c <= num){
            System.out.println(str);
            c++;
        }

        System.out.println("\nz4");
        System.out.println("\n");

        int d = 1, e = 1;
        while (d <= 10){
            e = 1;
            while (e <= 10){
                System.out.printf("%4d", d * e);
                e++;
            }
            System.out.println();
            d++;
        }

        System.out.println("\n");
        System.out.println("\nz5");
        System.out.println("\n");

        int g = 1, h = 1;
        String s = "S";

        while (g <= 10){
            h = 1;
            while (h <=10){
                System.out.printf("%4s", s);
                h++;
            }
            System.out.println();
            g++;
        }


    }
}
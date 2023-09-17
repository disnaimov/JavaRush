package lesson14_dop;

import java.util.Scanner;

/*
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель
 */
public class Class3 {

    static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % 2;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input two numbers");

        int a, b;

        while (true) {
            String s = scanner.nextLine();
            if (s.matches("\\d+")) {
                a = Integer.parseInt(s);
                break;
            }
        }

        while (true) {
            String s = scanner.nextLine();
            if (s.matches("\\d+")) {
                b = Integer.parseInt(s);
                break;
            }
        }

        scanner.close();

        System.out.println(gcd(a, b));
    }
}

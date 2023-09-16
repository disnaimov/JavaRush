package lesson14_dop;

import java.util.Scanner;

public class Class3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input two numbers");

        int a = 0;
        int b = 0;

        String line = scanner.nextLine();

        a = Integer.parseInt(line);


        System.out.println(a);
        System.out.println(b);
    }
}

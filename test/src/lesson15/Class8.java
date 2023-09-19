package lesson15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. В статическом блоке считайте две переменные
 с консоли А и В с типом int.
2. Не забыть про IOException, который надо
обработать в блоке catch.
3. Закрыть поток ввода методом close().
 */
public class Class8 {

    static int num1, num2;

    static {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        try {
            System.out.println("Input first number");
            num1 = Integer.parseInt(br.readLine());

            System.out.println("Input second number");
            num2 = Integer.parseInt(br.readLine());
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        System.out.println(num1);
        System.out.println(num2);
    }
}

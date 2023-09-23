package lesson15_dop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Задача: Написать метод, который вычисляет факториал
- произведение всех чисел от 1 до введенного числа включая его.
Пример: 4! = factorial(4) = 1*2*3*4 = 24
1. Ввести с консоли число меньше либо равно 150.
2. Реализовать функцию factorial.
3. Если введенное число меньше 0, то вывести 0.
0! = 1
 */
public class Class8 {

    static int factorial(int num){
        int result = 0;
        if (num < 0){
            return result;
        } else if (num > 150) {
            System.out.println("the number must be less than 150");
        } else {
            result = 1;
            for (int i = num; i > 0; i--){
                result *= i;
            }
            return result;
        }
        return result;
    }

    static {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                String s = br.readLine();
                if (s.equals("exit")) break;
                else {
                    try {
                        System.out.println(factorial(Integer.parseInt(s)));
                    } catch (NumberFormatException e){
                        System.out.println("input number!");
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

    }

}

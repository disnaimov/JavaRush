package Lesson7_last_breath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
3. Задача по алгоритмам.

Задача: Программа вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
 */
public class Class3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Input your nums");
        List<Integer> listNums = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            number = scanner.nextInt();
            listNums.add(number);
        }

        Collections.sort(listNums);
        Collections.reverse(listNums);

        for (int i: listNums) {
            System.out.println(i);
        }
    }
}

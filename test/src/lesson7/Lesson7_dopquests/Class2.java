package Lesson7_dopquests;

import java.util.ArrayList;
import java.util.Scanner;

/*
2. Переставить M первых строк в конец списка

Ввести с клавиатуры 2 числа N и M
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
 */
public class Class2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество строк");
        int N = scanner.nextInt();

        System.out.println("Введите сколько первых строк переставить в конец списка");
        int M = scanner.nextInt();

        String line = "";
        System.out.println("Введите сами строки");

        for (int i = 0; i <= N; i++){
            line = scanner.nextLine();
            list.add(line);
        }

        for (String s: list) {
            System.out.println(s);
        }

        for (int i = 1; i <= M; i++){
            String s = list.get(1);
            list.remove(1);
            list.add(list.size(), s);
        }

        for (String s: list) {
            System.out.println(s);
        }
    }
}

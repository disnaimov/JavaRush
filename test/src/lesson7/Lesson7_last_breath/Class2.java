package Lesson7_last_breath;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
2. Нужно добавить в программу новую функциональность.

Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.
/*for (String s:list) {
            System.out.println(s.toUpperCase());
        }*/

/*
Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом программа строит новый список.
Если в строке чётное число букв, строка удваивается, если нечётное – утраивается.
Программа выводит содержимое нового списка на экран.

Пример ввода:
Кот
Коты
Я
Пример вывода:
Кот Кот Кот
Коты Коты
Я Я Я
 */
public class Class2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> list =new ArrayList<>();
        String line = new String();
        System.out.println("Input your strings, then press enter");

        while (line != null){
            line = scanner.nextLine();
            list.add(line);
            if (line.equals("")){
                break;
            }
        }

        for (String s: list) {
            System.out.println(s);
        }

        for (String s:list) {
            if (list.get(list.indexOf(s)).length() %2 == 0){
                list.set(list.indexOf(s), s + s);
            } else if (list.get(list.indexOf(s)).length() %3 == 0){
                list.set(list.indexOf(s), s + s +s);
            }
        }

        for (String s: list) {
            System.out.println(s);
        }


    }
}

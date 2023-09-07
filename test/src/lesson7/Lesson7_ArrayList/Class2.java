package Lesson7_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/*
Задача 2. Самая длинная строка

1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
 */
public class Class2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String line;
        String max = new String();

        System.out.println("Input your five strings");
        for (int i = 0; i < 5; i++) {
            line = scanner.nextLine();
            list.add(line);
        }

        scanner.close();

        for (String s : list) {
            if (s.length() > max.length()) {
                max = s;
            }
        }
        for (String s : list) {
            if (max.length() == s.length()) {
                System.out.println(s);
            }
        }

    }
}

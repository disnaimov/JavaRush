package Lesson7_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Задача 3. Самая короткая строка

1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
 */
public class Class3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String line;

        System.out.println("Input your five strings");
        for (int i = 0; i < 5; i++) {
            line = scanner.nextLine();
            list.add(line);
        }

        scanner.close();
        String min = list.get(0);

        for (String s : list) {
            if (s.length() < min.length()) {
                min = s;
            }
        }

        for (String s : list) {
            if (min.length() == s.length())
                System.out.println(s);
        }

    }
}

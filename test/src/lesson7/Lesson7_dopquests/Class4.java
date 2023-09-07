package Lesson7_dopquests;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
4. Вводить с клавиатуры строки, пока пользователь не введёт строку “end

Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введёт строку “end”. “end” не учитывать.
Вывести строки на экран, каждую с новой строки.
 */
public class Class4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String line = "";
        String kill = "";

        while (kill != "end"){
            line = scanner.nextLine();
            if (line.equals("end"))
                break;
            else
                list.add(line);
        }

        for (String s: list) {
            System.out.println(s);
        }
    }
}

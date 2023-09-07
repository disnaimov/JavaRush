package lesson8_last_breath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
3. Задача по алгоритмам.
Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.
 */
public class Class3 {
    static ArrayList<String> sortNums(ArrayList<String> list){
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String line;

        System.out.println("Вводим слова");
        for (int i = 0 ; i < 10; i++){
            line = scanner.nextLine();
            list.add(line);
        }

        sortNums(list);

        System.out.println("\nОтсортирован");
        for (String s:
             list) {
            System.out.println(s);
        }

    }
}

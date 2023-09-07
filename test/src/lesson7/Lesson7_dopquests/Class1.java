package Lesson7_dopquests;

import java.util.ArrayList;
import java.util.Scanner;

/*1. Вывести числа в обратном порядке

        Ввести с клавиатуры 10 чисел и заполнить ими список.
        Используя цикл for вывести их в обратном порядке.
*/

public class Class1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String line = "";

        for (int i = 0; i < 5; i++){
            line = scanner.nextLine();
            list.add(line);
        }

        for (int i = list.size()-1; i >= 0; i--){
            System.out.println(list.get(i));
        }
    }
}

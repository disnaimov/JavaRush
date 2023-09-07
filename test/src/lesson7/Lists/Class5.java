package Lists;

import java.util.ArrayList;
import java.util.Scanner;
/*
5. Удвой слова

1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c → a,a,b,b,c,c.
3. Используя цикл for, выведи результат на экран, каждое значение с новой строки.
 */
public class Class5 {

    static ArrayList<String> doubleValues(ArrayList<String> list){
        ArrayList<String> listDoubleValues = new ArrayList<>();
        for (String s: list) {
            listDoubleValues.add(s+s);
        }
        return listDoubleValues;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String line = "";
        for (int i = 0; i < 3; i++){
            line = scanner.nextLine();
            list.add(line);
        }
        System.out.println(doubleValues(list));
    }
}

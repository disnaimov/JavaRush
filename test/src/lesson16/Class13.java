package lesson16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 4. Обратный отсчет

1. Разберись, что делает программа.
2. Реализуй логику метода printCountdown так, чтобы каждые полсекунды выводился объект
из переменной list в обратном порядке - от переданного индекса до нуля.
Пример: Передан индекс 3

Пример вывода в консоль:
Строка 2
Строка 1
Строка 0
 */
public class Class13 {

    public static void printCountdown(List<String> strings){

        Collections.reverse(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }


    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("str1");
        strings.add("str2");
        strings.add("str3");

        printCountdown(strings);
    }
}

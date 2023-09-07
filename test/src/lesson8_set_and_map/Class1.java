package lesson8_set_and_map;

import java.util.HashSet;
import java.util.Set;

/*
1. 20 слов на букву «Л»

Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
 */
public class Class1 {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();

        strings.add("Лама");
        strings.add("Лапа");
        strings.add("Луна");
        strings.add("Лампа");
        strings.add("Локоть");
        strings.add("Лошадь");
        strings.add("Лимон");
        strings.add("Лена");
        strings.add("Леня");
        strings.add("Лифт");
        strings.add("Лимфа");
        strings.add("Лоб");
        strings.add("Лепешка");
        strings.add("Лайм");
        strings.add("Липа");
        strings.add("Лоза");
        strings.add("Лак");
        strings.add("Лекало");
        strings.add("Лицо");
        strings.add("Лопость");

        for (String s:
             strings) {
            System.out.println(s);
        }
    }
}

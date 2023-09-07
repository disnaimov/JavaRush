package Lists;

import java.util.ArrayList;
import java.util.Arrays;

/*
4. Буква «р» и буква «л»

1. Создай список слов, заполни его самостоятельно.
2. Метод fix() должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.

Пример:
роза
лира
лоза
Выходные данные:
лира
лоза
лоза
 */
public class Class4 {


    public static ArrayList<String> fix(ArrayList<String> list){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).contains("р")){
                list.remove(list.get(i));
            } else if (list.get(i).contains("л")) {
                list.add(i, list.get(i));
                i++;
            }
        }
        return list;
    }


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(0, "роза");
        list.add(1, "лира");
        list.add(2, "лоза");

        fix(list);

        for (String s: list) {
            System.out.println(s);
        }
    }
}

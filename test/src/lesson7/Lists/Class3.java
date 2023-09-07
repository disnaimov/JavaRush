package Lists;

import java.util.ArrayList;

/*
3. Слово «именно»

1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for, вывести результат на экран. Каждый элемент списка с новой строки.
 */
public class Class3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Мама");
        list.add("Мыла");
        list.add("Раму");

        for (int i = 0; i < list.size()+1; i++){
            if(i%2!=0){
                list.add(i, "Именно");
            }
        }
        for (String s: list) {
            System.out.println(s);
        }
    }
}

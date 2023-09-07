package Lists;

import java.util.ArrayList;
import java.util.Scanner;

/*
2. Слова в обратном порядке

Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
 */
public class Class2 {
    public static void main(String[] args) {
        ArrayList<String> list =  new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String line;
        for (int i = 0; i < 5; i++){
            line = scanner.nextLine();
            list.add(line);
        }
        list.remove(2);
        for (int i = list.size()-1; i >= 0; i--){
            System.out.println(list.get(i));
        }
    }
}

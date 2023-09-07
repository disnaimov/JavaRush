package lesson8_dopquests;

import java.util.HashMap;
import java.util.Map;

/*
1. Set из котов

1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него три кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов,
которые остались во множестве. Каждый кот с новой строки.
 */
public class Class1 {
    static class Cat {
        public static Map<Integer, String> createCats() {

            Map<Integer, String> cats = new HashMap<>();

            cats.put(1, "cat1");
            cats.put(2, "cat2");
            cats.put(3, "cat3");

            return cats;
        }

        public static void printCats(Map<Integer, String> map){
            for (Map.Entry<Integer, String> pair:
                 map.entrySet()) {
                System.out.println(pair.getValue());
            }
        }
    }

    public static void main(String[] args) {
        Map<Integer, String> cats = Cat.createCats();

        cats.remove(3);

        Cat.printCats(cats);
    }
}

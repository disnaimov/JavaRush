package lesson8_collections;

import java.util.HashMap;
import java.util.Map;

/*
3. Коллекция HashMap из котов

Есть класс Cat, с полем имя (name, String).
Создать коллекцию HashMap<String, Cat>.
Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
Вывести результат на экран, каждый элемент с новой строки.
 */
public class Class3 {
    public static void main(String[] args) {
        Map<String, Cat> cats = new HashMap<>();

        Cat cat1 = new Cat("bars");
        Cat cat2 = new Cat("kotan");
        Cat cat3 = new Cat("kotuun");
        Cat cat4 = new Cat("vaska");
        Cat cat5 = new Cat("petka");


        cats.put(cat1.getName(), cat1);
        cats.put(cat2.getName(), cat2);
        cats.put(cat3.getName(), cat3);
        cats.put(cat4.getName(), cat4);
        cats.put(cat5.getName(), cat5);

        for (Map.Entry<String, Cat> pair : cats.entrySet()) {
            String key = pair.getKey();
            String value = pair.toString();
            System.out.println(key + "-" + value);
        }
    }
}

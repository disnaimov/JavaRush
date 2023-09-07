package lesson8_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
1. HashSet из растений

Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
 */
public class Class1 {
    public static void main(String[] args) {
        Set<String> plants = new HashSet<>();
        plants.add("арбуз");
        plants.add("банан");
        plants.add("вишня");
        plants.add("груша");
        plants.add("дыня");
        plants.add("ежевика");
        plants.add("жень-шень");
        plants.add("земляника");
        plants.add("ирис");
        plants.add("картофель");

        Iterator<String> iterator = plants.iterator();

        while (iterator.hasNext()){
            String text = iterator.next();
            System.out.println(text);
        }
    }
}

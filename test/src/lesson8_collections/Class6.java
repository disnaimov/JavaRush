package lesson8_collections;

import java.util.HashMap;
import java.util.Map;
/*
6. Коллекция HashMap из Object

Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.

Пример вывода (тут показана только одна строка):
Sim - 5
 */
public class Class6 {
    public static void main(String[] args) {
        Map<String, Object> objects = new HashMap<>();

        objects.put("object1", 5);
        objects.put("object2", "string");
        objects.put("object3", 10.2);
        objects.put("object4", true);
        objects.put("object5", false);

        for (Map.Entry<String, Object> pair:
             objects.entrySet()) {
            String key = pair.getKey();
            String value = pair.toString();
            System.out.println(key + " - " + value);
        }
    }
}

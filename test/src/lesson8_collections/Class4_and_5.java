package lesson8_collections;

import java.util.HashMap;
import java.util.Map;

/*
4. Вывести на экран список ключей

Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
Вывести на экран список ключей, каждый элемент с новой строки.

5. Вывести на экран список значений

Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
Вывести на экран список значений, каждый элемент с новой строки.
 */
public class Class4_and_5 {
    public static void main(String[] args) {
        Map<String, String> exampleCollection = new HashMap<>();

        exampleCollection.put("key1", "string1");
        exampleCollection.put("key2", "string2");
        exampleCollection.put("key3", "string3");
        exampleCollection.put("key4", "string4");
        exampleCollection.put("key5", "string5");
        exampleCollection.put("key6", "string6");
        exampleCollection.put("key7", "string7");
        exampleCollection.put("key8", "string8");
        exampleCollection.put("key9", "string9");
        exampleCollection.put("key10", "string10");

        System.out.println("Ключи");
        for (Map.Entry<String, String> pair: exampleCollection.entrySet()) {
            String key = pair.getKey();
            System.out.println(key);
        }

        System.out.println("\nЗначения");

        for (Map.Entry<String, String> pair: exampleCollection.entrySet()) {
         String value = pair.getValue();
            System.out.println(value);
        }

    }
}

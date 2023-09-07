package lesson8_dopquests;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
3. Люди с одинаковыми именами и/или фамилиями

1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами и/или фамилиями.
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
 */
public class Class3 {
    static Map<String, String> createMap(){
        Map<String, String> people = new LinkedHashMap<>();

        people.put("name", "lastname");
        people.put("name2", "lastname2");
        people.put("name2", "lastname2");
        people.put("name3", "lastname2");
        people.put("name4", "lastname3");
        people.put("name5", "lastname4");
        people.put("name6", "lastname5");
        people.put("name7", "lastname6");
        people.put("name8", "lastname2");
        people.put("name9", "lastname2");

        return people;
    }

    static void getPeople(Map<String, String> people){
        for (Map.Entry<String, String> pair:
             people.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }

    public static void main(String[] args) {
        Map<String, String> people = createMap();
        getPeople(people);
    }
}

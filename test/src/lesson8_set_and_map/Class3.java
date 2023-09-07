package lesson8_set_and_map;

import java.util.HashMap;
import java.util.Map;

/*
3. Одинаковые имя и фамилия

Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
 */
public class Class3 {
    public static void main(String[] args) {
        Map<String, String> people = new HashMap<>();

        people.put("name1", "secondment1");
        people.put("name2", "secondment2");
        people.put("name3", "secondment3");
        people.put("name4", "secondment4");
        people.put("name5", "secondment2");
        people.put("name6", "secondment2");
        people.put("name7", "secondment5");
        people.put("name8", "secondment6");
        people.put("name9", "secondment7");
        people.put("name10", "secondment8");
        int count1 = 0, count2 = 0;

        System.out.println("Сама мапа");
        for (Map.Entry<String, String> pair:
             people.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
            if (key.equals("name2")){
                count1++;
            }
            if (value.equals("secondment2")){
                count2++;
            }
        }
        System.out.println("\nКоличество совпаднений по фамилии = " + count1);
        System.out.println("Количество совпадений по имени = " + count2);
    }
}

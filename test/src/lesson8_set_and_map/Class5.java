package lesson8_set_and_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
5. Удалить людей, имеющих одинаковые имена

Создать словарь (Map<String, String>) занести в него десять записей
по принципу «фамилия» - «имя». Удалить людей, имеющих одинаковые имена.
 */
public class Class5 {
    public static Map<String, String> createMap() {
        Map<String, String> peoples = new HashMap<>();
        peoples.put("lastname1", "name1");
        peoples.put("lastname2", "name1");
        peoples.put("lastname3", "name1");
        peoples.put("lastname4", "name2");
        peoples.put("lastname5", "name2");
        peoples.put("lastname6", "name2");
        peoples.put("lastname7", "name2");
        peoples.put("lastname8", "name3");
        peoples.put("lastname9", "name4");
        peoples.put("lastname10", "name5");

        return peoples;
    }

    public static void removeCoincidences(Map<String, String> map) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> element:
             copy.entrySet()){
            int count = 0;
            for (Map.Entry<String, String> copyElement:
                    copy.entrySet()) {
                if (element.getValue().equals(copyElement.getValue())){
                    count++;
                }
            }
            if (count > 1){
                removeMapItemByValue(map, element.getValue());
            }
        }
    }

    public static void removeMapItemByValue(Map<String, String> map, String value){
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair:
             copy.entrySet()) {
            if (pair.getValue().equals(value)){
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> peoples = createMap();
        removeCoincidences(peoples);

        for (Map.Entry<String, String> pair :
                peoples.entrySet()) {
            System.out.println(pair.getValue());
        }
    }
}

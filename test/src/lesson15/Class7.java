package lesson15;

import java.util.HashMap;
import java.util.Map;

/*
В статическом блоке инициализировать
labels 5 различными парами.
 */
public class Class7 {
    public static Map<Integer, String> map = new HashMap<>();

    static {
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
    }

    public static void main(String[] args) {
        for (Map.Entry<Integer, String> pair: map.entrySet()) {
            System.out.println(pair.getValue());
        }

        System.out.println("\n");

        System.out.println(map);
    }
}

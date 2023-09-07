package lesson9_exceptions;

import java.util.HashMap;

/*
5. Исключение при работе с коллекциями Map

Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
HashMap<String, String> map = new HashMap<String, String>(null);
map.put(null, null);
map.remove(null);
 */
public class Class5 {
    public static void main(String[] args) {
        try {
            HashMap<String, String> map = new HashMap<>(null);
            map.put(null, null);
            map.remove(null);
        }  catch (NullPointerException e){
            System.out.println(e);
        }
    }
}

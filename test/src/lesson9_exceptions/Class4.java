package lesson9_exceptions;

import java.util.ArrayList;

/*
4. Исключение при работе с коллекциями List

Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
ArrayList<String> list = new ArrayList<String>();
String s = list.get(18);
 */
public class Class4 {
    public static void main(String[] args) {
        try {
            ArrayList<String> list = new ArrayList<>();
            String s = list.get(18);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}

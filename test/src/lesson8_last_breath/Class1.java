package lesson8_last_breath;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
1. Номер месяца

Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
 Используйте коллекции.
 */
public class Class1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, String> month = new HashMap<>();

        month.put(1, "январь");
        month.put(2, "февраль");
        month.put(3, "март");
        month.put(4, "апрель");
        month.put(5, "май");
        month.put(6, "июнь");
        month.put(7, "июль");
        month.put(8, "август");
        month.put(9, "сентябрь");
        month.put(10, "октябрь");
        month.put(11, "ноябрь");
        month.put(12, "декабрь");

        System.out.println("Введите номер месяца");
        int monthNumber = scanner.nextInt();


        System.out.println("Ваш месяц - " + month.get(monthNumber));

    }
}

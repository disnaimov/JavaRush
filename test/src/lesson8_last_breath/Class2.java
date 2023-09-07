package lesson8_last_breath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
2. Нужно добавить в программу новую функциональность.

Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:

Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон

Пример вывода:
Абрамовичи
 */
public class Class2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите название города");
        String town = reader.readLine();
        reader.close();

        Map<String, String> residencePlace = new HashMap<>();

        residencePlace.put("London", "Абрамовичи");
        residencePlace.put("Spb", "Ивановы");
        residencePlace.put("Moscow", "Петровы");

        if (residencePlace.get(town) != null) {
            System.out.println(residencePlace.get(town));
        } else {

        for (Map.Entry<String, String> pair:
             residencePlace.entrySet()) {
            if (town != pair.getKey());
            System.out.println("Нет зарегестированных семей проживающих в этом городе");
            break;
        }
        }
    }
}

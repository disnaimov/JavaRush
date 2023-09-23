package lesson15_dop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
/*
Задача: 1. В отдельных файлах создать классы Plane
 и Helicopter, реализующие интерфейс Flyable.
2. Класс Plane должен иметь 1 конструктор с параметром
 int – количество перевозимых пассажиров.
3. В статическом методе reset класса Solution:
3.1. Считать с консоли параметр типа String.
Параметр может быть "plane" или "helicopter".
3.2. Если параметр равен "helicopter", то статическому
объекту Flyable result присвоить
объект класса Helicopter.
3.3. Если параметр равен "plane", то считать второй
параметр типа int,
статическому объекту Flyable result присвоить объект
 класса Plane.
4. В статическом блоке инициализировать Flyable result
вызвав метод reset.
5. Закрыть поток ввода методом close().
 */
public class Class6 {
    static Flyable result;
    static void reset() throws IOException {
        System.out.println("Input plane or helicopter");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (Objects.equals(s, "helicopter")){
            result = new Helicopter();
            System.out.println(result);
        } else if (Objects.equals(s, "plane")) {
            System.out.println("Input passenger count");
            int passengerCount = Integer.parseInt(br.readLine());
            result = new Plane(passengerCount);
            System.out.println(result);
        } else {
            result = null;
            System.out.println(result);
        }
        br.close();
    }

    static {
        try {
            reset();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

    }
}

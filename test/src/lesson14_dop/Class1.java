package lesson14_dop;

import java.util.Objects;
import java.util.Scanner;

/*
1. Ввести [в цикле] с клавиатуры несколько строк (ключей).
Строки(ключи) могут быть такими: "user", "looser",
"coder", "proger".
Ввод окончен, когда строка не совпадает ни с одной
из вышеуказанных.

2. Для каждой введенной строки нужно:
2.1. Создать соответствующий объект [см Person.java],
например, для строки "user" нужно создать объект
класса User.
2.2. Передать этот объект в метод doWork.

3. Написать реализацию метода doWork, который:
3.1. Вызывает метод live() у переданного обекта,
если этот объект (person) имеет тип User.
3.2. Вызывает метод doNothing(), если person имеет тип Looser.
3.3. Вызывает метод coding(), если person имеет тип Coder.
3.4. Вызывает метод enjoy(), если person имеет тип Proger.

 */
public class Class1 {

    static class User {
        void live() {
            System.out.println("I'm user, and i'm live");
        }
    }

    static class Looser {
        void doNothing() {
            System.out.println("I'm looser, and i do nothing");
        }
    }

    static class Coder {
        void coding() {
            System.out.println("I'm coder, and i'm code");
        }
    }

    static class Proger {
        void enjoy() {
            System.out.println("I'm proger, and i'm enjoy");
        }
    }

    static void method(String s) {
        if (Objects.equals(s, "user")) {
            User person = new User();
            System.out.println(person);
            person.live();
        } else if (Objects.equals(s, "looser")) {
            Looser person = new Looser();
            System.out.println(person);
            person.doNothing();
        } else if (Objects.equals(s, "coder")) {
            Coder coder = new Coder();
            System.out.println(coder);
            coder.coding();
        } else if (Objects.equals(s, "proger")) {
            Proger proger = new Proger();
            System.out.println(proger);
            proger.enjoy();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string");


        while (true) {
            String s = scanner.nextLine();
            if ((Objects.equals(s, "user"))
                    || (Objects.equals(s, "looser"))
                    || (Objects.equals(s, "coder"))
                    || (Objects.equals(s, "proger"))) {

                method(s);

            } else {
                scanner.close();
                break;
            }
        }
    }
}

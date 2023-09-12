package lesson14;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/*
Считывать строки(параметры) с консоли, пока
пользователь не введет пустую строку(Enter).
2. Каждый параметр соответствует имени кота.
Для каждого параметра:
3. Создать объект cat класса Cat,
4. Вывести на экран cat.toString().
 */
public class Class2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = "s";
        System.out.println("Input cat names");
        //List<Cat> cats = new ArrayList<>();

        while (!(Objects.equals(s, ""))){
            s = scanner.nextLine();
            if (!Objects.equals(s,"")){
                Cat cat = new Cat();
                cat.setName(s);
                //cats.add(cat);
                System.out.println(cat.toString());
            } else scanner.close();
        }

        /*for (Cat c:cats) {
            System.out.println(c.toString());
        }*/
    }
}

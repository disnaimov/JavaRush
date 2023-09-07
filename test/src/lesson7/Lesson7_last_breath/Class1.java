package Lesson7_last_breath;

import java.util.Scanner;

/*
1. Нужно исправить программу, чтобы компилировалась и работала.

Задача: Программа вводит с клавиатуры данные про котов и выводит их на экран.

Пример:
Cat name is Barsik, age is 6, weight is 5, tail = 22
Cat name is Murka, age is 8, weight is 7, tail = 20
 */
public class Class1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input name of first cat");
        String nameOfFirstCat = scanner.next();

        System.out.println("Input age of first cat");
        int ageOfFirstCat = scanner.nextInt();

        System.out.println("Input weight of first cat");
        int weightOfFirstCat = scanner.nextInt();

        System.out.println("Input tail of first cat");
        int tailOfFirstCat = scanner.nextInt();

        System.out.println("Input name of second cat");
        String nameOfSecondCat = scanner.next();

        System.out.println("Input age of second cat");
        int ageOfSecondCat = scanner.nextInt();

        System.out.println("Input weight of second cat");
        int weightOfSecondCat = scanner.nextInt();

        System.out.println("Input tail of second cat");
        int tailOfSecondCat = scanner.nextInt();

        scanner.close();

        System.out.println("Cat name is: " + nameOfFirstCat + " age is: " + ageOfFirstCat + " weight is: " + weightOfFirstCat
                + " tail: is " + tailOfFirstCat);

        System.out.println("Cat name is: " + nameOfSecondCat + " age is: " + ageOfSecondCat + " weight is: " + weightOfSecondCat
                + " tail: is " + tailOfSecondCat);
    }
}

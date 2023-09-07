package lesson8_dopquests;

import java.util.*;

/*
8. Пять наибольших чисел

Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
 */
public class Class7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int num;
        int max;


        for (int i = 0; i < array.length; i++){
            num = scanner.nextInt();
            array[i] = num;
        }

        System.out.println("Дефолт");
        for (int i:
             array) {
            System.out.println(i);
        }


        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (array[i] > array[j]){
                    max = array[i];
                    array[i] = array[j];
                    array[j] = max;
                }
            }
        }


        System.out.println("\nОтсортирован");
        for (int i = 0; i <=4; i++) {
            System.out.println(array[i]);
        }

    }
}

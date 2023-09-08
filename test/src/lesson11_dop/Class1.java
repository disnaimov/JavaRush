package lesson11_dop;

import java.lang.reflect.Array;

/*
3. Задача по алгоритмам.

Задача: Написать метод, который возвращает
минимальное и максимальное числа в массиве.
 */
public class Class1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int j = 1;
        int max = 0, min = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = j;
            j++;
        }

        for (int i = 0; i < array.length; i++){
            if (max < array[i]){
                max = array[i];
            }
            if (min > array[i]){
                min = array[i];
            }
        }

        for (int i = 0; i < array.length; i++){
            System.out.println(i);
        }
        System.out.println("\n");

        System.out.println("max is = " + max);
        System.out.println("min is = " + min);


    }
}

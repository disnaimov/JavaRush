package Lesson7_dopquests;

import java.util.Scanner;
/*
3. Максимальное и минимальное числа в массиве

Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
 */
public class Class3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int max = 0, min = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Заполните массив");
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
            if (min > arr[i]){
                min = arr[i];
            }
        }



        System.out.println(max);
        System.out.println(min);

    }
}

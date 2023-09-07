package lesson8_dopquests;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
4. Минимальное из N чисел

1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
 */
public class Class4 {
    static List<Integer> getIntegerList(int iterations){
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("Введите числа");
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < iterations; i++){
            num = scanner.nextInt();
            nums.add(num);
        }

        return nums;
    }

    static int getMin(List<Integer> list){

        int min = list.get(0);
        for (int i:
             list) {
            if (min > i){
                min = i;
            }
        }
        return min;
    }



    public static void main(String[] args) {
        System.out.println("Введите сколько чисел хотите ввести");
        Scanner scanner = new Scanner(System.in);
        int iterations = scanner.nextInt();

        List<Integer> nums = getIntegerList(iterations);

        System.out.println("минимум = " + getMin(nums));








    }
}

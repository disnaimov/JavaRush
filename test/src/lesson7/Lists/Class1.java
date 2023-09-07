package Lists;

/*
1. Три массива

1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList, выведи эти три списка на экран. Сначала тот,
который для x%3, потом тот, который для x%2, потом последний.
 */

import java.util.ArrayList;

public class Class1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 1; i <= 20; i++){
            list.add(i);
        }
        for (int i: list) {
            if (i % 3 == 0){
                list1.add(i);
            }
            if (i % 2 == 0){
                list2.add(i);
            }
            if (i % 3 == 0 && i % 2 == 0){
                list3.add(i);
            }
        }
        System.out.println("List1");
        for (int i: list1) {
            System.out.println(i);
        }
        System.out.println("List 2");
        for (int i : list2) {
            System.out.println(i);
        }
        System.out.println("List 3");
        for (int i : list3) {
            System.out.println(i);
        }
    }
}

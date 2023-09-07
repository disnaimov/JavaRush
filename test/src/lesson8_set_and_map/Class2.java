package lesson8_set_and_map;

import java.util.HashSet;
import java.util.Set;

/*
2. Удалить все числа больше 10

Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
 */
public class Class2 {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>();
        for (int i = 1; i <= 20; i++){
            nums.add(i);
        }

        System.out.println("До");
        for (int i:
             nums) {
            System.out.println(i);
        }

        for (int i = 1; i <= 20; i++){
            if (i > 10){
                nums.remove(i);
            }
        }

        System.out.println("\nПосле");
        for (int i:
                nums) {
            System.out.println(i);
        }
    }
}

package lesson12_dop;

/*
Задача: Написать метод, который возвращает минимальное
число в массиве и его позицию (индекс).
 */
public class Class3 {

    public static void main(String[] args) {
        int[] array = new int[10];


        for (int i = 0; i < array.length; i++) {
            array[i] = 10 - i;
        }

        int min = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
                index = i;
            }
        }

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println("min is = " + min);
        System.out.println("index of min is = " + index);
    }
}

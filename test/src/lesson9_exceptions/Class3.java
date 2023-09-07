package lesson9_exceptions;
/*
3. Исключение при работе с массивами

Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int[] m = new int[2];
m[8] = 5;
 */
public class Class3 {
    public static void main(String[] args) {
        try{
            int[] m = new int[2];
            m[9] = 5;
        } catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}

package lesson9_exceptions;

/*
1. Исключение при работе с числами

Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int a = 42 / 0;
 */
public class Class1 {
    public static void main(String[] args) {

        try {
            int a = 42 / 0;
        } catch (ArithmeticException e){
            System.out.println("Арифметическая ошибка");
        }


    }
}

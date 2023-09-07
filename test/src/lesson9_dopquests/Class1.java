package lesson9_dopquests;
/*
1. Деление на ноль

Создай метод public static void divisionByZero, в котором подели любое число на ноль и выведи на экран результат деления.
Оберни вызов метода divisionByZero в try..catch. Выведи стек-трейс исключения используя метод exception.printStackTrace()
 */
public class Class1 {

    public static void divisionByZero(){
        int num = 1/0;
        System.out.println(num);
    }

    public static void main(String[] args) {
        try {
            divisionByZero();
        } catch (ArithmeticException exception){
            exception.printStackTrace();
        }
    }

}

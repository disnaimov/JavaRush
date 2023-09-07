package lesson9_stack_trace;
/*
5. Метод должен возвращать результат – глубину её стек-трейса

Написать метод, который возвращает результат – глубину его стек трейса –
количество методов в нем (количество элементов в списке). Это же число метод должен выводить на экран.
 */
public class Class5 {

    public static void method1() {
        method2();
    }

    public static void method2() {
        method3();
    }

    public static void method3() {
        method4();
    }

    public static void method4() {
        ;
    }

    public static void getStackTrace() {
        int count = 0;
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements) {
            count++;
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        method1();
        getStackTrace();
    }
}

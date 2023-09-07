package lesson9_stack_trace;
/*
1. Каждый метод должен возвращать свой StackTrace

Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать свой StackTrace.
 */
public class Class1 {

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
        method5();
    }

    public static void method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements) {
            System.out.println(element.getMethodName());
        }
    }

    public static void main(String[] args) {
        method1();
    }
}

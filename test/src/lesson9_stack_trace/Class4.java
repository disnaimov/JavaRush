package lesson9_stack_trace;
/*
4. Стек-трейс длиной 10 вызовов

Напиши код, чтобы получить стек-трейс длиной 10 вызовов.
 */
public class Class4 {

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

    public static void method5(){
        method6();
    }

    public static void method6(){
        method7();
    }

    public static void method7(){
        method8();
    }

    public static void method8(){
        method9();
    }

    public static void method9() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements) {
            System.out.println(element.getMethodName());
        }
    }

    public static void main(String[] args) {
        method1();
    }
}

package lesson9_stack_trace;
/*
2. И снова StackTrace

Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.
 */
public class Class2 {

    public static void method1() {
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        System.out.println("Метод который вызвал метод 1 " + name);
    }

    public static void method2() {
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        System.out.println("Метод который вызвал метод 2 " + name);
    }

    public static void method3() {
        method4();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String  name = stackTraceElements[2].getMethodName();
        System.out.println("Метод который вызвал метод 3 " + name);
    }

    public static void method4() {
        method5();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        System.out.println("Метод который вызвал метод 4 " + name);
    }

    public static void method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        System.out.println("Метод который вызвал метод 5 " + name);
    }

    public static void main(String[] args) {
        method1();
    }
}

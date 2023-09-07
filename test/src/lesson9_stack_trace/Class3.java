package lesson9_stack_trace;
/*
3. Метод должен вернуть номер строки кода, из которого вызвали этот метод

Написать пять методов, которые вызывают друг друга.
Метод должен вернуть номер строки кода, из которого вызвали этот метод.
Воспользуйся функцией: element.getLineNumber().
 */
public class Class3 {

    public static void method1() {
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int lineNumber = stackTraceElements[2].getLineNumber();
        System.out.println("Вызов метода 1 на строке " + lineNumber);
    }

    public static void method2() {
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int lineNumber = stackTraceElements[2].getLineNumber();
        System.out.println("Вызов метода 2 на строке " + lineNumber);
    }

    public static void method3() {
        method4();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int lineNumber = stackTraceElements[2].getLineNumber();
        System.out.println("Вызов метода 3 на строке " + lineNumber);
    }

    public static void method4() {
        method5();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int lineNumber = stackTraceElements[2].getLineNumber();
        System.out.println("Вызов метода 4 на строке " + lineNumber);
    }

    public static void method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int lineNumber = stackTraceElements[2].getLineNumber();
        System.out.println("Вызов метода 5 на строке " + lineNumber);
    }

    public static void main(String[] args) {
        method1();
    }
}

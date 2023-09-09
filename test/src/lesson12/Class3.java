package lesson12;

/*
Написать два метода: print(int) и print(String).

Написать два метода: print(int) и print(Integer).
Написать такой код в методе main,
чтобы вызвались они оба.

Написать пять методов print с разными параметрами.

Написать public static методы: int min(int, int),
long min(long, long), double min(double, double).
 Каждый метод должен возвращать минимальное
 из двух переданных в него чисел.

Написать public static методы: int max(int, int),
 long max (long, long), double max (double, double).
 Каждый метод должен возвращать максимальное
 из двух переданных в него чисел.

 */
public class Class3 {
    static void print(int i) {
        System.out.println(i);
    }

    static void print(String s) {
        System.out.println(s);
    }

    static void print(float f) {
        System.out.println(f);
    }

    static void print(Float f) {
        System.out.println(f);
    }

    static void print(Integer i) {
        System.out.println(i);
    }

    static int min(int a, int b) {
        if (a > b) {
            return b;
        } else return a;
    }

    static long min(long a, long b) {
        if (a > b) {
            return b;
        } else return a;
    }

    static double min(double a, double b) {
        if (a > b) {
            return b;
        } else return a;
    }

    static int max(int a, int b) {
        if (a > b) {
            return a;
        } else return b;
    }

    static long max(long a, long b){
        if (a > b) {
            return a;
        } else return b;
    }

    static double max(double a, double b){
        if (a > b) {
            return a;
        } else return b;
    }

    public static void main(String[] args) {
        print(10);
        print("string");
        print(11);
        print(1.2F);
        print(1.3F);

        System.out.println(min(1, 2));
        System.out.println(min(-9223372036854775808L, 9223372036854775807L));
        System.out.println(min(1.1231, 2.124124));

        System.out.println("\n");

        System.out.println(max(1, 2));
        System.out.println(max(9223372036854775807L, 9223372036854775807L));
        System.out.println(max(1.1231, 2.124124));
    }
}

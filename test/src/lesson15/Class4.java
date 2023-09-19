package lesson15;
/*
1. Программа должна выводить следующее:
Это double
Это Object
Это double
Это Integer
Это double
 */
public class Class4 {
    public static void print(double var){
        System.out.println(var);
    }

    public static void print(Object var){
        System.out.println(var);
    }

    public static void print(Integer var){
        System.out.println(var);
    }

    public static void main(String[] args) {
        print(10.124D);
        print("heh");
        print(11.213D);
        print(7);
        print(322.123D);
    }
}

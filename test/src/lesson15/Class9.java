package lesson15;
/*
1. Создать 7 public полей класса. Убедитесь,
что они инициализируются дефолтными значениями.
- intVar с типом int
- doubleVar с типом double
- DoubleVar с типом Double
- booleanVar с типом boolean
- ObjectVar с типом Object
- ExceptionVar с типом Exception
- StringVar с типом String

2. В методе main вывести их значения в заданном порядке.
 */
public class Class9 {
    public static int intVar;
    public static double doubleVar;
    public static Double doubleVar1;
    public static boolean booleanVar;
    public static Object objectVar;
    public static Exception exceptionVar;
    public static String stringVar;


    public static void main(String[] args) {
        System.out.println(intVar);
        System.out.println(doubleVar);
        System.out.println(doubleVar1);
        System.out.println(booleanVar);
        System.out.println(objectVar);
        System.out.println(exceptionVar);
        System.out.println(stringVar);
    }
}

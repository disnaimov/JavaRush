package lesson10;
/*
Расставьте правильно операторы приведения типа,
 чтобы получился ответ: d = 3.765
 */
public class Class2 {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        double c = (double) a / (double) b;
        double d = a * 1e-3+c;

        System.out.println(d);
    }
}

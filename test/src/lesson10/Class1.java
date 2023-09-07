package lesson10;
/*
Расставьте правильно операторы приведения типа, чтобы получился ответ: d > 0
 */
public class Class1 {
    public static void main(String[] args) {

        int a = 0;
        int b = (byte) a + 46;
        byte c = (byte) (a*b);
        double f = (char) 1234.15;
        long d = (int) (a + f / c + b);  // 1234.0  / 46

        System.out.println(d);

    }
}

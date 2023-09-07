package lesson10;
/*
Расставьте правильно операторы приведения типа,
 чтобы получился ответ: c = 256
 */
public class Class5 {
    public static void main(String[] args) {
        int a = (byte)44;
        int b = (short)300;
        short c = (short) (b - a);

        System.out.println(c);
    }
}

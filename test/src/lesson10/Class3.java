package lesson10;
/*
Добавить одну операцию по преобразованию типа,
чтобы получался ответ: b = 0
 */
public class Class3 {
    public static void main(String[] args) {
        float f = (float)128.50;
        int i = (int)f;
        int b = (byte)(i + f);

        System.out.println(b);
    }
}

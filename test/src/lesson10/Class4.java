package lesson10;
/*
Добавить одну операцию по преобразованию типа,
 чтобы получался ответ: nine = 9
 */
public class Class4 {
    public static void main(String[] args) {
        short number = 9;
        char zero = '0';
        int nine = (zero + number);

        System.out.println((char)nine);
    }
}

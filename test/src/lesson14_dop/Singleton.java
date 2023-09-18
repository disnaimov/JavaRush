package lesson14_dop;
/*
Задача: Класс является синглтоном
(реализует паттерн(шаблон) Singleton),
 если позволяет создать всего один объект своего типа.
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

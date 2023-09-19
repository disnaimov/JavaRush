package lesson15;
/*
1. В методе main создать 2 человека man и woman.
man с типом Man, woman с типом Woman.
2. Изменить метод printName так, чтобы он
выполнялся для man и woman.
3. Реализация метода printName должна быть одна.
 */
public class Class6 {
    public static class Man {
    }

    public static class Woman {
    }

    public static void print(Object o){
        if (o instanceof Man){
            System.out.println("Man");
        } else if (o instanceof Woman) {
            System.out.println("Woman");
        }
    }

    public static void main(String[] args) {
        print(new Man());
        print(new Woman());
    }
}

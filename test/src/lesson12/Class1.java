package lesson12;
/*
Написать метод, который определяет,
объект какого класса ему передали,
и возвращает результат – одно значение из:
 «Корова», «Кит», «Собака», «Неизвестное животное».

 */
public class Class1 {
    static class Cow {
    }

    static class Whale {
    }

    static class Dog {
    }

    static void who(Object o) {
        if (o.getClass() == Cow.class) {
            System.out.println("This is cow");
        } else if (o.getClass() == Whale.class) {
            System.out.println("This is whale");
        } else if (o.getClass() == Dog.class) {
            System.out.println("This is dog");
        } else
            System.out.println("This is unknown animal");
    }

    public static void main(String[] args) {
        Cow cow = new Cow();
        Whale whale = new Whale();
        Dog dog = new Dog();
        Object o = new Object();

        who(cow);
        who(whale);
        who(dog);
        who(o);
    }

}

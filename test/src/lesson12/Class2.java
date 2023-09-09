package lesson12;
/*
Написать метод, который определяет,
объект какого класса ему передали,
и выводит на экран одну из надписей:
 «Кошка», «Собака», «Птица», «Лампа».
 */

public class Class2 {

    static class Cat {
    }

    static class Dog {
    }

    static class Bird {
    }

    static class Lamp {
    }

    static void who(Object o) {
        if (o.getClass() == Cat.class) {
            System.out.println("It's cat");
        } else if (o.getClass() == Dog.class) {
            System.out.println("It's dog");
        } else if (o.getClass() == Bird.class) {
            System.out.println("It's bird");
        } else if (o.getClass() == Lamp.class){
            System.out.println("It's lamp");
        } else System.out.println("I don't know who is this");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Bird bird = new Bird();
        Lamp lamp = new Lamp();
        Object o = new Object();

        who(cat);
        who(dog);
        who(bird);
        who(lamp);
        who(o);
    }

}

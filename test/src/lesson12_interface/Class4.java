package lesson12_interface;
/*
1) Внутри класса Solution создай интерфейс
public interface Fly(летать) с методом void fly()
2) Внутри класса Solution создай интерфейс
public interface Climb(лазить по деревьям)
с методом void climb()
3) Внутри класса Solution создай интерфейс
public interface Run(бегать) с методом void run()
4) Подумай логически, какие именно интерфейсы нужно
 добавить для каждого класса
5) Добавь интерфейсы классам Cat(кот), Dog(собака),
Tiger(тигр), Duck(Утка).
 */
public class Class4 {

    static class Cat implements Run, Climb{
        @Override
        public void climb() {
            System.out.println("Cat climb");
        }

        @Override
        public void run() {
            System.out.println("Cat run");
        }
    }

    static class Dog implements Run{
        @Override
        public void run() {
            System.out.println("Dog run");
        }
    }

    static class Tiger implements Run, Climb{
        @Override
        public void climb() {
            System.out.println("Tiger climb");
        }

        @Override
        public void run() {
            System.out.println("Tiger run");
        }
    }

    static class Duck implements Fly, Run{
        @Override
        public void flyUp() {
            System.out.println("Duck fly up");
        }

        @Override
        public void flyDown() {
            System.out.println("Duck fly down");
        }

        @Override
        public void run() {
            System.out.println("Duck run");
        }
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Tiger tiger = new Tiger();
        Duck duck = new Duck();

        cat.run();
        cat.climb();

        System.out.println("\n");

        dog.run();

        System.out.println("\n");

        tiger.climb();
        tiger.run();

        System.out.println("\n");

        duck.flyUp();
        duck.flyDown();
        duck.run();
    }
}

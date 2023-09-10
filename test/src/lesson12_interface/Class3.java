package lesson12_interface;
/*
Есть public интерфейсы Fly(летать),
Run(бежать/ездить), Swim(плавать).
Добавь эти интерфейсы классам
Human(человек), Duck(утка), Penguin(пингвин),
Airplane(самолет).
 */
public class Class3 {

    static class Human implements Run, Swim{
        @Override
        public void run() {
            System.out.println("Human run");
        }

        @Override
        public void swim() {
            System.out.println("Human swim");
        }
    }

    static class Duck implements Run, Swim, Fly{
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

        @Override
        public void swim() {
            System.out.println("Duck swim");
        }
    }

    static class Airplane implements Run, Fly{
        @Override
        public void flyUp() {
            System.out.println("Airplane fly up");
        }

        @Override
        public void flyDown() {
            System.out.println("Airplane fly down");
        }

        @Override
        public void run() {
            System.out.println("Airplane move");
        }
    }

    public static void main(String[] args) {
        Human human = new Human();
        Duck duck = new Duck();
        Airplane airplane = new Airplane();

        human.run();
        human.swim();

        System.out.println("\n");

        duck.flyUp();
        duck.flyDown();
        duck.run();
        duck.swim();

        System.out.println("\n");

        airplane.flyUp();
        airplane.flyDown();
        airplane.run();
    }
}

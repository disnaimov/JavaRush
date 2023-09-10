package lesson12_interface;
/*
Есть интерфейсы Fly(летать), Swim(плавать),
Run(бегать).
Добавь эти интерфейсы классам Duck(утка),
Penguin(пингвин), Toad(жаба).

 */
public class Class5 {

    static class Duck implements Fly, Swim, Run{
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
    static class Penguin implements Run, Swim{
        @Override
        public void run() {
            System.out.println("Penguin run");
        }

        @Override
        public void swim() {
            System.out.println("Penguin swim");
        }
    }
    static class Toad implements Run, Swim{
        @Override
        public void run() {
            System.out.println("Toad run");
        }

        @Override
        public void swim() {
            System.out.println("Toad swim");
        }
    }

    public static void main(String[] args) {
        Duck duck = new Duck();
        Penguin penguin = new Penguin();
        Toad toad = new Toad();

        duck.flyUp();
        duck.flyDown();
        duck.run();
        duck.swim();

        System.out.println("\n");

        penguin.run();
        penguin.swim();

        System.out.println("\n");

        toad.run();
        toad.swim();
    }
}

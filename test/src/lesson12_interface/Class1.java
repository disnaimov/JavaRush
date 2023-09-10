package lesson12_interface;
/*
Напиши свой public интерфейс Fly (летать).
Добавь в него два метода.

Напиши public интерфейсы Fly(летать),
Run(бежать/ездить), Swim(плавать).
Добавить в каждый интерфейс по одному методу.
 */
public class Class1 {

    static class InterfaceTest implements Fly, Run, Swim{
        @Override
        public void flyUp() {
            System.out.println("You fly up");
        }

        @Override
        public void flyDown() {
            System.out.println("You fly down");
        }

        @Override
        public void run() {
            System.out.println("You run");
        }

        @Override
        public void swim() {
            System.out.println("You swim");
        }
    }

    public static void main(String[] args) {
        InterfaceTest flyTest = new InterfaceTest();
        for (int i = 0; i < 3; i++){
            flyTest.flyUp();
        }

        System.out.println("\n");

        for (int i = 0; i < 3; i++){
            flyTest.flyDown();
        }

        System.out.println("\n");

        flyTest.run();
        flyTest.run();

        System.out.println("\n");

        flyTest.swim();
        flyTest.swim();
    }
}

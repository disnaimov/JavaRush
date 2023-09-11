package lesson13_abstr;

public class Dog implements Eat, Moveable{
    @Override
    public void eat() {
        System.out.println("Dog eat");
    }

    @Override
    public void run() {
        System.out.println("Dog run");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.run();
    }
}

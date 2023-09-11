package lesson13_abstr;

public class Cat implements Moveable, Eatable, Eat{

    @Override
    public void eat() {
        System.out.println("Cat eat");
    }

    @Override
    public boolean eatable() {
        return true;
    }

    @Override
    public void run() {
        System.out.println("Cat run");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.run();
        System.out.println(cat.eatable());
    }
}

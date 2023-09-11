package lesson13_abstr;
/*
1. Создать классы Dog, Cat и Mouse.
2. Реализовать интерфейсы в добавленных классах, учитывая что:
    - Кот(Cat) может передвигаться, может кого-то съесть и может быть сам съеден.
    - Мышь(Mouse) может передвигаться и может быть съедена.
    - Собака(Dog) может передвигаться и съесть кого-то.

 */
public class Mouse implements Moveable, Eatable{
    @Override
    public boolean eatable() {
        return true;
    }

    @Override
    public void run() {
        System.out.println("Mouse run");
    }

    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.run();
        System.out.println(mouse.eatable());
    }
}

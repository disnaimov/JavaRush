package lesson12_interface;
/*
Есть public интерфейсы Fly(летать),
Move(передвигаться), Eat(есть).
Добавь эти интерфейсы классам Dog(собака),
Car(автомобиль), Duck(утка), Airplane(самолет).
 */
public class Class2 {
    static class Dog implements Eat{
        @Override
        public void eat() {
            System.out.println("The dog impl eat and eat)");
        }
    }

    static class Car implements Move{
        @Override
        public void move() {
            System.out.println("The car impl move and move)");
        }
    }

    static class Duck implements Fly{
        @Override
        public void flyUp() {
            System.out.println("The duck fly up");
        }

        @Override
        public void flyDown() {
            System.out.println("The duck fly down");
        }
    }

    static class Airplane implements Fly{
        @Override
        public void flyUp() {
            System.out.println("The airplane fly up");
        }

        @Override
        public void flyDown() {
            System.out.println("The airplane fly down");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Duck duck = new Duck();
        Airplane airplane = new Airplane();

        dog.eat();
        car.move();
        duck.flyUp();
        duck.flyDown();
        airplane.flyUp();
        airplane.flyDown();
    }
}

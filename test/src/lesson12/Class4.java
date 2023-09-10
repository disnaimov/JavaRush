package lesson12;
/*
Унаследуй классы Cat и Dog от Pet.
Реализуй недостающие методы. Классы Cat и Dog
не должны быть абстрактными.
 */
public class Class4 {
    static abstract class Pet{
        void hey(){
        }
    }

    static class Cat extends Pet{
        @Override
        void hey() {
            System.out.println("meow");
        }
    }

    static class Dog extends Pet{
        @Override
        void hey() {
            System.out.println("haw)");
        }
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.hey();
        dog.hey();
    }
}

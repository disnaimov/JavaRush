package lesson12_dop;

import java.util.List;

/*
Переопредели метод getName в классе Cat так,
чтобы программа выдавала на экран надпись «Я - кот».

Переопредели метод setName в классе Cat так,
чтобы программа выдавала на экран надпись «Я - кот».

Напиши метод, который определяет, какой объект
 передали в него.
Программа должна выводить на экран
 одну из надписей:
«Кот», «Тигр», «Лев», «Бык», «хз».

 */
public class Class1 {
    static class Cat{
        void setName(String name){
            System.out.println(name);
        }
        void getName(){}
    }

    static class CatOv extends Cat{
        @Override
        void setName(String name) {
            System.out.println("I'm cat");
        }

        @Override
        void getName() {
            System.out.println("I'm cat");
        }
    }

    static class Tiger{}
    static class Lion{}
    static class Bull{}

    static void who(Object o){
        if (o.getClass() == Cat.class){
            System.out.println("It's cat");
        } else if (o.getClass() == Tiger.class) {
            System.out.println("It's tiger");
        } else if (o.getClass() == Lion.class) {
            System.out.println("It's lion");
        } else if (o.getClass() == Bull.class) {
            System.out.println("It's bull");
        } else System.out.println("hz");
    }

    public static void main(String[] args) {
        CatOv catOv = new CatOv();

        catOv.setName("Name");
        catOv.getName();

        System.out.println("\n");

        Cat cat = new Cat();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Bull bull = new Bull();


        who(cat);
        who(tiger);
        who(lion);
        who(bull);
        who(catOv);
    }
}

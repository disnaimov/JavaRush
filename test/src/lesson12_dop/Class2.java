package lesson12_dop;
/* Что это? «Кот», «Тигр», «Лев», «Бык», «Корова», «Животное»
Напиши метод, который определяет, какой объект передали в него.
Программа должна выводить на экран одну из надписей:
«Кот», «Тигр», «Лев», «Бык», «Корова», «Животное».
Замечание: постарайся определять тип животного как можно более точно.
*/
public class Class2 {

    static class Animal{}
    static class Cow extends Animal{}
    static class Bull extends Animal{}
    static class Cat extends Animal{}
    static class Tiger extends Cat{}
    static class Lion extends Cat{}
    static class Human extends Animal{}

    public static String getObjectType(Object o){
        if (o instanceof Tiger){
            return "Tiger";
        } else if (o instanceof Lion) {
            return "Lion";
        } else if (o instanceof Cat) {
            return "Cat";
        } else if (o instanceof  Bull) {
            return "Bull";
        } else if (o instanceof Cow) {
            return "Cow";
        } else if (o instanceof Animal){
            return "Animal";
        } else return "Unknown animal";
    }

    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
        System.out.println(getObjectType(new Human()));
    }
}

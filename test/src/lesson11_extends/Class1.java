package lesson11_extends;
/*
Написать два класса: Horse(лошадь) и Pegas(пегас).
Унаследовать пегаса от лошади.

Написать три класса: Pet(домашнее животное),
 Cat(кот) и Dog(собака). Унаследовать кота и собаку
 от животного.

Написать шесть классов: Animal(животное), Cow(корова)
 и Pig(свинья), Sheep(овца), Bull(бык),
 Goat(козел). Унаследовать корову, свинью, овцу,
 быка и козла от животного.

 Написать четыре класса: Worker(сотрудник),
 Manager(управляющий), Chief(директор)
 и Secretary(секретарь). Унаследовать управляющего,
 директора и секретаря от сотрудника.

 Написать девять классов: Worker(сотрудник), Clerk(клерк), IT(ИТ-специалист),
  Programmer(программист), ProjectManager(менеджер проекта),
  CTO(технический директор), HR(рекрутер),
  OfficeManager(офис-менеджер), Cleaner(уборщик).
Унаследовать программиста, менеджера проекта и
технического директора от ИТ-специалиста.
Унаследовать рекрутера, уборщика и офис-менеджера от клерка.
Унаследовать клерка и ИТ-специалиста от сотрудника.
 */

public class Class1 {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.setAge(10);

        Pegas pegas = new Pegas();
        pegas.setAge(11);
        pegas.setName("Pegas name");

        System.out.println(horse.toString());

        System.out.println(pegas.toString());
        System.out.println("\n");

        Pet pet = new Pet();
        Cat cat = new Cat();
        Dog dog = new Dog();

        pet.say();
        cat.say();
        dog.say();
    }
}

package lesson7.Lesson7_dopquests;
/*
6. Семья

Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так,
 чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
 */
public class Class6 {

    public static void main(String[] args) {
        Lesson7_dopquests.Human grandPa1 = new Lesson7_dopquests.Human("дед Василий", true, 80);
        Lesson7_dopquests.Human grandPa2 = new Lesson7_dopquests.Human("дед Иван", true, 75);

        Lesson7_dopquests.Human grandMa1 = new Lesson7_dopquests.Human("баба Параша", false, 73);
        Lesson7_dopquests.Human grandMa2 = new Lesson7_dopquests.Human("баба Настя", false, 64);

        Lesson7_dopquests.Human father = new Lesson7_dopquests.Human("папа Илья", true, 40, grandPa1, grandMa1);
        Lesson7_dopquests.Human mother = new Lesson7_dopquests.Human("мама Алёна", false, 35, grandPa2, grandMa2);

        Lesson7_dopquests.Human daughter = new Lesson7_dopquests.Human("Дина", false, 20, father, mother);
        Lesson7_dopquests.Human oldSon = new Lesson7_dopquests.Human("Дима", true, 15, father, mother);
        Lesson7_dopquests.Human juniorSon = new Lesson7_dopquests.Human("Денис", true, 10, father, mother);

        System.out.println(grandPa1.toString());
        System.out.println(grandPa2.toString());
        System.out.println(grandMa1.toString());
        System.out.println(grandMa2.toString());
        System.out.println(daughter.toString());
        System.out.println(oldSon.toString());
        System.out.println(juniorSon.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
    }
}

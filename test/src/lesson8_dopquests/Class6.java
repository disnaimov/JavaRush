package lesson8_dopquests;

import java.util.ArrayList;

/*
6. Вся семья в сборе

1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
 */
public class Class6 {

    static class Human{
        String name;
        boolean sex;
        int age;
        ArrayList<Human>children = new ArrayList();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human child1) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.add(child1);
        }


        public Human(String name, boolean sex, int age, Human child1, Human child2, Human child3){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.add(child1);
            this.children.add(child2);
            this.children.add(child3);
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

    public static void main(String[] args) {
        Human child1 = new Human("Mark", true, 6);
        Human child2 = new Human("Joseph", true, 5);
        Human child3 = new Human("Emmanuel", false, 4);
        Human father = new Human("David", true, 35, child1, child2, child3);
        Human mother = new Human("Sarah", false, 29, child1, child2, child3);
        Human grandfather1 = new Human("Valentine", true, 65, mother);
        Human grandfather2 = new Human("Victor", true, 68, father);
        Human grandmother1 = new Human("Lidiya", false, 60, mother);
        Human grandmother2 = new Human("Nina", false, 59, father);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);

    }
}

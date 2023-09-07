package lesson45;

import java.util.Date;

public class Lesson5_1 {
    public static void main(String[] args) {
        L4_Cat cat1 = new L4_Cat();
        L4_Cat cat2 = new L4_Cat();
        L4_Cat cat3 = new L4_Cat();

        cat1.setName("Vaska");
        cat1.setAge(7);
        cat1.setWeight(8);
        cat1.setStraight(13);
        cat1.setColor("White");
        cat1.setAddress("Dom 1");

        cat2.setName("Bars");
        cat2.setAge(10);
        cat2.setWeight(11);
        cat2.setStraight(12);
        cat2.setColor("Black");
        cat2.setAddress("Dom 2");

        cat3.setName("Tom");
        cat3.setAge(14);
        cat3.setWeight(15);
        cat3.setStraight(16);
        cat3.setColor("Orange");
        cat3.setAddress("Dom 3");

        cat1.fight(cat1, cat2);
        cat1.fight(cat1, cat3);

        cat2.fight(cat1, cat2);
        cat2.fight(cat2, cat3);

        cat3.fight(cat1, cat2);
        cat3.fight(cat3, cat1);

        System.out.println("\n");
        System.out.println(cat1.toString());
        System.out.println(cat2.toString());
        System.out.println(cat3.toString());

        Solution.Man man1 = new Solution.Man("Jack", 22, "Baker Street - 17");
        Solution.Man man2 = new Solution.Man("Bob", 23, "Baker avenue - 2");

        Solution.Woman woman1 = new Solution.Woman("Lilia", 22, "Shaftesbury Avenue - 33");
        Solution.Woman woman2 = new Solution.Woman("Daria", 20, "Abbey Road - 44");

        System.out.println("\n");
        System.out.println(man1.toString());
        System.out.println(man2.toString());
        System.out.println(woman1.toString());
        System.out.println(woman2.toString());

        Cat.Catt catt1 = new Cat.Catt("Tom", "Ford", 10);
        Cat.Catt catt2 = new Cat.Catt("Alise", "Ford", 8);
        Dog.Dogg dogg1 = new Dog.Dogg("Max", "Toyota", 9);
        Dog.Dogg dogg2 = new Dog.Dogg("Rocky", "Toyota", 2);

        System.out.println("\n");
        System.out.println(catt1.toString());
        System.out.println(catt2.toString());
        System.out.println(dogg1.toString());
        System.out.println(dogg2.toString());

        System.out.println("\n");
        Date date = new Date();
        System.out.println(date);
    }
}

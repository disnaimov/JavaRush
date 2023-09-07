package lesson6;
public class Lesson5_1 {
    public static void main(String[] args) {


        for(int i = 0; i < 10; i++) {
            new L6_Cat();
            L6_Cat.catCount();
        }
        L6_Cat.printCats();

        System.out.println(L6_Cat.catCount());


    }
}

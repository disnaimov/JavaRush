package lesson16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
1. Разберитесь, что делает программа.
2. Расставь вызовы методов join() так, чтобы для каждой кошки выполнялось следующее:
2.1. Сначала кошка рожает котят.
2.2. Потом все котята вылазят из корзинки в произвольном порядке.
2.3. В конце кошка собирает их назад в корзинку.
2.4. Все события для одной кошки могут быть перемешаны с событями для другой кошки.
2.5. Добавить сон котят (200 мс) в investigateWorld
 */
public class Class10 {
    static class  Cat {
        private String name;
        private Cat parrent;
        private boolean inBucket;

        // @Override
        // public String toString(){
        //     return name = ""
        // }

        public Cat(){}

        public Cat(String name, Cat parrent){
            this.name = name;
            this.parrent = parrent;
        }

        public void setInBucket(boolean inBucket){
            this.inBucket = inBucket;
        }

        public boolean getInBucket(){
            return inBucket;
        }

        public void setName(String name){
            this.name = name;
        }
        
        public String getName(){
            return name;
        }

        public void setParrent(Cat parrent){
            this.parrent = parrent;
        }

        public Cat getParrent(){
            return parrent;
        }

        public List<Cat> create(Cat parrent, int num){

            List<Cat> cats = new ArrayList<>();
            
            for (int i = 0; i < num; i++) {
                cats.add(new Cat("kitty" + Integer.toString(i), parrent));
            }

            return cats;
        }

        public static void putCatsInBucket(List<Cat> cats){
            for (Cat cat : cats) {
                cat.setInBucket(true);
            }
        }        
    }


    public static void main(String[] args) {
        Cat mother = new Cat();
        mother.setName("CatMother");
        mother.setParrent(null);
        mother.setInBucket(false);
       

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
        int num = Integer.parseInt(br.readLine());
         List<Cat> cats = mother.create(mother, num);

         for (Cat cat : cats) {
            System.out.println(cat);
         }

        Cat.putCatsInBucket(cats);

         for (Cat cat : cats) {
            System.out.println(cat.getInBucket());
         }
        br.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        // корзина, перенос в корзину
        // toString
    }
}

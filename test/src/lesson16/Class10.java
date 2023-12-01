package lesson16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

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

        public Cat(String name, Cat parrent, boolean inBucket){
            this.name = name;
            this.parrent = parrent;
            this.inBucket = inBucket;
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
                cats.add(new Cat("kitty" + Integer.toString(i), parrent, true));
            }

            return cats;
        }

        public static void putCatsInBucket(List<Cat> cats){
            for (Cat cat : cats) {
                cat.setInBucket(true);
            }
        }
        
        public static void randomCatLeavingBaket(List<Cat> cats, List<Integer> catsIndexes){
            
         for (Cat cat : cats) {
            cats.get(catsIndexes.get(cats.indexOf(cat))).setInBucket(false);
            try {
            Thread.sleep(1000);
            System.out.println("cat sleep before leaving");
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Cats in bucket variable now have state " + cats.get(catsIndexes.get(cats.indexOf(cat))).getInBucket());
         }  

        }

        public void motherPutKidsInBucket(List<Cat> cats, List<Integer> catsIndexes){
            for (Cat cat : cats) {
              cats.get(catsIndexes.get(cats.indexOf(cat))).setInBucket(true);
              try {
                Thread.sleep(1000);
                System.out.println("Mother put kitties in bucket, it takes time");
              }  catch (InterruptedException e) {
                e.printStackTrace();
              }
              System.out.println("Cats in bucket variable now have state " + cats.get(catsIndexes.get(cats.indexOf(cat))).inBucket);
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
        int kittyNumber = Integer.parseInt(br.readLine());
         List<Cat> cats = mother.create(mother, kittyNumber);

        List<Integer> catsIndexes = new ArrayList<>();
        for (Cat cat : cats) {
            catsIndexes.add(cats.indexOf(cat));
        }

        Collections.shuffle(catsIndexes);

         for (Integer integer : catsIndexes) {
            System.out.println(integer);
         }

        Cat.randomCatLeavingBaket(cats, catsIndexes);

        System.out.println("\n");

        mother.motherPutKidsInBucket(cats, catsIndexes);

         
        br.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        // корзина, перенос в корзину
        // toString
    }
}

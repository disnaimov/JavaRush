package lesson8_dopquests;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
2. Множество всех животных

1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, который должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, который должен возвращать множество с 3 собаками.
4. Реализовать метод join, который должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, который должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, который должен выводить на экран всех животных, которые в нем есть.
Каждое животное с новой строки
 */
public class Class2 {
    public static Map<Integer, String> join(Map<Integer, String> cats, Map<Integer, String> dogs){
        Map<Integer, String> pets = new HashMap<>();

        pets.putAll(cats);
        pets.putAll(dogs);

        return pets;
    }

    public static Map<Integer, String> removeCats(Map<Integer, String> pets){
        Iterator<Map.Entry<Integer, String>> iterator = pets.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> pair = iterator.next();
            if (pair.getValue().contains("cat")){
                iterator.remove();
            }
        }
        return pets;
    }

    public static void printPets(Map<Integer, String> pets){
        for (Map.Entry<Integer, String> pair:
             pets.entrySet()) {
            System.out.println(pair.getValue());
        }
    }
    static class Cat{
        public static Map<Integer, String> createCats(){
            Map<Integer, String> cats = new HashMap<>();

            cats.put(1, "cat1");
            cats.put(2, "cat2");
            cats.put(3, "cat3");
            cats.put(4, "cat4");

            return cats;
        }
    }

    static class Dog{
        public static Map<Integer, String> createDogs(){
            Map<Integer, String> dogs = new HashMap<>();

            dogs.put(5, "dog1");
            dogs.put(6, "dog2");
            dogs.put(7, "dog3");

            return dogs;
        }
    }

    public static void main(String[] args) {
        Map<Integer, String> cats = Cat.createCats();
        Map<Integer, String> dogs = Dog.createDogs();

        Map<Integer, String> pets = join(cats, dogs);

        removeCats(pets);
        printPets(pets);
    }
}

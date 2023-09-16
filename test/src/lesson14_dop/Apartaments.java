package lesson14_dop;
/*
1. Реализовать метод cleanAllApartaments.
Для каждого объекта из apartaments:
2. Для однокомнатных квартир (Apt1Room)
вызвать метод clean1Room, т.е. если объект типа Apt1Room,
 то вызвать у него метод clean1Romm.
3. Для двухкомнатных квартир (Apt2Room)
вызвать метод clean2Rooms, т.е. если объект типа
Apt2Room, то вызвать у него метод clean2Rooms.
4. Для трехкомнатных квартир (Apt3Room) вызвать метод
 clean3Rooms, т.е. если объект типа Apt3Room,
 то вызвать у него метод clean3Rooms.
 */
public class Apartaments {

    static class Art1Room{}
    static class Art2Room{}
    static class Art3Room{}
    static void clean1Room(){
        System.out.println("Clean 1st room");
    }

    static void clean2Room(){
        System.out.println("Clean 2nd room");
    }

    static void clean3Room(){
        System.out.println("Clean 3rd room");
    }

    static void cleanAllApartments(Object o){
        if (o instanceof Art1Room){
            clean1Room();
        } else if (o instanceof Art2Room) {
            clean2Room();
        } else if (o instanceof Art3Room) {
            clean3Room();
        }
    }

    public static void main(String[] args) {
        Art1Room art1Room = new Art1Room();
        Art2Room art2Room = new Art2Room();
        Art3Room art3Room = new Art3Room();

        cleanAllApartments(art1Room);
        cleanAllApartments(art2Room);
        cleanAllApartments(art3Room);
    }

}

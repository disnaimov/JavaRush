package lesson14;
/*
1. Подумать, что делает программа.
2. Изменить метод haveRest так, чтобы он вызывал метод
    - play, если person имеет тип Player
    - dance, если person имеет тип Dancer
 */
public class Class3 {
    static class Player{
        void play(){
            System.out.println("I'm player");
        }
    }
    static class Dancer{
        void dance(){
            System.out.println("I'm dancer");
        }

    }

    static void haveRest(Object person){
        if (person instanceof Player){
            ((Player) person).play();
        }
        if (person instanceof Dancer){
            ((Dancer) person).dance();
        }
    }


    public static void main(String[] args) {
        Player player = new Player();
        Dancer dancer = new Dancer();

        haveRest(player);
        haveRest(dancer);
    }
}

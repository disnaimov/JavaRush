package lesson14;

public class HenFactory {
    static String getHen(Object o){
        String s = "";
        if (o instanceof RussianHen){
            s = "leggorn";
        } else if (o instanceof UkrainianHen) {
            s = "haisek uait";
        } else if (o instanceof BelarusianHen) {
            s = "haisek braun";
        } else if (o instanceof MoldovanHen) {
            s = "loman braun";
        }
        return s;
    }

    public static void main(String[] args) {
        RussianHen russianHen = new RussianHen();
        MoldovanHen moldovanHen = new MoldovanHen();
        UkrainianHen ukrainianHen = new UkrainianHen();
        BelarusianHen belarusianHen = new BelarusianHen();

        getHen(russianHen);
        getHen(moldovanHen);
        getHen(ukrainianHen);
        getHen(belarusianHen);

        System.out.println(russianHen.getDescription());
        System.out.println(moldovanHen.getDescription());
        System.out.println(ukrainianHen.getDescription());
        System.out.println(belarusianHen.getDescription());
    }

}

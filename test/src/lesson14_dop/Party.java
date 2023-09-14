package lesson14_dop;

public class Party {

    static Wine getDeliciousDrink(){
        return new Wine();
    }

    static Wine getWine(){
        return new Wine();
    }

    static Wine getBubblyWine(){
        return new BubblyWine();
    }


    public static void main(String[] args) {

        System.out.println(getWine().getHolidayName() +"\n"
        + getBubblyWine().getHolidayName() + "\n"
        + getDeliciousDrink().getHolidayName());
    }
}

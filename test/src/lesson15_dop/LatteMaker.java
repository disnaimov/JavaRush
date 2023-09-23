package lesson15_dop;

public class LatteMaker extends DrinkMarker{
    @Override
    public void getRightCup() {
        System.out.println("take a cup of latte");
    }

    @Override
    public void putIngredient() {
        System.out.println("pour latte");
    }

    @Override
    public void pour() {
        System.out.println("fill with water");
    }

    @Override
    void makeDrink() {
        super.makeDrink();
        System.out.println("latte is ready");
    }
}

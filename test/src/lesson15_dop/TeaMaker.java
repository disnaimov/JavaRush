package lesson15_dop;

public class TeaMaker extends DrinkMarker{
    @Override
    public void getRightCup() {
        System.out.println("take a cup of tea");
    }

    @Override
    public void putIngredient() {
        System.out.println("pour tea");
    }

    @Override
    public void pour() {
        System.out.println("fill with water");
    }

    @Override
    void makeDrink() {
        super.makeDrink();
        System.out.println("tea is ready");
    }
}

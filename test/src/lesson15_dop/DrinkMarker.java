package lesson15_dop;

public abstract class DrinkMarker {
    public abstract void getRightCup();
    public abstract void putIngredient();
    public abstract void pour();

    void makeDrink(){
        getRightCup();
        putIngredient();
        pour();
    }
}

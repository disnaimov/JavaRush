package lesson15;

public class Clothes implements Movable, Sellable, Discountable{
    @Override
    public void discount() {
        System.out.println("Discount");
    }

    @Override
    public void move() {
        System.out.println("Move");
    }

    @Override
    public void sell() {
        System.out.println("Sell");
    }

    public static void main(String[] args) {
        Clothes clothes = new Clothes();

        clothes.discount();
        clothes.move();
        clothes.sell();
    }
}

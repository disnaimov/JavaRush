package lesson15_dop;

public class Class7 {
    public static void main(String[] args) {
        LatteMaker latte = new LatteMaker();
        TeaMaker tea = new TeaMaker();

        latte.makeDrink();
        System.out.println("\n");
        tea.makeDrink();
    }
}

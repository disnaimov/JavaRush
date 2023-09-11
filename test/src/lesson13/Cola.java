package lesson13;
/*
Реализуй интерфейс Drink в классах Beer и Cola.
 */
public class Cola implements Drink{
    @Override
    public void drink() {
        System.out.println("Drink cola");
    }

    public static void main(String[] args) {
        Cola cola = new Cola();
        cola.drink();
    }
}

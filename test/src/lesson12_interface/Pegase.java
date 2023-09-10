package lesson12_interface;

public class Pegase extends Horse implements Fly{

    @Override
    void move() {
        System.out.println("Pegase move");
    }

    @Override
    public void flyUp() {
        System.out.println("Pegase fly up");
    }

    @Override
    public void flyDown() {
        System.out.println("Pegase fly down");
    }

    public static void main(String[] args) {
        Pegase pegase = new Pegase();
        pegase.move();
        pegase.flyUp();
        pegase.flyDown();
    }
}

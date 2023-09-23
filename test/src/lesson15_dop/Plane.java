package lesson15_dop;

public class Plane implements Flyable{
    @Override
    public void fly() {
        System.out.println("Plane fly");
    }

    public Plane(int passengerCount){}
}

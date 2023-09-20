package lesson15_dop;

public class Earth implements Planet{
    static Earth instance;
    private Earth(){}

    public static Earth getInstance() {
        if (instance == null){
            instance = new Earth();
        }
        return instance;
    }

    @Override
    public Object getPlanet() {
        return this;
    }

    public String toString(Earth earth) {
        return "Earth{}" + earth.getPlanet();
    }


}

package lesson15_dop;

public class Sun implements Planet{
    static Sun instance = null;
    private Sun(){}

    public static Sun getInstance() {
        if (instance == null){
            instance = new Sun();
        }
        return instance;
    }

    @Override
    public Object getPlanet() {
        return this;
    }


    public String toString(Sun sun) {
        return "Sun{}" + sun.getPlanet();
    }
}

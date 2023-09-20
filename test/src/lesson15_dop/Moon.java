package lesson15_dop;

public class Moon implements Planet{
    static Moon instance = null;
    private Moon(){}

    public static Moon getInstance() {
        if (instance == null){
            instance = new Moon();
        }
        return instance;
    }

    @Override
    public Object getPlanet() {
        return this;
    }


    public String toString(Moon moon) {
        return "Moon{}" + moon.getPlanet();
    }
}

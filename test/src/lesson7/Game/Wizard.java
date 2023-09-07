package Game;

public class Wizard extends Heroes{
    public Wizard(String name) throws Exception {
        super(name);
    }

    @Override
    public void greet(Heroes hero) {
        System.out.println("Hi" + hero.getName());
    }
}


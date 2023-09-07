package Game;

public class Warrior extends Heroes{
    public Warrior(String name) throws Exception {
        super(name);
    }

    @Override
    public void greet(Heroes hero) {
        System.out.println("Hello" + hero.getName());
    }
}

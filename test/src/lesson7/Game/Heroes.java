package Game;

public abstract class Heroes {
    private String name;
    private int lvl;
    private Point location;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Heroes(String name) throws Exception {
        this.name = name;
        this.lvl = 1;
        this.location = new Point(0, 0);
    }

    public abstract void greet(Heroes hero);

}

package lesson8_collections;

public class Cat {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
    }

    public String toString(){

        return "cat name is " + name;
    }
}

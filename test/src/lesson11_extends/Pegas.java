package lesson11_extends;

public class Pegas extends Horse{
    private int age;
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pegas{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

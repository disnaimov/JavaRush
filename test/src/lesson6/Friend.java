package lesson6;
public class Friend {
    private String name;
    private int age;

    private String gender;

    public void initialize(String name){
        this.name = name;
    }

    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void initialize(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Friend(String name){
        this.name = name;
    }

    public Friend(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Friend(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

}

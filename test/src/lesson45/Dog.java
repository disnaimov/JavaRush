package lesson45;
public class Dog {
    private String name;
    private int age;

    private int height;

    private String color;


    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getHeight(){
        return  height;
    }

    public String getColor(){
        return color;
    }

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public void initialize(String name, int height, String color){
        this.name = name;
        this.height = height;
        this.color = color;
    }

    public Dog(String name){
        this.name = name;
    }

    public Dog(String name, int height){
        this.name = name;
        this.height = height;
    }

    public Dog(String name, int height, String color){
        this.name = name;
        this.height = height;
        this.color = color;
    }

    public static class Dogg{
        private String firstname;
        private String lastname;
        private int age;

        public Dogg(String firstname){
            this.firstname = firstname;
        }
        public Dogg(String firstname, String lastname){
            this.firstname = firstname;
            this.lastname = lastname;
        }
        public Dogg(String firstname, String lastname, int age){
            this.firstname = firstname;
            this.lastname = lastname;
            this.age = age;
        }
        public String toString(){
            return "name - " + firstname + ", " +
                    "lastname - " + lastname + ", " +
                    "age - " + age + "." ;
        }
    }
}

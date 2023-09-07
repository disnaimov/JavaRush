package lesson45;
public class L4_Cat {
    private String name;
    private int age;
    private  int weight;
    private int straight;

    private String color;

    private String address;

    public void setAddress(String address){
        this.address = address;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public void setStraight(int straight){
        this.straight = straight;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getWeight(){
        return weight;
    }
    public int getStraight(){
        return straight;
    }

    public String getColor(){
        return color;
    }

    public String getAddress(){
        return address;
    }

    public void fight(L4_Cat cat1, L4_Cat cat2){
        String result = "Победил кот";
        if(cat1.getStraight() < cat2.getStraight()){
            System.out.println(result + " " + cat2.getName());
        } else if (cat1.getStraight() > cat2.getStraight()) {
            System.out.println(result + " " + cat1.getName());
        } else if (cat1.getStraight() == cat2.getStraight()) {
            System.out.println("Ничья");
        }
    }


    public void initialize(String name){
        this.name = name;
    }

    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void initialize(int weight, String color){
        this.weight = weight;
        this.color = color;
    }

    public void initialize(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public L4_Cat(){}

    public L4_Cat(String name){
        this.name = name;
    }

    public L4_Cat(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public L4_Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public L4_Cat(int weight, String color){
        this.weight = weight;
        this.color = color;
    }

    public L4_Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public String toString(){
        return "name - " + name + ", " +
                "age - " + age + ", " +
                "weight - " + weight + ", " +
                "straight - " + straight + ", " +
                "color - " + color + ", " +
                "address - " + address + "." ;
    }

    public static class Catt{
        private String firstname;
        private String lastname;
        private int age;

        public Catt(String firstname){
            this.firstname = firstname;
        }
        public Catt(String firstname, String lastname){
            this.firstname = firstname;
            this.lastname = lastname;
        }
        public Catt(String firstname, String lastname, int age){
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

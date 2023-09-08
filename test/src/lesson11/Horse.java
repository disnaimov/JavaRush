package lesson11;

public class Horse {
    private int age;

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "age=" + age +
                '}';
    }
}

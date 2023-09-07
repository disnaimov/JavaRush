package Lesson7_dopquests;

public class Human {
    private String name;
    private boolean gender;
    private int age;
    Human mother;
    Human father;

    public Human(String name, boolean gender, int age, Human mother, Human father){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.mother = mother;
        this.father = father;
    }

    public  Human(String name, boolean gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Human(){}

    public  String   toString() {
        String text = "";
        text += "Имя:" + this.name;
        text += ", возраст:" + this.age;
        text += ", пол: " + (this.gender ? "мужской" : "женский");
        if (this.mother != null){
            text += ", мать" + this.mother.name;
        }
        if (this.father != null){
                text += ", отец: " + this.father.name;
        }
        return text;
    }
}

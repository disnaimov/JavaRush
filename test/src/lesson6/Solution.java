package lesson6;

public class Solution {
    public static String name;
    public static class Man{
        private String name;
        private int age;
        private String address;

        public Man(String name){
            this.name = name;
        }
        public Man(String name, int age){
            this.name = name;
            this.age = age;
        }
        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString(){
            return "name - " + name + ", " +
                    "age - " + age + ", " +
                    "address - " + address + "." ;
        }
    }
    public static class Woman{
        private String name;
        private int age;
        private String address;

        public Woman(String name){
            this.name = name;
        }
        public Woman(String name, int age){
            this.name = name;
            this.age = age;
        }
        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString(){
            return "name - " + name + ", " +
                    "age - " + age + ", " +
                    "address - " + address + "." ;
        }
    }

    public static class Idea{
        public String getDescription(){
            return "TEST";
        }
        public void printIdea(Idea idea){
            System.out.println(idea.getDescription());
        }
    }

    public static void main(String[] args) {
        Idea idea = new Idea();
        idea.printIdea(idea);
    }
}

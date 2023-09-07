

public class Solution {
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
}

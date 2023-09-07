public class NewCat {
    private String name;
    private String parent;
    private String mother;

    public NewCat(String name, String parent, String mother){
        this.name = name;
        this.parent = parent;
        this.mother = mother;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setParent(String parent){
        this.parent = parent;
    }
    public void setMother(String mother){
        this.mother = mother;
    }
    public String getName(){
        return name;
    }
    public String getParent(){
        return parent;
    }
    public String getMother(){
        return mother;
    }
    public String toString(){
        return "name - " + name + ", " +
                "parent - " + parent + ", " +
                "mother - " + mother + ". ";
    }

    public static void main(String[] args) {
        NewCat cat1 = new NewCat("Bars", "HZ", "HZ");
        NewCat cat2 = new NewCat("Vaska", "Bars", "Mom1");
        NewCat cat3 = new NewCat("Orange", "Vaska", "Mom2");
        System.out.println(cat3.toString());
        System.out.println(cat2.toString());
        System.out.println(cat1.toString());
    }
}

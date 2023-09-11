package lesson13;

public class CleverMan implements Boss{
    @Override
    public void boss() {
        System.out.println("I'm boss");
    }

    @Override
    public boolean isAlive() {
        return true;
    }

    @Override
    public boolean workable(Object o) {
        if (o.getClass() == CleverMan.class){
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        CleverMan cleverMan = new CleverMan();
        cleverMan.boss();
        System.out.println(cleverMan.isAlive());
        System.out.println(cleverMan.workable(cleverMan));
    }
}

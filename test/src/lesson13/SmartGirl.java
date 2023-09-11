package lesson13;

/*
1. Добавь интерфейсы Secretary и Boss к классам
 CleverMan и SmartGirl. По одному на каждый.
 Подумай, кому какой.
2. Унаследуй интерфейсы Secretary и Boss от
интерфейсов Person и Workable так, чтобы
все методы у классов CleverMan и SmartGirl
оказались объявленными в каком-то интерфейсе.
 */
public class SmartGirl implements Secretary {
    @Override
    public boolean isAlive() {
        return true;
    }

    @Override
    public void secretary() {
        System.out.println("I'm secretary");
    }

    @Override
    public boolean workable(Object o) {
        if (o.getClass() == SmartGirl.class) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        SmartGirl smartGirl = new SmartGirl();
        System.out.println(smartGirl.isAlive());
        System.out.println(smartGirl.workable(smartGirl));
        smartGirl.secretary();
    }
}

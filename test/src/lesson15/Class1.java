package lesson15;
/*
1. Создать public static класс Goose(Гусь).
2. Создать public static класс Dragon(Дракон).
3. Унаследовать класс Goose от BigAnimal
или SmallAnimal, подумать, какой логически
 больше подходит.
4. Унаследовать класс Dragon от BigAnimal или
SmallAnimal, подумать, какой логически больше подходит.
5. В классах Goose и Dragon переопределить
метод String getSize(), расширить видимость
 до максимальной.
6. В классе Goose метод getSize должен возвращать
строку "Гусь маленький, " +
[getSize родительского класса].
7. В классе Dragon метод getSize должен
возвращать строку "Дракон большой, " +
 [getSize родительского класса].
 */
public class Class1 {
    public static class Goose extends SmallAnimal {

        public String getSize() {
            return "Goose is small " + super.getSize();
        }
    }

    public static class Dragon extends BigAnimal {

        public String getSize() {
            return "Dragon is big " + super.getSize();
        }
    }

    public static void main(String[] args) {
        BigAnimal bigAnimal = new BigAnimal();
        BigAnimal dragon = new Dragon();

        SmallAnimal smallAnimal = new SmallAnimal();
        SmallAnimal goose = new Goose();

        System.out.println(bigAnimal.getSize());
        System.out.println(dragon.getSize());

        System.out.println(smallAnimal.getSize());
        System.out.println(goose.getSize());
    }
}

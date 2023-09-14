package lesson14_dop;
/*
1. Создать интерфейс Bridge с методом
int getCarsCount().
2. Создать классы WaterBridge и SuspensionBridge,
которые реализуют интерфейс Bridge.
3. Метод getCarsCount() должен возвращать
любое значение типа int.
4. Метод getCarsCount должен возвращать различные
значения для различных классов.
5. В классе Solution создать публичный метод
println(Bridge bridge).
6. В методе println вывести на консоль значение
getCarsCount() для объекта bridge.
7. Каждый класс и интерфейс должны быть в
 отдельных файлах.
 */
public class Solution {
    public int println(Bridge bridge){
        return bridge.getCarsCount();
    }

    public static void main(String[] args) {
        SuspensionBridge suspensionBridge = new SuspensionBridge();
        WaterBridge waterBridge = new WaterBridge();

        System.out.println(suspensionBridge.getCarsCount());
        System.out.println(waterBridge.getCarsCount());
    }
}

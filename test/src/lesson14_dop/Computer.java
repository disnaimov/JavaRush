package lesson14_dop;
/*
1. Создай интерфейс CompItem.
2. Добавь в него метод String getName().
3. Создай классы Keyboard, Mouse, Monitor,
которые реализуют интерфейс CompItem.
4. Метод getName() должен возвращать имя класса,
например, для класса Keyboard будет "Keyboard".
5. Создай класс Computer.
6. В класс Computer добавь приватное поле типа Keyboard.
7. В класс Computer добавь приватное поле типа Mouse.
8. В класс Computer добавь приватное поле типа Monitor.
9. Создай конструктор в классе Computer используя
комбинацию клавиш Alt+Insert внутри класса
(команда Constructor).
10. Параметрами конструктора выбери все три поля
(переменных) класса.
11. Создай геттеры для полей класса Computer
 (в классе используй комбинацию клавиш Alt+Insert
  и выбери команду Getter).
12. Все созданные классы и интерфейс должны быть
 в отдельных файлах.
13. Класс Solution менять нельзя.
 */
public class Computer {
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;

    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }
}

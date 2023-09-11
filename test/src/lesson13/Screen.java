package lesson13;
/*
1. Создай класс Screen.
2. Реализуй в нем интерфейсы Selectable с методом
onSelect, Updatable с методом refresh.
 */
public class Screen implements Updatable, Selectable {

    @Override
    public void onSelect() {
        System.out.println("on select");
    }

    @Override
    public void refresh() {
        System.out.println("refresh");
    }

    public static void main(String[] args) {
        Screen screen = new Screen();
        screen.onSelect();
        screen.refresh();
    }
}

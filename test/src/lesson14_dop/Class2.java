package lesson14_dop;

/*
1. Напиши реализацию метода printMainInfo, чтобы:
1.1. Если в метод передают объект типа Drawable,
 у этого объекта вызывался метод draw.
1.2. Если в метод передают объект типа Movable,
 у этого объекта вызывался метод move.
2. Метод main менять нельзя.
 */
public class Class2 {
    static void printMainInfo(Object o) {
        if (o instanceof Drawable) {
            ((Drawable) o).draw();
        } else if (o instanceof Movable) {
            ((Movable) o).move();
        }
    }

    public static void main(String[] args) {
        Drawable drawable = new Drawable() {
            @Override
            public void draw() {
                System.out.println("draw");
            }
        };

        Movable movable = new Movable() {
            @Override
            public void move() {
                System.out.println("move");
            }
        };

        printMainInfo(drawable);
        printMainInfo(movable);
    }
}

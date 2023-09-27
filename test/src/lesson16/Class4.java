package lesson16;
/*
1. Создать таск - класс public static
SpecialThread - на основании интерфейса Runnable
2. SpecialThread должен выводить в консоль
свой стек-трейс.
Подсказка: main thread уже выводит в
 консоль свой стек-трейс.
 */
public class Class4 {

    public static void main(String[] args) {
        Thread thread = new Thread(new SpecialThread());
        thread.start();

        System.out.println("||||||||||||||||||||||");

        for (StackTraceElement e: Thread.currentThread().getStackTrace()) {
            System.out.println(e);
        }
    }

    public static class SpecialThread implements Runnable{
        public void run(){
            for (StackTraceElement e: Thread.currentThread().getStackTrace()) {
                System.out.println(e);
            }
        }
    }

}

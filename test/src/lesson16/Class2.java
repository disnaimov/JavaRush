package lesson16;

/*
Создать public static class TestThread -
нить с помощью интерфейса Runnable.
TestThread должен выводить в консоль "My first thread".
 */
public class Class2 implements Runnable {

    public static class TestThread extends Thread{
        static {
            System.out.println("It's static block inside TestThread");
        }
    }


    @Override
    public void run() {
        System.out.println("My first thread");
    }

    static {
        Class2 class2 = new Class2();
        class2.run();
    }

    public static void main(String[] args) {
    }
}

package lesson16;

/*
Создать public static class TestThread -
нить с помощью интерфейса Runnable.
TestThread должен выводить в консоль "My first thread".
 */
public class Class2 {

    public static class TestThread extends Thread{
        static {
            System.out.println("It's static block inside TestThread");
        }
    }



    public static void main(String[] args) {
        TestThread thread = new TestThread();
        thread.start();
    }
}

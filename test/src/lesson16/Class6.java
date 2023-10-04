package lesson16;

public class Class6 {

    static class printStr implements Runnable{
        public void run() {
            int i = 0;
            while (i < 20){
                System.out.println("fistThread string " + i);
                i++;
            }
        }
    }

    static class printStr2 implements Runnable{
        public void run(){
            int i = 0;
            while (i < 20){
                System.out.println("secondThread string " + i);
                i++;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new printStr());
        Thread thread1 = new Thread(new printStr2());

        thread.start();
        thread.join();
        thread1.start();

    }

}

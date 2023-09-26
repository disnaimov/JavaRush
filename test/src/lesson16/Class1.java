package lesson16;

public class Class1 {

    static class Printer extends Thread implements Runnable {
        private String name;
        public Printer(String name){
            this.name = name;
        }
        @Override
        public void run() {
            System.out.println("I'm " + this.name);
        }
    }

    static {
        Printer printer = new Printer("Thread 1");
        printer.start();

        Printer printer1 = new Printer("Thread 2");
        printer1.start();
    }

    public static void main(String[] args) {

    }
}

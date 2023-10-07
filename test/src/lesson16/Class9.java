package lesson16;
/*
1. Разберитесь, что делает программа.
2. Нужно сделать так, чтобы все мыши ели одновременно.
3. Подумай, какой метод позволяет альфа-самцу мыши есть первым, и почему остальные мыши ждут.
4. Удали вызов этого метода.
 */
public class Class9 {
    public static class Mouse extends Thread {

        public Mouse(String name) {
            super(name);
            start();
        }

        private static void eating() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
        }

        public void run() {
            System.out.println(getName() + "starts eating");
            eating();
            System.out.println(getName() + "finished");
        }
    }

    public static void main(String[] args) {
        Mouse alpha = new Mouse("Alpha");
        Mouse mouse = new Mouse("Mouse1");
        Mouse mouse1 = new Mouse("Mouse2");
    }
}

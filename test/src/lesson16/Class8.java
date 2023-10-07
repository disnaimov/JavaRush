package lesson16;
/*
1. Разберитесь, что делает программа.
2. Нужно сделать так, чтобы Иванов сказал больше всего речей на политических дебатах.
3. Подумай, какой метод можно вызвать у объекта ivanov, чтобы Иванов разговаривал, пока не завершится всё свободное время.
 */
public class Class8 {

    public static int TOTAL_COUNT_SPEECHES = 200;
    public static int SOUNDS_IN_ONE_SPEECH = 1000000;

    public static class Politic extends Thread{
        private int countSound;

        public Politic(String name){
            super(name);
            this.start();
        }

        public void run(){
            while (countSound < TOTAL_COUNT_SPEECHES * SOUNDS_IN_ONE_SPEECH){
                countSound++;
            }
        }

        public int getCountSpeeches(){
            return countSound / SOUNDS_IN_ONE_SPEECH;
        }

        @Override
        public String toString() {
            return String.format("%s сказал речь %d раз", getName(), getCountSpeeches());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Politic ivanov = new Politic("Ivanov");
        ivanov.join();
        Politic petrov = new Politic("Petrov");
        Politic sidorov = new Politic("Sidorov");

        while (ivanov.getCountSpeeches() + petrov.getCountSpeeches() + sidorov.getCountSpeeches() < TOTAL_COUNT_SPEECHES){
        }

        System.out.println(ivanov.toString());
        System.out.println(petrov.toString());
        System.out.println(sidorov.toString());
    }

}

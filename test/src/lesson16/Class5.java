package lesson16;

import java.util.Date;

/*
1. Измените класс Violin так, чтоб он стал таском для нити. Используйте интерфейс MusicalInstrument
2. Реализуй необходимый метод в нити Violin. Реализация должна быть следующей:
2.1. Считай время начала игры - метод startPlaying().
2.2. Подожди 1 секунду - метод sleepNSeconds(int n), где n - количество секунд.
2.3. Считай время окончания игры - метод stopPlaying().
2.4. Выведи на консоль продолжительность игры в миллисекундах. Пример "Playing 1002 ms".

 */
public class Class5 {

    public static class Violin implements MusicalInstrument{

        private String owner;

        static int delay = 1000;

        public Violin(String owner){
            this.owner = owner;
        }

        @Override
        public Date startPlaying() {
            System.out.println(this.owner + " starts playing");
            return new Date();
        }

        @Override
        public Date stopPlaying() {
            System.out.println(this.owner + " stops playing");
            return new Date();
        }

        @Override
        public void run() {
            
        }
    }

    public static interface MusicalInstrument extends Runnable{
        Date startPlaying();

        Date stopPlaying();
    }
}

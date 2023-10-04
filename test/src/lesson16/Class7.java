package lesson16;

import java.util.ArrayList;
import java.util.List;

public class Class7 {

    static class Horse{
        private boolean isFinished;

        private String name;

        public Horse(String name, boolean isFinished){
            this.name = name;
            this.isFinished = isFinished;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isFinished() {
            return isFinished;
        }

        public void setFinished(boolean finished) {
            isFinished = finished;
        }

        public static int calculateFinished(Horse horse){
            int count = 0;

            if (horse.isFinished){
                count++;
                System.out.println(horse.getName() + " is finished");
            } else {
                System.out.println("waiting for " + horse.getName());
                for (int i = 5; i > 0; i--){
                    System.out.println("to the finish " + i);
                }
                System.out.println(horse.getName() + " is finished");
                count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Horse horse = new Horse("Patrick", true);
        Horse horse1 = new Horse("Baiman", false);
        Horse horse2 = new Horse("Rayan", true);
        Horse horse3 = new Horse("Gosling", false);

        List<Horse> horses = new ArrayList<>();
        horses.add(horse);
        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);

        int num = 0;

        for (Horse h : horses) {
            num+= Horse.calculateFinished(h);
        }

        System.out.println("\n");
        System.out.println("number of finishing horses " + num);
    }
}

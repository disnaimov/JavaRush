import javax.crypto.*;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

public class Lesson6_1 {
    public static class Util{
        private double x1;
        private double x2;
        private double y1;
        private double y2;

        public Util(double x1, double x2, double y1, double y2){
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
        }

        public static double getDistance(double x1, double x2, double y1, double y2){
            return Math.sqrt((x2 - x1)* (x2 - x1) + (y2 - y1) * (y2 - y1));
        }
    }
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, IOException {
       /* Util util = new Util(1, 2, 3, 4);
        System.out.println(util.getDistance(1, 2, 3, 4));

        System.out.println("Input string");
        System.out.println(ConsoleReader.readString());
        System.out.println("\nInput number");
        System.out.println(ConsoleReader.readInt());
        System.out.println("\nInput double number");
        System.out.println(ConsoleReader.readDouble());
        System.out.println("\nInput true or false");
        System.out.println(ConsoleReader.readBoolean());

        System.out.println(StringHelper.multiply("ass", 2));
        System.out.println(StringHelper.multiply("a"));*/

        HashMap<Integer, String> passportsAndNames = new HashMap<>();


        passportsAndNames.put(212133, "Лидия Аркадьевна Бубликова");
        passportsAndNames.put(162348, "Иван Михайлович Серебряков");
        passportsAndNames.put(8082771, "Дональд Джон Трамп");
        System.out.println(passportsAndNames);



    }
}

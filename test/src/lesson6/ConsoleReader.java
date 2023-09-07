import java.util.Scanner;

public class ConsoleReader {
    public static String readString(){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }
    public static int readInt(){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        return i;
    }
    public static double readDouble(){
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();
        return d;
    }
    public static boolean readBoolean(){
        Scanner scanner = new Scanner(System.in);
        boolean b = scanner.nextBoolean();
        return b;
    }
}

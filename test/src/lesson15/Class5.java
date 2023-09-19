package lesson15;
/*
Перегрузите метод printMatrix 8 различными способами.
В итоге должно получиться 10 различных
методов printMatrix.
 */
public class Class5 {
    public static int printMatrix(int var){
        return var;
    }

    public static String printMatrix(String var){
        return var;
    }

    public static double printMatrix(double var){
        return var;
    }

    public static float printMatrix(float var){
        return var;
    }

    public static char printMatrix(char var){
        return var;
    }

    public static boolean printMatrix(boolean var){
        return var;
    }

    public static long printMatrix(long var){
        return var;
    }

    public static short printMatrix(short var){
        return var;
    }

    public static byte printMatrix(byte var){
        return var;
    }

    public static Integer printMatrix(Integer var){
        return var;
    }

    public static void main(String[] args) {
        System.out.println(printMatrix(1));
        System.out.println(printMatrix('a'));
        System.out.println(printMatrix(9223372036854775807L));
        System.out.println(printMatrix(1.22D));
        System.out.println(printMatrix(1.11F));
        System.out.println(printMatrix(32767));
        System.out.println(printMatrix(true));
        System.out.println(printMatrix("String"));
        System.out.println(printMatrix(127));
        System.out.println(printMatrix(2));
    }
}

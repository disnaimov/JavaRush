package lesson2;
public class ManyFunctions {
    public static int minTwoNumbers (int a, int b){
        int min;

        if(a < b) {
            min = a;
        } else min = b;

        return min;
    }

    public static int maxTwoNumbers (int a, int b){
        int max;

        if(a > b) {
            max = a;
        } else max = b;

        return max;
    }

    public static int minThreeNumbers(int a, int b, int c){
        int min = 0;

        if(a < b && a < c){
            min = a;
        } else if(b < a && b < c){
            min = b;
        } else if(c < a && c < b){
            min = c;
        }
        return min;
    }

    public static int minFourNumbers(int a, int b, int c, int d){
       int min, min1, min2;

        min1 = ManyFunctions.minTwoNumbers(a, b);
        min2 = ManyFunctions.minTwoNumbers(c, d);

        if (min1 < min2){
            min = min1;
        }else min = min2;

        return min;
    }

    public static void printStr(String s) {
        int i = 0;

        while (i < 3) {
            System.out.println("\nYour string is = " + s);
            i++;
        }
    }

    public static void printTwo(String s){

        System.out.println(s + " " + s + " " + s);
        }
}

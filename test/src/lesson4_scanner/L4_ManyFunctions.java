package lesson4_scanner;
import java.util.Scanner;


public class L4_ManyFunctions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("z1");

        System.out.println("\nInput first number");
        int a = scanner.nextInt();

        System.out.println("\nInput second number");
        int b = scanner.nextInt();

        int min = 0;
        if(a > b){
            min = b;
        } else if (b > a) {
            min = a;
        }

        System.out.println("Min of your numbers is = " + min);

        System.out.println("\nz2");

        System.out.println("Input first number");
        int c = scanner.nextInt();

        System.out.println("Input second number");
        int d = scanner.nextInt();

        System.out.println("Input third number");
        int e = scanner.nextInt();

        System.out.println("Input fourth number");
        int f = scanner.nextInt();

        int max = 0;
        int[] Arr = new int[4];
        Arr[0] = c;
        Arr[1] = d;
        Arr[2] = e;
        Arr[3] = f;

       for (int i = 0; i < Arr.length-1; i++){
           if(Arr[i] > Arr[i+1]){
               max = Arr[i];
           }
           else max = Arr[i+1];
       }
        System.out.println(max);

        System.out.println("\nz3");

        System.out.println("Input first number");
        int g = scanner.nextInt();

        System.out.println("Input second number");
        int h = scanner.nextInt();

        System.out.println("Input third number");
        int k = scanner.nextInt();

        int[] Arr2 = new int[3];
        Arr2[0] = g;
        Arr2[1] = h;
        Arr2[2] = k;

        for (int i = 0; i < Arr2.length - 1; i++) {
            for (int j = i + 1; j < Arr2.length; j++){
                if(Arr2[j] > Arr2[i]){
                    int tmp = Arr2[j];
                    Arr2[j] = Arr2[i];
                    Arr2[i] = tmp;
                }
            }
        }


        for (int i = 0; i < Arr2.length; i++){
            System.out.println(Arr2[i]);
        }


        System.out.println("\nz4");

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("\nName one");
        String name1 = scanner1.nextLine();

        System.out.println("\nName two");
        String name2 = scanner1.nextLine();

        if(name1.equals(name2)){
            System.out.println("Names are equal");
        }if (name1.length() == name2.length()) {
            System.out.println("the length of the names are equals");
        }

        System.out.println("\nz5");

        System.out.println("Input name");
        String name3 = scanner1.nextLine();

        System.out.println("Input age");
        int age = scanner1.nextInt();

        if (age < 18){
            System.out.println("Подрасти еще");
        }
        if (age > 20){
            System.out.println("И 18 достаточно");
        }
    }
}
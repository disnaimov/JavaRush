import java.util.Scanner;

public class Lesson4_2 {
    public static void main(String[] args) {

        System.out.println("\nz1");
        for(int i = 1; i <= 100; i++){
            if (i % 2 == 0)
                System.out.printf("%4d", i);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nz2");

        System.out.println("\nInput first number");
        int a = scanner.nextInt();

        System.out.println("\nInput second number");
        int b = scanner.nextInt();

        int c = 8;

        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                System.out.printf("%4d", c);
            }
            System.out.println();
        }


        System.out.println("\nz3");

        String s = "8";
        for (int i = 0; i < 10; i++){
            System.out.println(s);
            s = s + 8;
        }

        System.out.println("\nZ4");

        String d = "8";
        for (int i = 0; i < 10; i++){
            d = d + 8;
        }
        System.out.println(d);

        String f = "8";
        for (int i = 0; i < 10; i++){
            System.out.println(f);
        }

        System.out.println("\nz5");


        String lol = "She loves me";
        for (int i = 0; i < 10; i++){
            System.out.println(lol);
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("input first number");
        int number1 = sc.nextInt();

        System.out.println("input second number");
        int number2 = sc.nextInt();

        System.out.println("Input third number");
        int number3 = sc.nextInt();

        int avg = 0;

        if(number1 > number2 && number3 < number2 || number1 < number2 && number3 > number2){
            System.out.println(number2);
        } else if (number1 < number2 && number1 > number3 || number1 < number3 && number1 > number2) {
            System.out.println(number1);
        }else if (number3 < number1 && number3 > number2 || number3 > number1 && number3 < number2){
            System.out.println(number3);
        }else System.out.println("Среднего числа нет");

        System.out.println("Вводите числа, программа посчитает сумму введенных чисел");
        System.out.println("\nКогда захотите перестать вводить числа и узнать их сумму введите -1");
        int num4 = 0;
        int sum = 0;
        while (num4!= -1){
            num4 = sc.nextInt();
            sum += num4;
            if(num4 == -1){
                break;
            }
        }
        System.out.println(sum);
        sc.close();

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("\nInput name");
        String name = scanner1.nextLine();

        System.out.println("Input day of born");
        int day = scanner1.nextInt();

        System.out.println("Input month of born");
        int month = scanner1.nextInt();

        System.out.println("Input year of born");
        int year = scanner1.nextInt();

        System.out.println("My name is " + name);
        System.out.println("In was born " + day + month + year);

    }
}

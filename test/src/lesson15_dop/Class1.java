package lesson15_dop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. Считать с консоли данные, пока не введено слово "exit".
2. Для каждого значения вызвать метод print. Если значение:
2.1. содержит точку '.', то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.
 */
public class Class1 {

    static double print(double var) {
        System.out.println("This is double variable");
        return var;
    }

    static short print(short var) {
        System.out.println("This is short variable");
        return var;
    }

    static int print(int var) {
        System.out.println("This is int variable");
        return var;
    }

    static String print(String var) {
        System.out.println("This is string variable");
        return var;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input your values");
        String s = "";
        while (true) {
            s = br.readLine();
            if (s.equals("exit")) break;
            try {
                if (s.contains(".")) {
                    System.out.println(print(Double.parseDouble(s)));
                } else if (Integer.parseInt(s) > 0 && Integer.parseInt(s) < 128) {

                    System.out.println(print(Short.parseShort(s)));
                } else if (Integer.parseInt(s) >=128) {
                    System.out.println(print(Integer.parseInt(s)));
                } else {
                    System.out.println(print(s));
                }

                //break;
            } catch (NumberFormatException e) {
                System.out.println(print(s));
            }

        }
        br.close();
    }
}

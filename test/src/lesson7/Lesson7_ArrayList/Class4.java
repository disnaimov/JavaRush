package Lesson7_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Class4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String line;
        for (int i = 0; i < 10; i++){
            line = scanner.nextLine();
            list.add(line);
        }
        for (String s: list) {
            System.out.println(s);
        }
    }
}

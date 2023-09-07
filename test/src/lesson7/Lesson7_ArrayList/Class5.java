package Lesson7_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Class5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String line;
        for (int i = 0; i < 5; i++){
            line = scanner.nextLine();
            list.add(line);
        }
        int count = 0;
        String str;
        while (count<13){
            str = list.get(list.size()-1);
            list.remove(list.size()-1);
            list.add(0, str);
            count++;
        }
        for (String s: list) {
            System.out.println(s);
        }
    }
}

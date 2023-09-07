package Lesson7_ArrayList;

import java.util.ArrayList;

public class Class1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("string1");
        list.add("string2");
        list.add("string3");
        list.add("string4");
        list.add("string5");
        System.out.println("size of your list is " + list.size());
        System.out.println("your list elements is");
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }

}

package lesson8_interesna_govorit;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;


public class Class1 {

    public static void insert10000(List list)
    {
        //Напишите тут ваш код
        for (int i = 0; i < 10000; i++)
        {
            list.add(i, i);

        }

    }

    public static void get10000(List list)
    {
        //Напишите тут ваш код
        for (int i = 0; i < 10000; i++)
        {
            list.get(i);
        }
    }

    public static void set10000(List list)
    {
        //Напишите тут ваш код
        for (int i = 0; i < 10000; i++)
        {
            list.set(i, "s");

        }
    }

    public static void remove10000(List list) {
        //Напишите тут ваш код
        for (int i = list.size() - 1; i >= 0; i--) {
            list.remove(i);

        }
        System.out.println(list);
    }


    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);


    }
}

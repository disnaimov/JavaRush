package lesson15_dop;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех
параметров (Параметры идут после ? и разделяются &,
например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его
значение в нужный метод alert.
alert(double value) - для чисел
(дробные числа разделяются точкой)
alert(String value) - для строк
 */
public class Class5 {
     /*static String FIRST_FILE = "http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo";
     static String SECOND_FILE = "http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo";*/


    public static void main(String[] args) {
        File file = new File("C:\\Users\\disna\\Desktop\\JavaRush\\test\\file4.txt");
        List<String> urls = new ArrayList<>();

        try {
            String st;
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((st = br.readLine()) != null){
                urls.add(st.substring(st.indexOf("?")+1));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<String> params = new ArrayList<>();


        for (String s: urls) {
            System.out.println(s.split("&"));
        }

        /*for (String s:
             params) {
            System.out.println(s);
        }*/
    }
}

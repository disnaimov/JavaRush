package lesson9_dopquests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
4. Конвертер дат

Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
 */
public class Class4 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String date = reader.readLine();

        DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        Date parseDate = format.parse(date);

        String[] str = parseDate.toString().split(" ");
        System.out.println(str[1].toUpperCase() + " " + str[2] +
                ", " + str[5]);
    }
}

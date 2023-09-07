package lesson8_dopquests;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

/*
9. Работа с датой

1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true,
 если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.

JANUARY 1 2000 = true
JANUARY 2 2020 = false
 */
public class Class8 {
    static boolean isDateOdd(String date) {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder().parseCaseInsensitive().appendPattern("MMMM d yyyy").toFormatter();
        formatter = formatter.withLocale(Locale.ENGLISH);
        //convert String to LocalDate
        LocalDate localDate = LocalDate.parse(date, formatter);
        if ((localDate.getDayOfYear() % 2) == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2016"));
        /*System.out.println(isDateOdd("JANUARY 1 2016"));
        System.out.println(isDateOdd("JANUARY 2 2016"));
        System.out.println(isDateOdd("JANUARY 3 2016"));
        System.out.println(isDateOdd("JANUARY 4 2016"));
        System.out.println(isDateOdd("JANUARY 5 2016"));*/
    }
}

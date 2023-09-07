package lesson9_dopquests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
5. Гласные и согласные буквы

Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1) первая строка содержит только гласные буквы
2) вторая - только согласные буквы и знаки препинания из введённой строки.
Символы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
 */
public class Class5 {

    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static boolean isVowels(char yourSymbol){
        Character.toLowerCase(yourSymbol);
        for (char c: vowels) {
            if (yourSymbol == c)
                return true;
        }
        return false;
    }


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        char[] arr = str.replace(" ", "").toCharArray();

        List<Character> vowels = new ArrayList<>();
        List<Character> notVowels = new ArrayList<>();

        for (char ch: arr) {
            if (isVowels(ch) == true)
            vowels.add(ch);
            else
                notVowels.add(ch);
        }

        System.out.println("\nГласные");
        for (Character c : vowels){

            System.out.print(c + " ");
        }

        System.out.println("\nСогласные и знаки препинания");
        for (Character ch: notVowels) {
            System.out.print(ch + " ");
        }
        
        //String vowels = "аоуэыяёеюи";


    }
}

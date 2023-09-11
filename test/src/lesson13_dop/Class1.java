package lesson13_dop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы.
Закрыть поток чтения с файла и поток ввода с клавиатуры.

 */
public class Class1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input file name");
        String fileName = scanner.nextLine();
        scanner.close();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();
            while (line != null){
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e){
            e.printStackTrace();
        }



    }
}

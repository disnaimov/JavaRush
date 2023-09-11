package lesson13_dop;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

/*
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь
не введет строку "exit".
3. Вывести все строки в файл, каждую строчку
с новой стороки.

 */
public class Class2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input file name");
        String fileName = scanner.nextLine();
        String s = "";
        while (!Objects.equals(s, "exit")){
            s = scanner.nextLine();
            try(FileWriter writer = new FileWriter(fileName, true)) {
                //writer.write(s);
                if (!Objects.equals(s, "exit")) {
                    writer.append(s);
                    writer.append('\n');
                }


                writer.flush();
            } catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}

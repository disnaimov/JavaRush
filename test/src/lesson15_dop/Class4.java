package lesson15_dop;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
1. Инициализируй константу Constants.FILE_NAME
полным путем к файлу с данными, который
содержит несколько строк.
2. В статическом блоке считай из файла с именем
 Constants.FILE_NAME все строки и добавь их
 по-отдельности в List lines.
3. Закрой поток ввода методом close().
 */
public class Class4 {
    public static class Constants {
        public static String FILE_NAME = "C:\\Users\\disna\\Desktop\\JavaRush\\test\\file3.txt";
    }

    static {
        List<String> lines = new ArrayList<>();

        File file = new File(Constants.FILE_NAME);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null){
                lines.add(st);
            }
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (String s: lines) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {

    }
}

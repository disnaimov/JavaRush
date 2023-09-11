package lesson13_dop;

import java.io.File;
import java.io.IOException;
import java.util.*;

/*
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные,
отсортированные по возрастанию.
 */
public class Class3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input file name");
        String fileName = scanner.nextLine();
        scanner.close();
        File file = new File(fileName);
        List<Integer> list = new ArrayList<>();

        try {
            Scanner scanner1 = new Scanner(file);
            while (scanner1.hasNextInt()){
                int number = scanner1.nextInt();
                list.add(number);
            } scanner1.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        Collections.sort(list);

        for (Integer i = 0; i < list.size(); i++){
            if (list.get(i) %2 == 0){
                System.out.println(list.get(i));
            }
        }
    }
}

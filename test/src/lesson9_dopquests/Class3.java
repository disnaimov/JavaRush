package lesson9_dopquests;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/*
3. Метод в try..catch

Вводить с клавиатуры числа. Код по чтению чисел с клавиатуры вынести в отдельный метод readData.
Обернуть все тело (весь код внутри readData, кроме объявления списка, где будут храниться числа и BufferedReader - а)
этого метода в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа,
то метод должен перехватить исключение и вывести на экран все введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода.
 */
public class Class3 {

    public static List<Integer> readData(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numList = new LinkedList<>();

        try{
            int num;
            while (true){
                num = Integer.parseInt(reader.readLine());
                numList.add(num);
            }
        } catch (Exception e){
            for (int i: numList) {
                System.out.println(i);
            }
        }
        return numList;
    }

    public static void main(String[] args) {
        readData();
    }
}

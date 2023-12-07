package lesson16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 1. Часы

1. Разберись, что делает программа.
2. Реализуйте логику метода printTikTak:
2.1. Через первые полсекунды должна выводиться в консоль фраза: Tik.
2.2. Через вторые полсекунды должна выводиться в консоль фраза: Tak.
 */
public class Class11 {

    public static void printTikTak() throws InterruptedException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try{
            String str = "";
            while (true) {
                if (str.isEmpty()) {
                    str = reader.readLine();
                System.out.println("Tik");
                Thread.sleep(500);
                System.out.println("Tak");
                
                } else if (!str.isEmpty()){
                    break;
                }
                
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        printTikTak();

    }
    
}

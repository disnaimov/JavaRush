package Lesson7_dopquests;
/*
5. Бум

Написать программу, которая ведёт обратный отсчёт с 30 до 0, и в конце выводит на экран текст «Бум!». Программа должна уменьшать число 10 раз в секунду. Для того чтобы вставить в программу задержку, воспользуйся функцией:
Thread.sleep(100); //задержка на одну десятую секунды.

Пример:
30
29
…
1
0
Бум!
 */
public class Class5 {
    public static void main(String[] args) throws InterruptedException {

    int count = 30;
    String bum = "BOOOOM!!1";

    while (count > 0){
        System.out.println(count);
        Thread.sleep(100);
        count--;
    }
        System.out.println(bum);
    }
}

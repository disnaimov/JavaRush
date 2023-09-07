package lesson9_dopquests;
/*
2. Обратный отсчёт от 10 до 0

Написать в цикле обратный отсчёт от 10 до 0. Для задержки иcпользовать Thread.sleep(100);
Обернуть вызов sleep в try..catch.
 */
public class Class2 {

    public static void main(String[] args) {


        for (int i = 10; i >= 0; i--){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }

    }

}

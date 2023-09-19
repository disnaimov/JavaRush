package lesson15;
/*
2. Метод должен возвращать тип Object и значение
"Yes" вместо true, "No" вместо false.
 */
public class Class3 {
    public static Object myBool(boolean flag){
        if (flag == true){
            return "Yes";
        } else  {
            return "No";
        }
    }

    public static void main(String[] args) {
        boolean flag1 = false;
        boolean flag2 = true;

        System.out.println(myBool(flag1));
        System.out.println(myBool(flag2));
    }
}

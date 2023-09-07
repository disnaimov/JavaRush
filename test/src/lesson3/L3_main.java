package lesson3;
import java.util.Scanner;


class Rainbow{
    String color;
}
public class L3_main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nz1");
        int avg = 1, sum = 0;
        int myArray[] = new int[10];


        System.out.println("sam massiv");

       for (int i = 0; i < myArray.length; i++){
           myArray[i] = i+1;
           System.out.println(myArray[i]);
       }


        System.out.println("\navg");

      for (int i = 0; i < myArray.length; i++){
          avg *= myArray[i];
          sum += myArray[i];
      }


       System.out.println(avg);
        System.out.println(sum);

        System.out.println("\nNext quest");
        System.out.println("\nz2");


        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i:
             arr) {
            for (int j:
                 arr) {
                System.out.printf("%4d", i*j);
            }
            System.out.println();
        }

        System.out.println("\nNext quest");
        System.out.println("\nz3");

        System.out.println("\nColors of rainbow");

        Rainbow rain1 = new Rainbow();
        Rainbow rain2 = new Rainbow();
        Rainbow rain3 = new Rainbow();
        Rainbow rain4 = new Rainbow();
        Rainbow rain5 = new Rainbow();
        Rainbow rain6 = new Rainbow();
        Rainbow rain7 = new Rainbow();

        rain1.color = "RED";
        rain2.color = "ORANGE";
        rain3.color = "YELLOW";
        rain4.color = "GREEN";
        rain5.color = "BLUE";
        rain6.color = "INDIGO";
        rain7.color = "VIOLET";

        System.out.println("\n" + rain1.color);
        System.out.println("\n" + rain2.color);
        System.out.println("\n" + rain3.color);
        System.out.println("\n" + rain4.color);
        System.out.println("\n" + rain5.color);
        System.out.println("\n" + rain6.color);
        System.out.println("\n" + rain7.color);


        System.out.println("\nNext quest");
        System.out.println("\nz4");

        System.out.println("It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"");
        System.out.println("It's Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk.1.7.0\\\\bin\\");



        System.out.println("\nNext quest");
        System.out.println("\nz5");

        String var1 = "МамаМылаРаму";
        String var2 = "МамаРамуМыла";
        String var3 = "МылаМамаРаму";
        String var4 = "МылаРамуМама";
        String var5 = "РамуМамаМыла";
        String var6 = "РамуМылаМама";

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
        System.out.println(var6);

        System.out.println("\nNext quest");
        System.out.println("\nz6");

        System.out.println("日本語");




        System.out.println("\nScanner tasks");
        System.out.println("\nz1");


        System.out.println("Name of the invader");
        String str1 = scanner.nextLine();

        System.out.println("How many years will the world be conquered");
        String str2 = scanner.nextLine();

        System.out.println(str1 + " " + "will take over the world after" + " " + str2 + " " + "years");


        System.out.println("\nz2");

        System.out.println("\nName");
        String str3 = scanner.nextLine();

        System.out.println("\nzp");
        String str4 = scanner.nextLine();

        System.out.println("\ndays");
        String str5 = scanner.nextLine();

        System.out.println(str3 + " " + "receives" + " " + str4 + " " + "after" + " " + str5 + " " + "days");

        System.out.println("\nz3");

        System.out.println("\nName of 5k man");
        String str6 = scanner.nextLine();

        System.out.println(str6 + " " + "receives 5000$ Ha-ha-ha!");

        System.out.println("\nz4");

        System.out.println("\nname1");
        String str7 = scanner.nextLine();

        System.out.println("\nname2");
        String str8 = scanner.nextLine();

        System.out.println(str7 + " " + "sponsored" + " " + str8 + " " + "и она стала известной певицей.");

        System.out.println("\nz5");

        System.out.println("\nname1");
        String  str9 = scanner.nextLine();

        System.out.println("\nname2");
        String str10 = scanner.nextLine();

        System.out.println("\nname3");
        String str11 = scanner.nextLine();

        System.out.println(str9 + " " + "+" + " " + str10 + " " + "+" + " " + str11  + " " + "is true love check =)");


     System.out.println("\nSpecial tasks");

     System.out.println("\nЖить хорошо, а хорошо жить еще лучше!");

     for (int i = 0; i < 10; i++){
      System.out.println("\nЯ не хочу учить Java, я хочу большую зарплату");
     }

     System.out.println("\nYour salary ");
     int num = scanner.nextInt();

     System.out.println("\nI will receive" + " " + num + "$" + " " + "salary in hour");

     scanner.close();
    }
}
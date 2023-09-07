package lesson2;

public class L2_main {
    public static void main(String[] args) {
        L2_cat mur = new L2_cat();
        L2_cat vas = new L2_cat();

        System.out.println("I feel so bad, want everybody death");

        mur.owner = "Jack";
        vas.owner = "Mark";

        int a = 6, b = 5, c = 4, d = 3;

        String lame = "you are lame =)";

        System.out.println("\nMin of two numbers is"+ " " + "=" + " " + ManyFunctions.minTwoNumbers(a, b));

        System.out.println("\nMax of two numbers is" + " " + "=" + " " + ManyFunctions.maxTwoNumbers(a, b));

        System.out.println("\nMin of three numbers is" + " " + "=" + " " + ManyFunctions.minThreeNumbers(a, b, c));

        System.out.println("\nMin of four numbers is" + " " + "=" + " " + ManyFunctions.minFourNumbers(a, b, c, d));

        ManyFunctions.printStr(lame);

        ManyFunctions.printTwo(lame);
    }
}
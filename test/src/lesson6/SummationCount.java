import java.util.Scanner;

public class SummationCount {

    public static int countSummations(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                dp[j] += dp[j - i];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your number");
        int n = scanner.nextInt();
        System.out.println("Number of summations for " + n + ": " + countSummations(n));
    }
}

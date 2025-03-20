
public class SubsetSum {

    static boolean isSubsetSum(int[] set, int n, int sum) {
        boolean[][] dp = new boolean[n + 1][sum + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                dp[i][j] = dp[i - 1][j];

                if (j >= set[i - 1]) {
                    dp[i][j] = dp[i][j] || dp[i - 1][j - set[i - 1]];
                }
            }
        }

        return dp[n][sum];
    }

    public static void main(String[] args) {
        int[] set = { 3, 34, 4, 12, 5, 2 };
        int sum = 9;
        int n = set.length;

        if (isSubsetSum(set, n, sum)) {
            System.out.println("sum exist");
        }
        else {
            System.out.println("not exist");
        }
    }
}


public class GreedyKnapsack {

    static int knapsack(int capacity, int[] weight, int[] profit, int n ) {
        if (n==0 || capacity==0) {
            return 0;
        }
        
        if(weight[n-1] > capacity) {
            return knapsack(capacity, weight, profit, n - 1);
        }

        else {
            return Math.max( (profit[n-1] + knapsack(capacity - weight[n-1], weight, profit, n - 1)), 
            knapsack(capacity, weight, profit, n - 1)
            );
        }
    }

    public static void main(String[] args) {
        int capacity = 50;
        int[] weight = { 10, 20, 30 };
        int[] profit = { 60, 100, 120 };
        System.out.println(knapsack(capacity, weight, profit, 3));
    }
}

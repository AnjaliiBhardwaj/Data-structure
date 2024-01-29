//0-1 knapsack
import java.util.*;

class Knapsack {
    public static int knapsackSol(int n, int weight[], int profit[], int cap, int index, int currentWeight) {
        // Base case: No items left or capacity reached
        if (index == n || currentWeight == cap) {
            return 0;
        }

        int profitExc = knapsackSol(n, weight, profit, cap, index + 1, currentWeight);

        int profitInc = 0;
        if (weight[index] <= cap - currentWeight) {
            profitInc = profit[index] + knapsackSol(n, weight, profit, cap, index + 1, currentWeight + weight[index]);
        }

        return Math.max(profitInc, profitExc);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int weight[] = new int[n];
        int profit[] = new int[n];

        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextInt();
            profit[i] = sc.nextInt();
        }

        int cap = sc.nextInt();

        int ans = knapsackSol(n, weight, profit, cap, 0, 0);
        System.out.println(ans);
    }
}

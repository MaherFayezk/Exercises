import java.lang.Math;

public class BuySellStock {
    public int maxProfit(int[] prices) {
        int currentMax = 0, maxSoFar = 0;

        for (int i = 1; i < prices.length; i++) {
            currentMax += prices[i] - prices[i-1];
            currentMax = Math.max(0, currentMax);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        return maxSoFar;
    }
}

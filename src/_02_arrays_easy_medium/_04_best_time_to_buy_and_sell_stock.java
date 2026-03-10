package _02_arrays_easy_medium;

public class _04_best_time_to_buy_and_sell_stock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int n = prices.length;

        int min = prices[0];
        int profit = 0;
        for (int index = 1; index < n; index++) {
            int currentPrice = prices[index];
            if (currentPrice < min) {
                min = currentPrice;
            } else {
                profit = Math.max(profit, currentPrice - min);
            }
        }
        System.out.println("Profit : " + profit);
    }
}

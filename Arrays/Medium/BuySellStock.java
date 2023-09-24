package DSA.Arrays.Medium;

public class BuySellStock {

  public static int maxProfit(int[] prices) {
    int maxProfit = 0, buyingPrice = prices[0];

    for (int i = 1; i < prices.length; i++) {
      if (buyingPrice < prices[i]) {
        maxProfit = Math.max(maxProfit, prices[i] - buyingPrice);
      } else {
        buyingPrice = prices[i];
      }
    }

    return maxProfit;
  }

  public static void main(String[] args) {
    int[] prices = { 7, 1, 5, 3, 6, 4 };
    System.out.println(maxProfit(prices));
  }
}

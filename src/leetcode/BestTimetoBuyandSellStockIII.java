import java.io.*;

public class BestTimetoBuyandSellStockIII {
	public int maxProfit(int[] prices) {
		int n = prices.length;
		if (n == 0)
			return 0;

		int maxprofit = 0;
		int profit = 0;
		int fmin = prices[0];
		int smax = prices[n - 1];
		int[] first = new int[n];
		int[] second = new int[n];

		for (int i = 1; i < n; i++) {
			if (fmin > prices[i])
				fmin = prices[i];
			first[i] = Math.max(first[i - 1], prices[i] - fmin);

			if (smax < prices[n - i - 1])
				smax = prices[n - i - 1];
			second[n - i - 1] = Math.max(second[n - i], smax - prices[n - i - 1]);
		}

		for (int i = 0; i < n; i++) {
			profit = first[i] + second[i];
			if (maxprofit < profit)
				maxprofit = profit;
		}
		return maxprofit;
	}
	public static void main(String []args)throws IOException{
			int []a={2,3,4,5,34,23,3,18,16,25,234,34,45};
			
			
			BestTimetoBuyandSellStockIII bs=new BestTimetoBuyandSellStockIII();
			System.out.println(bs.maxProfit((a)));
			//System.out.println(bs.maxTwo((a)));
		}
}

/* Say you have an array for which the ith element is the price of a given stock on day i.
 * Design an algorithm to find the maximum profit. You may complete at most two transactions.
 * Note:
 * You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 */
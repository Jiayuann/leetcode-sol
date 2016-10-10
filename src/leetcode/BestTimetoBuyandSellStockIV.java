
public class BestTimetoBuyandSellStockIV {

    public int maxProfit(int k, int[]prices) {
        if (prices.length==0||prices==null) return 0;
        if (k >= prices.length) return solveMaxProfit(prices);
        int []g = new int[k+1];
        int []l = new int[k+1];
        for (int i = 0;i< prices.length-1;i++) {
            int diff = prices[i + 1] - prices[i];
            for (int j = k; j >= 1; --j) {
                l[j] = Math.max(g[j-1] + Math.max(diff,0),l[j]+diff);
                g[j] = Math.max(g[j],l[j]);
            }
        }
        return g[k];
    }
    public int solveMaxProfit(int []prices) {
        int res = 0;
        for (int i = 1; i < prices.length; ++i) {
            if (prices[i] - prices[i - 1] > 0) {
                res += prices[i] - prices[i - 1];
            }
        }
        return res;
    }
	
	public static void main(String []args){
		int []a={2,3,4,5,34,23,3,18};
		BestTimetoBuyandSellStockIV b=new BestTimetoBuyandSellStockIV();
		System.out.println(b.maxProfit(2,a));
		
	}
}
/*
Say you have an array for which the ith element is the 
price of a given stock on day i.Design an algorithm to find 
the maximum profit. You may complete at most k transactions.
Note:
You may not engage in multiple transactions at the same time
 (ie, you must sell the stock before you buy again).
 */


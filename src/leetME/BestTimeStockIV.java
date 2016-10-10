public class BestTimeStockIV{
	public int maxProfit(int k,int[]prices){
		if(prices.length==0||prices==null)return 0;
		if(k>=prices.length)return solveMaxProfit(prices);
		int []a=new int[k+1];
		int []b=new int[k+1];
		/*
		局部最优 最后一天卖出的最大利润a[j](共j次交易)
		全局最优 总的最大利润b[j]
		*/
		for(int i=1;i<prices.length;i++){
			int diff=prices[i]-prices[i-1];
			for(int j=1;j<=k;j++){
				a[j]=Math.max(a[j]+Math.max(diff,0),b[j]+diff);
				b[j]=Math.max(a[j],b[j]);
			}
		}
		return b[k];
	}
	public int solveMaxProfit(int []prices){
		int sum=0;
		for(int i=1;i<prices.length;i++){
			if(prices[i]-prices[i-1]>0)
				sum+=prices[i]-prices[i-1];
		}
		return sum;
	}
	public static void main(String []args){
		BestTimeStockIV b=new BestTimeStockIV();
		int []a={2,3,4,5,34,23,3,18,88};
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
import java.util.*;
public class BestTimeStockII{
	public int maxProfit(int []prices){
		int sum=0;
		if(prices.length==0||prices==null)
			return 0;
		for(int i=1;i<prices.length;i++){
			if(prices[i]-prices[i-1]>0)
				sum+=prices[i]-prices[i-1];
		}
		return sum;
	}
	public static void main(String []args){
		int []a={2,3,4,5,34,23,3,18};
		BestTimeStockII b=new BestTimeStockII();
		System.out.println(b.maxProfit((a)));
		
	}

}
/* Say you have an array for which the ith element is the price of a given stock on day i.
 * Design an algorithm to find the maximum profit. 
 * You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). 
 * However, you may not engage in multiple transactions at the same time 
 * (ie, you must sell the stock before you buy again).
 */
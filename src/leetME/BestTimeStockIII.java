import java.util.*;
import java.io.*;
public class BestTimeStockIII{
	public int maxProfit(int []prices){
		int []maxprofit=new int[prices.length];
		maxprofit[0]=0;
		for(int i=1;i<prices.length;i++){
			for(int j=0;j<i;j++){
				maxprofit[i]=Math.max(prices[i]-prices[j],maxprofit[i]);
			}
			maxprofit[i]=Math.max(maxprofit[i],maxprofit[i-1]);
		}
		return maxprofit[prices.length-1];
	}
	
	public int maxTwo(int []prices){
		int sum=0;
		List<int[]>l=new ArrayList<int []>();
			for(int i=0;i<prices.length-1;i++){
				int []b=new int[i+1];
				int []c=new int[prices.length-i-1];
				for(int j=0;j<prices.length;j++){
					if(j<=i)b[j]=prices[j];
					else c[j-i-1]=prices[j];
				}
				int m1=maxProfit(b);
				int m2=maxProfit(c);
				sum=Math.max(m1+m2,sum);
			}
			return sum;
	}
	
		public static void main(String []args)throws IOException{
			int []a={2,3,4,5,34,23,3,18,16,25,234,34,45};
			BestTimeStockIII bs=new BestTimeStockIII();
			System.out.println(bs.maxProfit((a)));
			System.out.println(bs.maxTwo((a)));
		}
	}
/* Say you have an array for which the ith element is the price of a given stock on day i.
 * Design an algorithm to find the maximum profit. You may complete at most two transactions.
 * Note:
 * You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 */
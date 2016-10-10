/* Say you have an array for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), 
 * design an algorithm to find the maximum profit.
 */
/* min表示到目前为止的最低价格
 * profit表示当前价格减去之前出现的最低价格得到的利润
 * maxprofit[i]表示从0到i的最大利润
 */
import java.util.*;
public class BestTimeStock{
	public int maxProfit(int [] prices){
		int []maxprofit=new int[prices.length];
		maxprofit[0]=0;
		if(prices.length==1)return 0;
		for(int i=1;i<prices.length;i++){
			maxprofit[i]=prices[i]-prices[i-1];
			for(int j=i-1;j>=0;j--){
				if((prices[i]-prices[j])>maxprofit[i])
					maxprofit[i]=prices[i]-prices[j];
			}
		}
		Arrays.sort(maxprofit);
		return maxprofit[maxprofit.length-1];
	}
	public static void main(String []args){
		int []a={2,3,4,5,34,23,3,18};
		BestTimeStock b=new BestTimeStock();
		System.out.println(b.maxProfit((a)));
		
	}
}
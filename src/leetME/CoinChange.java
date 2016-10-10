import java.util.*;
public class CoinChange{
	public static int coinChange(int []coins, int amount){
		int []dp=new int[amount+1];
		dp[0]=0;
		Arrays.sort(coins);
		for(int i=1;i<=amount;i++){
			int curMin=101;
			for(int j=0;j<coins.length;j++){
				if(coins[j]<=i)
				curMin=Math.min(dp[i-coins[j]]+1,curMin);
			}  
			dp[i]=curMin;
		} 

		return dp[amount]>amount?-1:dp[amount];
	}
	public static void main(String []args){
		int  []coins={1,2,5};
		 System.out.println(coinChange(coins,23));
		
	}
}
/* You are given coins of different denominations and a total amount of money amount. 
 * Write a function to compute the fewest number of coins that you need to make up that amount. 
 * If that amount of money cannot be made up by any combination of the coins, return -1.
 * Example 1:
 * coins = [1, 2, 5], amount = 11
 * return 3 (11 = 5 + 5 + 1)
 * Example 2:
 * coins = [2], amount = 3
 * return -1.
 * Note:
 * You may assume that you have an infinite number of each kind of coin.
 */
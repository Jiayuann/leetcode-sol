public class BurstBalloons{
	public int maxCoins(int []nums){
		if(nums==null)return 0;
		int []num=new int[nums.length+2];
		int i=1;
		for(int arr:nums){
			num[i++]=arr;
		}
		num[0]=1;
		num[i]=1;
		int [][]dp=new int[i+1][i+1];
		
		return helper(num,dp,0,i);
		  
	} 

	public int helper(int []num,int [][]dp,int i,int j){
		if(i+1 >= j) return 0;
       //if(dp[i][j] > 0) return dp[i][j];	 
        int res = 0;
        for(int k = i+1; k < j; k++) {
            res = Math.max(res, num[i]*num[k]*num[j] + helper(num, dp, i, k) + helper(num, dp, k, j));
			//nums[i] and nums[j] will remain to the end
        }
        //dp[i][j] = res; 
		//nums[i] to nums[j]'s max number
        return res;
	}
	 
	public static void main(String []args){
		int []nums={3,1,5,8};
		BurstBalloons b=new BurstBalloons();
		System.out.println(b.maxCoins(nums));
		
	}
}
/*Given n balloons, indexed from 0 to n-1. Each balloon is painted with a number on it represented by array nums. You are asked to burst all the balloons. If the you burst balloon i you will get nums[left] * nums[i] * nums[right] coins. Here left and right are adjacent indices of i. After the burst, the left and right then becomes adjacent.

Find the maximum coins you can collect by bursting the balloons wisely.

Note: 
(1) You may imagine nums[-1] = nums[n] = 1. They are not real therefore you can not burst them.
(2) 0  n  500, 0 nums[i]  100
Example:

Given [3, 1, 5, 8]

Return 167
    nums = [3,1,5,8] --> [3,5,8] -->   [3,8]   -->  [8]  --> []
   coins =  3*1*5      +  3*5*8    +  1*3*8      + 1*8*1   = 167
*/

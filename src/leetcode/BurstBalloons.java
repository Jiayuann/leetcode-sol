//package leetcode;

/*Given n balloons, indexed from 0 to n-1. Each balloon is painted with a number on it represented by array nums. You are asked to burst all the balloons. If the you burst balloon i you will get nums[left] * nums[i] * nums[right] coins. Here left and right are adjacent indices of i. After the burst, the left and right then becomes adjacent.

Find the maximum coins you can collect by bursting the balloons wisely.

Note: 
(1) You may imagine nums[-1] = nums[n] = 1. They are not real therefore you can not burst them.

Example:

Given [3, 1, 5, 8]

Return 167

    nums = [3,1,5,8] --> [3,5,8] -->   [3,8]   -->  [8]  --> []
   coins =  3*1*5      +  3*5*8    +  1*3*8      + 1*8*1   = 167
*/
/*
 * dp[i][j]
 */
public class BurstBalloons{
	public static int maxCoins(int[] nums) {
		int []num=new int[nums.length+2];
		num[0]=1;
		int i=1;
		for(int cur:nums){
			num[i++]=cur;	
		}
		num[i]=1;
		
		return helper(num,0,i); 
	}
	public static int helper(int []num,int i,int j){
		int res=0;
		for(int cur=i+1;cur<j;cur++){
			res=Math.max(res,helper(num,i,cur)+ helper(num,cur,j)+num[cur]*num[i]*num[j]);
	}
		return res;
	
	}
	public static void main(String []args){
		int []nums={3,1,5,8};
		
		System.out.println(maxCoins(nums));
		
	}
}

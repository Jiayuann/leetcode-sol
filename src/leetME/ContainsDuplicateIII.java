public class ContainsDuplicateIII{
	public boolean containsDuplicateIII(int []nums,int t,int k){
		for(int i=0;i<nums.length-1;i++){
			for(int j=i+1;j<=i+k&&j<=nums.length-1;j++){
				if(Math.abs(nums[i]-nums[j]<=t)
					return true;

			}
		}
		return false;	
	}

}
/* Given an array of integers, find out whether there are two distinct indices i and j in the array 
 * such that the difference between nums[i] and nums[j] is at most t and the difference between i and j is at most k.
 */ 
import java.util.*;
public class ContainsDuplicateII{
	public static boolean containsDuplicateII(int []nums,int k){
		int length=nums.length<k?nums.length:k;
		
		for(int i=0;i<nums.length-length;i++){
			Set<Integer> set=new HashSet<Integer>();
			for(int j=i;j<i+length;j++){
				if(!set.contains(nums[j])){
					set.add(nums[j]);
				}else{
					return true;
				}	
			}	
		}
		return false;
	}
	
	public static void main(String []args){
		int []nums={2,3,4,5,3,25,45,33};
		System.out.println(containsDuplicateII(nums,4));
		
	}
}
/*
 * Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array 
 * such that nums[i] = nums[j] and the difference between i and j is at most k.
 */
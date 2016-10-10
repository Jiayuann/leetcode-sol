import java.util.*;
public class ContainsDuplicate{
	public static boolean containsDuplicate(int []nums){
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<nums.length;i++){
			if(!set.contains(nums[i]))
				set.add(nums[i]);
			else
				return false;
			
		}
		return true;
	}
	
	public static void main(String []args){
		int []nums={1,3,4,5,7,5};
		System.out.println(containsDuplicate(nums));
		
		
	}

}
/* Given an array of integers, find if the array contains any duplicates. 
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 */
/* TLE
 * 
 */
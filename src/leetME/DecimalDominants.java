import java.util.*;
public class DecimalDominants{
	public static ArrayList<Integer> decimalDominants(int []nums){
		ArrayList<Integer> res=new ArrayList<Integer>();
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++){
			if(!map.containsKey(nums[i])){
				map.put(nums[i],1);
			}else if(map.get(nums[i])<nums.length/10){
				map.put(nums[i],map.get(nums[i])+1);
			}else{
				res.add(nums[i]);
			}
			
		}
		return res;
	}
	
	public static void main(String []args){
		int []nums={2,2,23,3,34,4,3,54,34,344,18};
		for(int i:decimalDominants(nums))
			System.out.println(i);
		
		
	}
}
/*
Decimal dominants. Given an array with n keys, design an algorithm 
to find all values that occur more than n/10 times. The expected running 
time of your algorithm should be linear.
*/
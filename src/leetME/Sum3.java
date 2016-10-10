import java.util.*;
public class Sum3{
	public static ArrayList<ArrayList<Integer>> sum3(int []nums,int target){
		ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
		if(nums.length<3||nums==null)
			return res;
		Arrays.sort(nums);
		for(int i=0;i<nums.length-2;i++){
			if(i!=0&&nums[i]==nums[i-1])
				continue;
			int start=i+1,end=nums.length-1;
			while(start<end){
				int sum=nums[i]+nums[start]+nums[end];
				if(sum==0){
					ArrayList<Integer> temp=new ArrayList<Integer>();
					temp.add(nums[i]);
					temp.add(nums[start]);
					temp.add(nums[end]);
					res.add(temp);
					start++;
					end--;
					while(start<end&&nums[start]==nums[start-1])start++;
					while(start<end&&nums[end]==nums[end+1])end--;
				}else if(sum>0){
					end--;
				}else{
					start++;
				}
				
			}
		}
		return res;
	}
	public static void main(String []args){
		int []nums={-1, 0, 1, 2, -1, -4,3,34,25,2,2,2};
		System.out.println(sum3(nums,0));
	}

}
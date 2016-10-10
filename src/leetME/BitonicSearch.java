/*
Search in a bitonic array. An array is bitonic if it is comprised of an increasing sequence 
of integers followed immediately by a decreasing sequence of integers. 
Write a program that, given a bitonic array of n distinct integer values, 
determines whether a given integer is in the array.
*/

public class BitonicSearch{
	public static int bitonicSearch(int []nums,int target){
		if(nums.length==1)
			return nums[0]==target?nums[0]:-1;
		int mid=findMax(nums);
		int left=binarySearch(nums,target,0,mid-1);
		int right=binarySearchReverse(nums,target,mid,nums.length-1);
		if(left!=-1)
			return left;
		if(right!=-1)
			return right;
		
		return -1;
		
	}
	public static int binarySearch(int []nums,int target,int start,int end){
		while(start<end){
			int mid=start+(end-start)/2;
			if(nums[mid]==target)
				return mid;
			else if(nums[mid]<target)
				start=mid+1;
			else 
				end=mid-1;
			System.out.println("h1");
		}	
		return -1;
	}
	public static int binarySearchReverse(int []nums,int target,int start,int end){
		while(start<=end){
			int mid=start+(end-start)/2;
			if(nums[mid]==target)
				return mid;
			else if(nums[mid]>target)
				start=mid+1;
			else 
				end=mid-1;
			System.out.println("h2");
		}	
		return -1;
	}
	public static int findMax(int []nums){
		int start=0,end=nums.length-1;
		while(start<=end){
			if(end-start==1)
				return end;
			int mid=start+(end-start)/2;
			if(nums[mid]<nums[mid+1])
				start=mid;
			else
				end=mid;
		}
		return end;
	}
	
	public static void main(String []args){
		int []nums={1,3,4,6,9,14,22,11,7,2,-4,-9,-25,-324,-3433};
		System.out.println(bitonicSearch(nums,-9));
	
	}
}
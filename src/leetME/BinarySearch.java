import java.util.Arrays;
public class BinarySearch{
	public int binarySearch(int []nums,int target){
		int start=0,end=nums.length;
		while(start<=end){
			int mid=(start+end)/2;
			 if(nums[mid]==target)
				 return mid;
			 else if(nums[mid]>target)
				 end=mid-1;
			 else start=mid+1;	 
		}
		return -1;
	}
	public static void main(String []args){
		BinarySearch bs=new BinarySearch();
		int []nums={6,13,14,25,33,43,51,53,64,72,84};
		System.out.println(bs.binarySearch(nums,14));
	}
}
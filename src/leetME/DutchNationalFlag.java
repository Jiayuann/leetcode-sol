public class DutchNationalFlag{
	public static int []dutchNationalFlag(int []nums){
		int start=0,high=nums.length-1,mid=0;
		while(mid<=high){
			if(nums[mid]==0){
				int temp=nums[mid];
				nums[mid]=nums[start];
				nums[start]=temp;
				mid++;
				start++;
			}
			else if(nums[mid]==2){
				int temp=nums[mid];
				nums[mid]=nums[high];
				nums[high]=temp;
				high--;
			}else{
				mid++;
			}
		}
		return nums;
	}
	public static void main(String []args){
		int []nums={0,1,2,2,2,1,0,0,0,1,2,2,0};
		for(int i:dutchNationalFlag(nums))
			System.out.println(i);	
	}
}
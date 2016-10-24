public class SelectionSort{
	public int[]nums;
	public static void selectSort(int []nums){
		int temp=0;
		for(int i=0;i<nums.length-1;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[j]<nums[i]){
				temp=nums[i];
				nums[i]=nums[j];
				nums[j]=temp;	
				}
			}
		}
	
	}
	
	public static void main(String []args){
		int []nums={4,34,3,4,2,3,4,3,34,234,23,5,656,434,2533,32};
		selectSort(nums);
		for(int i:nums)
			System.out.println(i);
	}

}
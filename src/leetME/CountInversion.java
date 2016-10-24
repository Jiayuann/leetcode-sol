public class CountInversion{
	public int countInversion(int []nums,int lo,int hi){
		if(hi<=lo)
			return 0;
		int count=0,mid=lo+(hi-lo)/2;
		count+=countInversion(nums,lo,mid);
		count+=countInversion(nums,mid+1,hi);
		count+=merge(nums,lo,mid,hi);
		return count;
	}
	public int merge(int[]nums,int lo,int mid,int hi){
		int count=0,rightCount=0;
		int i=lo,j=mid+1,k=lo;
		int []newNums=new int[nums.length];
		while(i<=mid&&j<=hi){
			if(nums[i]>nums[j]){
				rightCount++;
				newNums[k++]=nums[j++];
			}else{
				count+=rightCount;
				newNums[k++]=nums[i++];
			}
		}
		while(i<=mid){
			count+=rightCount;
			newNums[k++]=nums[i++];
		}
		while(j<=hi){
			newNums[k++]=nums[j++];
		}
		for(i=lo;i<=hi;i++)
			nums[i]=newNums[i];
		
		return count;
	}
	
	public static void main(String []args){
		int []nums={5,2,5,0};
		CountInversion c=new CountInversion();
		
		System.out.println(c.countInversion(nums,0,nums.length-1));
		
	}
	
}
import java.util.*;
public class CountofSmallerNumbers{
	int []count;
	public int[] countSmaller(int []nums){
		count=new int[nums.length];
		int []indexes=new int[nums.length];
		for(int i=0;i<nums.length;i++)
			indexes[i]=i;
		mergeSort(nums,indexes,0,nums.length-1);
		for(int i:count)
			System.out.println(i);
		return count;
	}
	public void mergeSort(int[] nums,int []indexes,int start,int end){
		if(start>=end)
			return;
		int []new_indexes=new int[nums.length];
		int mid=(start+end)/2;
		int start1=start,start2=mid+1;
		mergeSort(nums,indexes,start1,mid);
		mergeSort(nums,indexes,mid+1,end);
		
		int right_count=0;
		int start3=start;
		while(start1<=mid&&start2<=end){
				if(nums[indexes[start1]]>nums[indexes[start2]]){
					right_count++;
					new_indexes[start3++]=indexes[start2++];
				}else{
					count[indexes[start1]]+=right_count;
					new_indexes[start3++]=indexes[start1++];
				}
		}
		while(start1<=mid){
				count[indexes[start1]]+=right_count;
				new_indexes[start3++]=indexes[start1++];
		}
		while(start2<=end){
				new_indexes[start3++]=indexes[start2++];
		}
		for(int i=start;i<=end;i++)
			indexes[i]=new_indexes[i];
		
	} 
	public static void main(String []args){
		int []nums={5,2,6,1};
		CountofSmallerNumbers ct=new CountofSmallerNumbers();
		ct.countSmaller(nums);
	}

}

 
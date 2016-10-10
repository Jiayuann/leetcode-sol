import java.util.Arrays;
public class MergeSort{
	public static void mergeSort(int []res,int[]nums,int start,int end){
		if(start>=end)
			return;
		int mid=(start+end)/2;
		int start1=start;
		int start2=mid+1;
		mergeSort(res,nums,start1,mid);
		mergeSort(res,nums,start2,end);
		int sort_index=start;
		while(start1<=mid&&start2<=end){
			if(nums[start1]<nums[start2])
				res[sort_index++]=nums[start1++];
			else
				res[sort_index++]=nums[start2++];
		}
		while(start1<=mid){
			res[sort_index++]=nums[start1++];
		}
		while(start2<=end){
			res[sort_index++]=nums[start2++];
		}
		for(int i=start;i<=end;i++){
			nums[i]=res[i];
			System.out.println(nums[i]);
		}
	}
	public static void main(String []args){
		int []nums={3,5,23,4,3,234,12,343,4,23,25,45,22334};
		int []res=new int[nums.length];
		mergeSort(res,nums,0,nums.length-1);
		System.out.println(Arrays.toString(res));
		
	}

}
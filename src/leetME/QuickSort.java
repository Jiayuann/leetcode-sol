public class QuickSort{
	public void quickSort(int[] nums,int lo,int hi){
		if(hi<=lo)return;
		int p=partition(nums,lo,hi);
		quickSort(nums,lo,p-1);
		quickSort(nums,p+1,hi);
	}
	
	
	public int partition(int []nums,int lo,int hi){
		int i=lo,j=hi+1;
		while(true){
			while(i<hi&&nums[++i]<nums[lo]);
			while(j>lo&&nums[--j]>nums[lo]);
			if(i>=j)break;
			int temp=nums[i];
			nums[i]=nums[j];
			nums[j]=temp;
		}
		int temp=nums[j];
		nums[j]=nums[lo];
		nums[lo]=temp;
		return j;
		
	}
	
	public void quickSort3Way(int []nums,int lo,int hi){
		if(lo>=hi)
			return;
		int i=lo,lt=lo,gt=hi;
		int v=nums[lo];
		while(i<gt){
			if(nums[i]<v){
				int temp=nums[i];
				nums[i]=nums[lt];
				nums[lt]=temp;
				i++;
				lt++;
			}else if(nums[i]>v){
				int temp=nums[i];
				nums[i]=nums[gt];
				nums[gt]=temp;
				gt--;
			}else{
				i++;
			}
		}
		quickSort3Way(nums,lo,lt-1);
		quickSort3Way(nums,lt+1,hi);
	}
	public static void main(String []args){
		QuickSort q=new QuickSort();
		int []nums={55};
		q.quickSort(nums,0,nums.length-1);
		for(int i:nums)
			System.out.println(i+"  nums");
		
		int []nums2={2,4,5,8,3};
		q.quickSort3Way(nums2,0,nums2.length-1);
		for(int i:nums2)
			System.out.println(i+" nums2");
	}

}
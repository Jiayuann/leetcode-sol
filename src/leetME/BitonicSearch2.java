public class BitonicSearch2{
	public static int bitonicSearch(int []nums,int target,int start,int end){
		if(nums.length==1)
			return nums[0]==target?nums[0]:-1;
		int res=-1;
		while(start<end){
			System.out.println("start"+start+"end"+end);
			int mid=start+(end-start)/2;
			if(nums[mid]==target)
				return mid;
			if(nums[mid]>nums[mid-1]){
					res=binarySearch(nums,target,start,mid-1);
					if(res==-1)
						return bitonicSearch(nums,target,mid+1,end);
					else 
						return res;
			}else{
					res=binarySearchReverse(nums,target,mid+1,end);
					if(res==-1)
						return bitonicSearch(nums,target,start,mid-1);
					else 
						return res;
			}
		}
		return res;
		
	}
	public static int binarySearch(int []nums,int target,int start,int end){
		while(start<=end){
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
	public static void main(String []args){
		int []nums={1,3,4,6,9,14,22,11,7,2,-4,-8,-25,-31};
		int []nums2={-8,-25,-31};
		//System.out.println(binarySearchReverse(nums2,-8,0,2));
		System.out.println(bitonicSearch(nums,-8,0,nums.length-1));
	
	}

}
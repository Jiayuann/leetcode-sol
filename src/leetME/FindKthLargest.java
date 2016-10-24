public class FindKthLargest{
	public static int kth2Array(int []a,int startA,int endA,int []b,int startB,int endB,int k){
		int m = endA-startA+1;
		int n = endB-startB+1;
		int i = (int)((double)m / (m+n) * (k-1));
		int j = (k-1) - i;
		int ai_1 = (i<=startA? Integer.MIN_VALUE:a[startA+i-1]);
		int ai = (i>=endA? Integer.MAX_VALUE:a[startA+i]);
		int bj_1 = (j<=startB? Integer.MIN_VALUE:b[startB+j-1]);
		int bj = (j>=endB? Integer.MAX_VALUE:b[startB+j]);
		if (ai>bj && bj>ai_1){
			return bj;
		}if (bj>ai && ai>bj_1){
			return ai;
		}
		int ret=0;
		if (ai>bj){
			ret= kth2Array(a, startA, i, b, j+1, endB, k-j-1);
		}else{
			ret= kth2Array(a, i+1, endA, b, startB, j, k-i-1);
		}
		return ret;
		
	}
	public static int kth1Array(int []a,int k){
		
		return 1;
		
	}
	public static void main(String []args){
		int []nums={3,2,1,5,6,4};
		System.out.println(kth1Array(nums,2));
		int []a = {40, 52, 53, 76, 91};
		int []b = {3,18,99};
		System.out.println(kth2Array(a,0,a.length-1,b,0,b.length-1,2));
		
		
		
	}


}


/*
Selection in two sorted arrays. Given two sorted arrays a[] and b[], 
of sizes n1 and n2, respectively, design an algorithm to find the kth 
largest key. The order of growth of the worst case running time of your
 algorithm should be logn, where n=n1+n2.

Version 1: n1=n2 and k=n/2
Version 2: k=n/2
Version 3: no restrictions
*/
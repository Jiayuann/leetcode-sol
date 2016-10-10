public class ContainerWithMostWater{
	public static int maxArea(int []height){
		int res=0;
		for(int i=0;i<height.length;i++){
			for(int j=0;j<i;j++){
				int area=Math.min(height[i],height[j])*(i-j);
				res=Math.max(res,area);
			}
		}
		return res;
	}
	public static int maxArea2(int []height){
		int res=0;
		int low=0,high=height.length-1;
		while(low<high){
			int area=Math.min(height[low],height[high])*(high-low);
			res=Math.max(res,area);
			if(height[low]<height[high])
				low++;    
			else
				high--;
		}
		return res;
	}
	public static void main(String []args){
		int []height={7,5,4,6,3};
		System.out.println(maxArea(height));
		System.out.println(maxArea2(height));
		
	}
}
/* Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). 
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 * Note: You may not slant the container.
 */ 
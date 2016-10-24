import java.util.*;
public class IsPermutation{
	public static boolean isPermutation(int []a,int []b){
		Arrays.sort(a);
		Arrays.sort(b);
		if(a.length==b.length){
			for(int i=0;i<a.length;i++){
				if(a[i]!=b[i])
					return false;
			}
			return true;
		}
		return false;
	}
	
	public static void main(String []agrs){
		int []a={2,5,7,34,34,1,3};
		int []b={2,7,5,3,34,16,34};
		System.out.println(isPermutation(a,b));
	}

}
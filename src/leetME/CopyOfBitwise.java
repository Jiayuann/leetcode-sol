public class CopyOfBitwise{
	public static int bitwiseAnd(int m,int n){
		int i=0;
		while(m!=n){
			m=m>>1;
			n=n>>1;
			i++;
		}
		return m<<i;
		
	}
	public static int bitwiseAnd2(int m,int n){
		int res=m;
		for(int i=m;i<=n;i++){
			res=res&i;
		}
		return res;
	}
	public static void main(String []args){
		 System.out.println(bitwiseAnd(10,13));
		 System.out.println(bitwiseAnd2(10,13));
		 
	}
	
}
/* Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive.
 * For example, given the range [5, 7], you should return 4.
 */
public class BitwiseofNumberRange{
	public static int bitwiseofNumberRange(int m,int n){
		if(getNumberofBit(n)>getNumberofBit(m))
			return 0;
		int bit=getNumberofBit(m);
		int res=0;
		while(bit-->0){
			if(m>>bit! =n>>bit){
				break;
			}else{
				res+=Math.pow(2,bit);
			}
		}  
		return res;
	}
	public static int getNumberofBit(int m){
		int res=0;
		while(m!=0){
			m=m>>1;
			res++;
		}
		return res;
	}
	
	public static void main(String []args){
		System.out.println(bitwiseofNumberRange(5,7));
		System.out.println(getNumberofBit(5));
		
	}
}
/* Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive.
 * For example, given the range [5, 7], you should return 4.
 */
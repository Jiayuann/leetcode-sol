import java.util.*;
public class CountingBits{
	public static ArrayList<Integer> coutingBits(int n){
		ArrayList<Integer> res=new ArrayList<Integer>();
		int count=0;
		for(int i=0;i<=n;i++){
			int num=i;
			while(num!=0){
				int j=num>>1;
				if(num!=j*2)
					count++;
				num=j;
			}
			res.add(count);
			System.out.println(count);
			count=0;
		}
		
		return res;
		
	}
	public static void main(String []args){
		coutingBits(100);
		
	}
	
}




/* Given a non negative integer number num. For every numbers i in the range 0,num calculate the number of 1's in their binary representation and return them as an array.
 * Example:
 * For num = 5 you should return [0,1,1,2,1,2].
 * Follow up:
 * It is very easy to come up with a solution with run time O(n*sizeof(integer)). But can you do it in linear time O(n) /possibly in a single pass?
 * Space complexity should be O(n).
 * Can you do it like a boss? Do it without using any builtin function like __builtin_popcount in c++ or in any other language.
 * Hint:
 * You should make use of what you have produced already.
 * Divide the numbers in ranges like [2-3], [4-7], [8-15] and so on. And try to generate new range from previous.
 * Or does the odd/even status of the number help you in calculating the number of 1s?
 */
 
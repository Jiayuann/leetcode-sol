public class CountandSay{
	public static String countandSay(int n){
		if(n<1)
			return null;
		if(n==1)
			return "1";
		String str=countandSay(n-1);
		StringBuffer res=new StringBuffer(); 
		int count=1;
		for(int i=1;i<str.length();i++){
			if(str.charAt(i)==str.charAt(i-1))
				count++;
			else{
				res.append(count).append(str.charAt(i-1));
				count=1;
			}
		}
		res.append(count).append(str.charAt(str.length()-1));
		return res.toString();
	}
	public static void main(String []args){
		
		System.out.println(countandSay(18));	
		System.out.println("Count and Say");	
	}
}
/* The count-and-say sequence is the sequence of integers beginning as follows:
 * 1, 11, 21, 1211, 111221, ...
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * Given an integer n, generate the nth sequence.
 * Note: The sequence of integers will be represented as a string.
 */
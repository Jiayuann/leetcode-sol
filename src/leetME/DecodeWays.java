public class DecodeWays{
	public int numDecoding(String s){
		if(s.length()==0||!isValid(s.charAt(0)))
			return 0;
		if(s.charAt(0)=='0')
			return 0;
		int []dp=new int[s.length()+1];
		dp[0]=1;
		if(isValid(s.charAt(0)))
			dp[1]=1;
		for(int i=1;i<s.length();i++){
			if(isValid(s.charAt(i))){
				if(s.charAt(i)=='0')
					dp[i+1]=0;
				else
					dp[i+1]=dp[i];
				int val=(s.charAt(i-1)-'0')*10+s.charAt(i)-'0';
				if(val>0&&val<=26)
					dp[i+1]+=dp[i-1];
			}else{
				return 0;
			}
		}
		return dp[s.length()];
	}
	public boolean isValid(char c){
		return c<='9'&&c>='0';
	}
	public static void main(String []args){
		String s="12";
		DecodeWays d=new DecodeWays();
		System.out.println(d.numDecoding(s));
		
	}

}
/*A message containing letters from A-Z is being encoded to numbers using the following mapping:
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * Given an encoded message containing digits, determine the total number of ways to decode it.
 * For example,
 * Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).
 * The number of ways decoding "12" is 2.
 */
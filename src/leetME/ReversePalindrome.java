import java.util.*;

public class ReversePalindrome{
	public int longestPalinDrome(String str){
		String tempStr="";
		if(str.length()==1)return 0;
		for(int i=0;i<str.length();i++){
				tempStr=str.substring(0,i)+str.substring(i+1,str.length());
				if(isPalindrome(tempStr))
					return 1;		
			}
			
		return longestPalinDrome(tempStr)+1;
	}
	
	public boolean isPalindrome(String str){
		boolean flag;
		for(int i=0,j=str.length()-1;i<j;i++,j--){
			if(str.charAt(i)!=str.charAt(j))
				return false;
		}
		return true;
	}
	public static void main(String []args){
		String str="googleoegoogef";
		ReversePalindrome r=new ReversePalindrome();
		System.out.println(r.longestPalinDrome(str));
	}
}

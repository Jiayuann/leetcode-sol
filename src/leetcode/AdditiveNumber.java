
/* Additive number is a positive integer whose digits can form additive sequence.
 * A valid additive sequence should contain at least three numbers. Except for the first two numbers, each subsequent number in the sequence must be the sum of the preceding two.
 * For example:
 * "112358" is an additive number because the digits can form an additive sequence: 1, 1, 2, 3, 5, 8.
 * 1 + 1 = 2, 1 + 2 = 3, 2 + 3 = 5, 3 + 5 = 8
 * "199100199" is also an additive number, the additive sequence is: 1, 99, 100, 199.
 * 1 + 99 = 100, 99 + 100 = 199
 * Note: Numbers in the additive sequence cannot have leading zeros, so sequence 1, 2, 03 or 1, 02, 3 is invalid.
 * Given a string represents an integer, write a function to determine if it's an additive number.
 * Follow up:
 * How would you handle overflow for very large input integers?
 */
public class AdditiveNumber { 
    public static boolean additiveNumber(String num) {  
        int len = num.length();  
        if(len<=1) return false;  
        for(int i=1;i<=len/2;i++) {  
            for(int j=1;Math.max(i,j)<=len-i-j;j++) {  
                if(isValid(i,j,num)) return true;  
            }  
        }  
        return false;  
    }  
    public static boolean isValid(int i, int j, String num) {  
        if(num.charAt(i) == '0' && j>1) return false;  
        if(num.charAt(0) == '0' && i>1) return false;  
        Long x1 = Long.parseLong(num.substring(0,i));  
        Long x2 = Long.parseLong(num.substring(i,i+j));  
        String sum = "";  
        for(int k=i+j; k!=num.length();k+=sum.length()) {  
            x2 = x2+ x1;  
            x1 = x2 - x1;  
            sum = x2.toString();  
            if(!num.startsWith(sum, k)) return false;  
        }  
        return true;  
    }  
	public static void main(String []args){
	Integer i=new Integer("123");
	System.out.println(additiveNumber("123"));
	}

}

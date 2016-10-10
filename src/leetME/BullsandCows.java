import java.util.*;
public class BullsandCows{
	public static String getHint(String secret,String guess){
		int bull=0;
		int cow=0;
		Map<Character,Integer>map=new HashMap<Character,Integer>();
		for(int i=0;i<secret.length();i++){
			if(!map.containsKey(secret.charAt(i))){
					map.put(secret.charAt(i),1);
				}else{
					map.put(secret.charAt(i),map.get(secret.charAt(i))+1);
				}
			if(guess.charAt(i)==secret.charAt(i)){
				bull++;
				map.put(secret.charAt(i),map.get(secret.charAt(i))-1);
			}
			
		}
		for(char c:map.keySet()){
			System.out.println(c);
		}
		for(int i=0;i<secret.length();i++){
			if(guess.charAt(i)!=secret.charAt(i)){
				if(map.containsKey(guess.charAt(i))&&map.get(guess.charAt(i))!=0){
					map.put(guess.charAt(i),map.get(guess.charAt(i))-1);
					cow++;
				}
			}
		}
		return bull+" bull"+cow+" cow";
	}
	public static void main(String []args){
		String secret="1807";
		String guess="7002";
		System.out.println(getHint(secret,guess));
		char []ch={'c','c','d'};
		String str=new String(ch);
		System.out.println(str);
	}
}
/* You are playing the following Bulls and Cows game with your friend: 
 * You write a 4-digit secret number and ask your friend to guess it, each time your friend guesses a number, you give a hint, 
 * the hint tells your friend how many digits are in the correct positions (called "bulls") and how many digits are in the wrong positions 
 * (called "cows"), your friend will use those hints to find out the secret number.
 * For example:
 * Secret number:  1807
 * Friend's guess: 7810
 * Hint: 1 bull and 3 cows. (The bull is 8, the cows are 0, 1 and 7.)
 * According to Wikipedia: "Bulls and Cows (also known as Cows and Bulls or Pigs and Bulls or Bulls and Cleots) is an old code-breaking mind 
 * or paper and pencil game for two or more players, predating the similar commercially marketed board game Mastermind. 
 * The numerical version of the game is usually played with 4 digits, but can also be played with 3 or any other number of digits."
 * Write a function to return a hint according to the secret number and friend's guess, use A to indicate the bulls and B to indicate the cows, 
 * in the above example, your function should return 1A3B.
 * You may assume that the secret number and your friend's guess only contain digits, and their lengths are always equal.
 */
 

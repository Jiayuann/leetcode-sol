import java.util.List;
import java.util.ArrayList;
import java.util.*;
public class Anagrams{
	public static ArrayList<String> anagrams(String []strs){
		ArrayList<String>result=new ArrayList<String>();
		HashMap<String,ArrayList<String>> map=new HashMap<String,ArrayList<String>>();
		for(String str:strs){
			char []chars=str.toCharArray();
			Arrays.sort(chars);
			String tempStr=new String(chars);
			if(map.containsKey(tempStr))
				map.get(tempStr).add(str);
			else{
				ArrayList<String> list=new ArrayList<String>();
				list.add(str);
				map.put(tempStr,list);
			}
			
		}
		for(String s:map.keySet()){
			for(String s1:map.get(s))
				result.add(s1);
		}
		return result;
				
	}
	
	public static void main(String []args){
		
		String [] s={"aet","ddf","adfd","eat","dfd","tea"};
		for(String str:anagrams(s))
			System.out.println(str);
	}
	
	
	
}


/* Given an array of strings, return all groups of strings that are anagrams.
 * Note: All inputs will be in lower-case.
 */
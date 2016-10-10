public class CompareVersionNumbers{
	public static int compareVersion(String v1,String v2){
		String []level1=v1.split("\\.");
		String []level2=v2.split("\\."); 
		int length=Math.max(level1.length,level2.length);
		for(int i=0;i<length;i++){
			Integer l1=i<level1.length?Integer.parseInt(level1[i]):0;
			Integer l2=i<level2.length?Integer.parseInt(level2[i]):0;
			if(l1.compareTo(l2)!=0)
				return l1.compareTo(l2);
		}
		
		return 0;
		
	}
	public static void main(String[] args){
		String s1="12.1.3.2";
		String s2="12.2.23.2";
		System.out.println(compareVersion(s1,s2));
		
	}

}
/* Compare two version numbers version1 and version1.
 * If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.
 * You may assume that the version strings are non-empty and contain only digits and the . character.
 * The . character does not represent a decimal point and is used to separate number sequences.
 * For instance, 2.5 is not "two and a half" or "half way to version three", 
 * it is the fifth second-level revision of the second first-level revision.
 * Here is an example of version numbers ordering:
 * 0.1 < 1.1 < 1.2 < 13.37
 */
import java.util.ArrayList;
public class RecursionString{
	public static ArrayList<String> recursionString(String str){
		int index=0;
		ArrayList<String> result=new ArrayList<String>();
		if(str.length()==1){
			result.add(str);index++;
			return result;
		}else{
			for(int i=0;i<str.length();i++){
				String currStr=str.substring(0, i)+str.substring(i+1);
				for(String s:recursionString(currStr)){
					result.add(str.charAt(i)+s);index++;
				}
			}
		}
		System.out.println(index);
		return result;
	}
	
	public static void main(String []args){
		System.out.println(recursionString("1234"));
	}
}
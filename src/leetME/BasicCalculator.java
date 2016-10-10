import java.util.*;
public class BasicCalculator{
	public int basicCal(String str){
		str=str.replaceAll(" ","");
		str=str.replace("(","");
		str=str.replace(")","");
		int sum=0;;
		List<String> list=new ArrayList<String>();
		String tempStr="";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!='+'&&str.charAt(i)!='-')
				tempStr+=String.valueOf(str.charAt(i));
			else{
				list.add(tempStr);
				list.add(String.valueOf(str.charAt(i)));
				tempStr="";
			}
		}
		list.add(tempStr);
		for(int j=0;j<list.size();j++){
			System.out.println(list.get(j));
			if(list.get(j).equals("+"))sum+=new Integer(list.get(j+1));
			if(list.get(j).equals("-"))sum-=new Integer(list.get(j+1));
		}
		return sum+new Integer(list.get(0));

	}
	public static void main(String []args){
		BasicCalculator b=new BasicCalculator();
		System.out.println(b.basicCal(" 2-1 + 2 "));

	
	}
}

/* Implement a basic calculator to evaluate a simple expression string.
 * The expression string may contain open ( and closing parentheses ), the plus + or minus sign -, non-negative integers and empty spaces .
 * You may assume that the given expression is always valid.
 * Some examples:
 * "1 + 1" = 2
 * " 2-1 + 2 " = 3
 * "(1+(4+5+2)-3)+(6+8)" = 23
 * Note: Do not use the eval built-in library function.
 */
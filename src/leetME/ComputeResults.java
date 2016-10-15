import java.util.*;
import java.io.*;
public class ComputeResults{
	public static int computeResults(String s){
		Stack<Integer> val=new Stack<Integer>();
		Stack<Character> operator=new Stack<Character>();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='('){
				continue;
			}
			if(s.charAt(i)<='9'&&s.charAt(i)>='0')
				val.push(new Integer(s.charAt(i)-'0'));
			if(s.charAt(i)=='*'||s.charAt(i)=='-'||s.charAt(i)=='+'||s.charAt(i)=='/')
				operator.push(s.charAt(i));
			if(s.charAt(i)==')'){
				int right=val.pop();
				int left=val.pop();
				char c=operator.pop();
				int res=compute(left,right,c);
				val.push(res);
				System.out.println(left+" "+right+" "+res);
			}	
		}
		return val.pop().intValue();
	}
	public static int compute(int left,int right,char c){
		if(c=='+')
			return left+right;
		if(c=='*')
			return left*right;
		if(c=='/')
			return left/right;
		if(c=='-')
			return left-right;
		return 0;
	}
	public static void main(String []args){
		String s="(5-7)(6-5";
		StdOut.println(computeResults(s));
		
	}

}
/*
given a string of value and operators, compute the final result.
eg:(1+((2+3))*(4*5))
return 101
*/
import java.net.*;
public class TestTencent{
	public static void main(String []args){
		String str="AkleBiCeilD";
		char []ch=str.toCharArray();
		char temp;
		for(int i=0;i<ch.length;i++){
			if(ch[i]<='Z'&&ch[i]>='A'){
				temp=ch[i];
				for(int j=i;j<ch.length-1;j++)
					ch[j]=ch[j+1];
				ch[ch.length-1]=temp;
				
			}
		}
		System.out.println(new String(ch));
	}
}
//divide upper case and lower case

/*
小Q最近遇到了一个难题：把一个字符串的大写字母放
到字符串的后面，各个字符的相对位置不变，且不能申
请额外的空间 你能帮帮小Q吗？
AkleBiCeilD

输出例子:
kleieilABCD
*/
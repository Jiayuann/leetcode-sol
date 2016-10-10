public class AddDigits{
	public static int add(int num){
		int num1;
		if(num>=0&&num<=9)
			return num;
		else{
			return add(add((num-num%10)/10)+num%10);
		}
	}
	public static void main(String []args){
		System.out.println(add(1115));
	}
}
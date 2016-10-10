import java.util.Arrays;
public class CountPrime{
	public static int countPrime(int n){
		int count=0;
		boolean []flag=new boolean[n+1];
		int s=(int)Math.sqrt(n);
		Arrays.fill(flag,true);
		for(int i=2;i<=s;i++){
			if(flag[i]==true){
				for(int j=2*i;j<=n;j+=i){ 
					flag[j]=false;
				}
			}
		}
		  
		for(int i=2;i<=n;i++)
			count=flag[i]==true?count+1:count;
		return count;
	}
	public static void main(String []args){
		System.out.println(countPrime(80000000));
	}
}
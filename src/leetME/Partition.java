public class Partition{
	public static int partition1(char []a,int lo,int hi,char pivot){
		char temp;
		int lt=lo;
		for(int i=lo;i<hi;i++){
			if(a[i]<pivot){
				temp=a[i];
				a[i]=a[lt];
				a[lt]=temp;
				lt++;
			}else if(a[i]==pivot){
				temp=a[i];
				a[i]=a[hi];
				a[hi]=temp;
			}
		}
		temp=a[hi];
		a[hi]=a[lt];
		a[lt]=temp;
		return lt;
	}
	
	public static int partition2(char []a,int lo,int hi,char pivot){
		int lt=lo,i=lo,gt=hi;
		char temp;
		while(i<=gt){
			if(a[i]<pivot){
				temp=a[i];
				a[i]=a[lt];
				a[lt]=temp;
				lt++;
				i++;
			}else if(a[i]==pivot){
				i++;
			}else if(a[i]>pivot){
				temp=a[i];
				a[i]=a[gt];
				a[gt]=temp;
				gt--;
			}
		}
		//a[lt]=pivot;
		return lt;
	}

	public static void main(String []args){
		char nuts[] = {'1', '9', '3', '6', '7', '5','@'};
        
		System.out.println(partition2(nuts,0,nuts.length-1,'6'));
		for(int i=0;i<nuts.length;i++)
			System.out.println(nuts[i]+" --");
	}
}
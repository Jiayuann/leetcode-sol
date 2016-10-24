public class NutsAndBolts{
	public void nutsAndBolts(char []nuts,char []bolts,int lo,int hi){
		if(nuts.length!=bolts.length)
			return;
		if(lo<hi){
			int pivot=partition(bolts,lo,hi,bolts[hi]);
			System.out.println(pivot);
			partition(nuts,lo,hi,bolts[pivot]);
			for(int i=0;i<nuts.length;i++)
				System.out.println(nuts[i]+" --"+bolts[i]);
			nutsAndBolts(nuts,bolts,lo,pivot-1);
			nutsAndBolts(nuts,bolts,pivot+1,hi);
		}
	}
	public static int partition(char []a,int lo,int hi,char pivot){
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
		return lt;
	}
	public static void main(String []args){
		char nuts[] = {'1', '4', '3', '6', '@', '5'};
        char bolts[] = {'3', '4', '1', '5', '6', '@'};
		NutsAndBolts n=new NutsAndBolts();
		n.nutsAndBolts(nuts,bolts,0,nuts.length-1);
		for(int i=0;i<nuts.length;i++)
			System.out.println(nuts[i]+" --"+bolts[i]);
	}
	


}
/*
Nuts and bolts. A disorganized carpenter has a mixed pile of
 n nuts and n bolts. The goal is to find the corresponding pairs 
 of nuts and bolts. Each nut fits exactly one bolt and each bolt
 fits exactly one nut. By fitting a nut and a bolt together, the 
 carpenter can see which one is bigger (but the carpenter cannot
 compare two nuts or two bolts directly). 
Design an algorithm for the problem that uses nlogn compares (probabilistically).
*/
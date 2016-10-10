public class Candy{
	public static int candy(int []ratings){
		int size=ratings.length;
		if(size==0)return -1;
		if(size==1)return 1;
		int []cans=new int[size];
		cans[0]=1;
		for(int i=0;i<size-1;i++){
			if(ratings[i]<ratings[i+1])
				cans[i+1]=cans[i]+1;
			else
				cans[i+1]=1;
			
		}
		for(int i=size-1;i>0;i--){
			if(ratings[i]<ratings[i-1]&&cans[i]>=cans[i-1])
				cans[i-1]=cans[i]+1;
		}
		int res=0;
		for(int i:cans)
			res+=i;
		return res;
	}
	public static void main(String []args){
		int []ratings={1,3,12,4,23,7,2};
		System.out.println(candy(ratings));
		
	}
}
/* There are N children standing in a line. Each child is assigned a rating 
 * You are giving candies to these children subjected to the following 
 * Each child must have at least one candy.
 * Children with a higher rating get more candies than their neighbors.
 * What is the minimum candies you must give?
 * [1,3,12,4,23,7,2]
 */
public class SocialConnectivity{
	int []id;
	int []sz;
	public SocialConnectivity(int n){
		id=new int[n];
		sz=new int[n];
		for(int i=0;i<n;i++){
			id[i]=i;
			sz[i]=1;
		}
	}
	
	public int root(int i){
		while(id[i]!=i){
			id[i]=id[id[i]];
			i=id[i];
		}
		System.out.println("root"+i);
		return i;
	}

	public int allConnected(int [][]log){
		for(int i=0;i<log.length;i++){
			int proot=root(log[i][0]);
			int qroot=root(log[i][1]);
			if(sz[qroot]>sz[proot]){
				id[proot]=qroot;
				sz[qroot]+=sz[proot];
			}else{
				id[qroot]=proot;
				sz[proot]+=sz[qroot];	
			}
			if(sz[qroot]==sz.length||sz[proot]==sz.length)
				return i;
		}
 		return -1;
		
	}
	public static void main(String []args){
		SocialConnectivity s=new SocialConnectivity(6);
		int [][]log={{1,3},{0,5},{2,4},{2,5},{3,4}};
		System.out.println(s.allConnected(log));
		
	}

}
/*

Social network connectivity. Given a social network containing n members 
and a log file containing m timestamps at which times pairs of members formed 
friendships, design an algorithm to determine the earliest time at which all 
members are connected (i.e., every member is a friend of a friend of a friend ... of a friend). 
Assume that the log file is sorted by timestamp
 and that friendship is an equivalence relation. The running time of your algorithm 
 should be mlogn or better and use extra space proportional to n.
*/
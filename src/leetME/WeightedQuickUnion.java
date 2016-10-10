public class WeightedQuickUnion{
	int []id;
	int []sz;
	int []max;
	public WeightedQuickUnion(int n){
		id=new int[n];
		sz=new int[n];
		max=new int [n];
		for(int i=0;i<n;i++){
			max[i]=i;
			id[i]=i;
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
	publ ic void delete(int p){
		if(p==id.length-1)
			return;
		union(p,p+1);
	}
	public void union(int p,int q){
		int proot=root(p);
		int qroot=root(q);
		if(sz[qroot]>sz[proot]){
			id[proot]=qroot;
			sz[qroot]+=sz[proot];
			max[qroot]=Math.max(max[proot],max[qroot]);
		}else{
			id[qroot]=proot;
			sz[proot]+=sz[qroot];
			max[proot]=Math.max(max[proot],max[qroot]);
			
		}
		
	}
	public int findMax(int p){
		int proot=root(p);
		return max[proot];
	}
	public static void main(String []args){
		WeightedQuickUnion w=new WeightedQuickUnion(6);
		w.delete(3);
		w.delete(4);
		w.delete(5);
		System.out.println(w.findMax(3));
		
	}

}
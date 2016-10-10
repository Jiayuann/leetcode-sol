public class Combinations{
	public ArrayList<ArrayList<Integer>> combinations(int n,int k){
		ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list=new ArrayList<Integer>();
		helper(n,k,1,res,list);
		return res;
	}
	public void helper(int n,int k,int start,ArrayList<ArrayList<Integer>> res,ArrayList<Integer> list){
		if(list.size()==k){
			res.add(new ArrayList<Integer>(list));
			return
		}
		for(int i=start;i<=n;i++){
			list.add(i);		
			helper(n,k,i+1,res,list);		
			list.remove(list.size()-1);		//将加入的丢掉。保持list中元素个数稳定
		}
		   
	}
	public static void main(String[]args){
		
		
	}
}
/* Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
 * For example,
 * If n = 4 and k = 2, a solution is:
 * [
 *   [2,4],
 *   [3,4],
 *   [2,3],
 *   [1,2],
 *   [1,3],
 *   [1,4],
 * ]
 */
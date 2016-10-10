import java.util.*; 
import java.util.Arrays;
import java.util.ArrayList;
public class CombinationsSum{
	public ArrayList<ArrayList<Integer>> combinationsSum(int []candidates, int target){
		ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list=new ArrayList<Integer>();
		Arrays.sort(candidates);
		helper(0,res,list,candidates,target);
		return res;
	}
	public void helper(int start,ArrayList<ArrayList<Integer>> res,ArrayList<Integer> list,int []candidates,int target){
		if(target<0)return;
		if(target==0){
			res.add(new ArrayList<Integer>(list));
			return;
		}
		for(int i=start;i<candidates.length;i++){
			list.add(candidates[i]);
			helper(i,res,list,candidates,target-candidate[i]);
			list.remove(list.size-1);
		}	
	} 
}
/* Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C 
 * where the candidate numbers sums to T.
 * The same repeated number may be chosen from C unlimited number of times.
 * Note: 
 * 1.All numbers (including target) will be positive integers.
 * 2.Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
 * 3.The solution set must not contain duplicate combinations.
 * For example, given candidate set 2,3,6,7 and target 7, 
 * A solution set is: 
 * [7] 
 * [2, 2, 3] 
 */
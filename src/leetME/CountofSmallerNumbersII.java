import java.util.ArrayList;
import java.util.Collections;
public class CountofSmallerNumbersII{
	public class TreeNode{
		int val;
		int num;
		TreeNode lchild;
		TreeNode rchild;
		public TreeNode(int val){
			this.val=val;
			this.num=0;
		}	
	} 
	public ArrayList<Integer> countSmaller(int []nums){
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(0);
		TreeNode root=new TreeNode(nums[nums.length-1]);
		root.num=1;
		for(int i=nums.length-2;i>=0;i--){
			list.add(getIndex(root,nums[i],0));
		}
		Collections.reverse(list);
		for(Integer i:list){
			System.out.println(i);
		}
		return list;
	}
	
	public int getIndex(TreeNode root,int val,int num){
		if(root.val>=val){
			root.num+=1;
			if(root.lchild==null){
				TreeNode node=new TreeNode(val);
				node.num=1;
				root.lchild=node;
				return num;
			}else{
				return getIndex(root.lchild,val,num);
			}	
		}else{
			num+=root.num;
			if(root.rchild==null){
				TreeNode node=new TreeNode(val);
				node.num=1;
				root.rchild=node;
				return num;
			}else{
				return getIndex(root.rchild,val,num);
			}
		}
	}
	public static void main(String []args){
		int []nums={5,2,6,1};
		CountofSmallerNumbersII cs=new CountofSmallerNumbersII();
		cs.countSmaller(nums);
	}
}
import java.util.*;
public class BSTSort{
	public class TreeNode{
		int val;
		TreeNode rchild;
		TreeNode lchild;
		public TreeNode(int val){
			this.val=val;
			this.rchild=null;
			this.lchild=null;
		}
	}
	public ArrayList<Integer> bstSort(int []nums){
		TreeNode root=new TreeNode(nums[0]);
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=1;i<nums.length;i++){
			createBST(root,nums[i]);
		}
		TreeNode node=root;
		Stack<TreeNode> stack=new Stack<TreeNode>();
		while(!stack.isEmpty()||node!=null){
			while(node!=null){
				stack.push(node);
				node=node.lchild;
			}
			node=stack.pop();
			list.add(node.val);
			node=node.rchild;
		}
		for(int i:list)
			System.out.println(i);
		return list;
	}
	public void createBST(TreeNode root,int i){
		if(root.val>=i){
			if(root.lchild==null){
				TreeNode node=new TreeNode(i);
				root.lchild=node;
			}else{
				createBST(root.lchild,i);
			}
		}else{
			if(root.rchild==null){
				TreeNode node=new TreeNode(i);
				root.rchild=node;
			}else{
				createBST(root.rchild,i);
			}
		}
	}
	public static void main(String []args){
		int []nums={12,34,23,4,3,2,434};
		BSTSort bs=new BSTSort();
		bs.bstSort(nums);
		
	}

}
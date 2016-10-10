import java.util.*;
public class BinaryLevelOrder{
	public static class TreeNode{
		int val;
		TreeNode lchild;
		TreeNode rchild;
		public TreeNode(){
			this.val=0;
			this.lchild=null;
			this.rchild=null;
		}
		public TreeNode(int val){
			this();
			this.val=val;
		}
	}
	
	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root){
		ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
		ArrayList<TreeNode> r=new ArrayList<TreeNode>();
		r.add(root);
		while(true){
			if(r.isEmpty())
				break;
			ArrayList<TreeNode> nextLayer=new ArrayList<TreeNode>();
			ArrayList<Integer> n=new ArrayList<Integer>();
			for(TreeNode t:r){
				n.add(t.val);
				if(t.lchild!=null)
					nextLayer.add(t.lchild);
				if(t.rchild!=null)
					nextLayer.add(t.rchild);
			}
			res.add(n);
			r=nextLayer;
		}
		return res;
		
	}
	
    public static void main(String argv[]){ 
         TreeNode r1=new TreeNode
    }

}

/* Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 * For example:
 * Given binary tree {3,9,20,#,#,15,7},
 *     3
 *    / \
 *   9  20
 *  /  \
 * 15   7
 * return its level order traversal as:
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 */
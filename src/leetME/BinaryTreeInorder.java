import java.util.*;
public class BinaryTreeInorder{
	public static class TreeNode{
		private int val;
		TreeNode lchild;
		TreeNode rchild;
		
		public TreeNode(int val,TreeNode lchild, TreeNode rchild){
			this.val=val;
			this.lchild=lchild;
			this.rchild=rchild;
		}
		public int getVal(){
			return val;
		}
	}
	public ArrayList<Integer> inorderTraversal(TreeNode root){
		ArrayList<Integer> list=new ArrayList<Integer>();
		Stack<TreeNode> s=new Stack<TreeNode>();
		while(root!=null&&!s.isEmpty()){
			s.push(root);
			root=root.lchild;
		}
		TreeNode temp=s.pop();
		list.add(temp.val);
		temp=temp.rchild;
	}
	public static void main(String []args){
		
	}
}

/* Given a binary tree, return the in-order traversal of its nodes' values.
 * For example:
 * Given binary tree {1,#,2,3},
 *    1
 *      \
 *        2
 *      /
 *    3
 * return [1,3,2].
 * Note: Recursive solution is trivial, could you do it iteratively?
 * OJ's Binary Tree Serialization:
 * The serialization of a binary tree follows a level order traversal, where '#' signifies a path terminator
 * where no node exists below.
 * Here's an example:
 *   1
 *  / \
 * 2   3
 *    /
 *   4
 *    \
 *     5
 * The above binary tree is serialized as "{1,2,3,#,#,4,#,#,5}".
 */
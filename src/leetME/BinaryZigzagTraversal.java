import java.util.*;
public class BinaryZigzagTraversal{
	public ArrayList<ArrayList<Integer>> binaryZiazagTraversal(TreeNode root){
		ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> curLayer=new ArrayList<Integer>();
		TreeNode node=root;
		if(root==null)
			return res;
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		queue.add(node);
		queue.add(null);
		boolean flag=true;
		while(!queue.isEmpty()){
			node=queue.poll();
			if(node!=null){
				curLayer.add(node.key);
				if(node.lchild!=null)queue.add(node.lchild);
				if(node.rchild!=null)queue.add(node.rchild);	
			}else{
				if(queue.isEmpty())
					break;
				flag=!flag;
				queue.add(null);
				if(flag)
					Collections.reverse(curLayer);
				res.add(curLayer);
				curLayer=new ArrayList<Integer>();	
			}
		}
		return res;
	}
}
/* Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).
 * For example:
 * Given binary tree {3,9,20,#,#,15,7},
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its zigzag level order traversal as:
 * [
 *   [3],
 *   [20,9],
 *   [15,7]
 * ]
 */
import java.util.*;
public class BinaryLevelOrderII{
	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root){
		ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		TreeNode node=root;
		if(root==null)return res;
		ArrayList<Integer> currLayer=new ArrayList<Integer>();
		queue.add(root);
		currLayer.add(root.val);
		res.add(currLayer);
		while(!isEmpty(queue)){
			TreeNode node=queue.poll();
			if(node!=null){
				currLayer.add(node.val);
				if(node.lchild!=null)
					queue.add(node.lchild);
				if(node.rchild!=null)
					queue.add(node.rchild);
			}else{
				if(queue.isEmpty())break;
				res.add(currLayer);
				currLayer=new ArrayList<Integer>();
				queue.add(null);
			}	
		}
		return res;
		
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
/* Using null to seperate each layer
 * 
 */
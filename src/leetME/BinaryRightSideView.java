import java.util.*;
public class BinaryRightSideView{
	public static class TreeNode{
		public int key;
		TreeNode lchild;
		TreeNode rchild;
		public TreeNode(int key){
			this.key=key;
			this.lchild=null;
			this.rchild=null;
		}
		public TreeNode(int key, TreeNode leftChild, TreeNode rightChild) {
			this.key=key;
            this.lchild = leftChild;
            this.rchild = rightChild;
        } 
		public int getKey(){
			return key;
		} 
	}
	public static  ArrayList<Integer> binaryRightSideView(TreeNode root){
		ArrayList<Integer> list=new ArrayList<Integer> ();
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		queue.add(root);
		queue.add(null);
		int cur=0;
		while(!queue.isEmpty()){
			TreeNode node=queue.poll();
			if(node!=null){
				cur=node.key;
				if(node.lchild!=null)queue.add(node.lchild);
				if(node.rchild!=null)queue.add(node.rchild);
			}else{
				list.add(cur);
				if(queue.isEmpty())
					break;
				queue.add(null);
				
			}
			
		}
		return list;
	}
	
	public static void main(String []args){
		Stack s=new Stack();
		TreeNode t2=new TreeNode(2);
		TreeNode t3=new TreeNode(3);
		TreeNode t1=new TreeNode(1,t2,t3);
		TreeNode t4=new TreeNode(5);
		t2.rchild=t4; 
		ArrayList<Integer> l=new ArrayList<Integer>();
		l=binaryRightSideView(t1);
		for(Integer i:l){
			System.out.println(i);
		}
		
		
	
	}
}
/* Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
 * For example:
 * Given the following binary tree,
 *    1            <---
 *  /   \
 * 2     3         <---
 *  \     \
 *   5     4       <---
 * You should return [1, 3, 4].
 */
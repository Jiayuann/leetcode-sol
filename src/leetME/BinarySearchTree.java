import java.util.*;
public class BinarySearchTree implements Iterator{
	Stack<TreeNode> stack=new Stack<TreeNode>();
	
	public static class TreeNode{
		private int key;
		TreeNode lchild;
		TreeNode rchild;
		TreeNode parent;
		public TreeNode(int key, TreeNode leftChild, TreeNode rightChild, TreeNode parent) {
            this.key = key;
            this.lchild = leftChild;
            this.rchild = rightChild;
            this.parent = parent;
        } 
		public int getKey(){
			return key;
		}
	}
	
	
	public BinarySearchTree(TreeNode root){
		pushAll(root);
	}
	
	public void pushAll(TreeNode root){
		while(root!=null){
			stack.push(root);
			root=root.lchild;
		}
		/*root变成最小的number 次小的push进stack里
		*/
	}
	public Integer next(){
		TreeNode temp=stack.pop();
		temp=temp.rchild;
		pushAll(temp);
		return temp.key;
	}
	
	public boolean hasNext() {
		return !stack.isEmpty();
	}
	public static void main(String []args){
		
	}
}

/* Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.
 * Calling next() will return the next smallest number in the BST.
 * Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.
 */
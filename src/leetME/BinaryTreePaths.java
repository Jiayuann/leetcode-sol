import java.util.*;
public class BinaryTreePaths{
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
	
	public static ArrayList<ArrayList<Integer>> binaryTreePaths(TreeNode root){
		 ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
		 
		 if(root==null)return res;
		 if(root.lchild!=null){
			for(ArrayList<Integer> tempL:binaryTreePaths(root.lchild)){
				tempL.add(root.key);
				res.add(tempL);
			}
		 }
		 if(root.rchild!=null){
			for(ArrayList<Integer> tempR:binaryTreePaths(root.rchild)){
				tempR.add(root.key);
				res.add(tempR);
			}
		 }
		 if(root.lchild==null&&root.rchild==null){
				ArrayList<Integer> temp=new ArrayList<Integer>();
				temp.add(root.key);
				res.add(temp);
		 }
		 
		 return res;
	 }
	 
	 public static void main(String []args){ 
		 TreeNode t2=new TreeNode(2);
		 TreeNode t3=new TreeNode(3);
		 TreeNode t1=new TreeNode(1,t2,t3);
		
		 TreeNode t4=new TreeNode(5);
		 t2.rchild=t4; 
		 for(ArrayList<Integer> temp:binaryTreePaths(t1)){
			 System.out.println();
			 for(Integer i:temp){
				 System.out.print(i+" ");
			 }
	 }
}
}
/*
 * Given a binary tree, return all root-to-leaf paths.
 * For example, given the following binary tree:
 *
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 * All root-to-leaf paths are:
 * ["1->2->5", "1->3"]
 */

/*
public BinarySearchTreeIterator implements Iterator{
	Stack<TreeNode> stack=new Stack();
	public BinarySearchTreeIterator(TreeNode root){
		pushAll(root);
	}
	public boolean hasNext(){
		return !stack.isEmpty();
	}
	public Integer next(){
		TreeNode temp=stack.pop();
		pushAll(temp.rchild);
		return temp.val;
	}
	public void pushAll(TreeNode root){
		while(root!=null){
			stack.push(root);
			root=root.lchild;
		}
		
	}
	
}
*/
























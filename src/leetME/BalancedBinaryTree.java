public class BalancedBinaryTree{
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
	public boolean isBalanced(TreeNode root){
		if(root==null)return true;
		boolean left=isBalanced(root.lchild);
		boolean right=isBalanced(root.rchild);
		if(left&&right&&Math.abs(getHeight(root.lchild)-getHeight(root.rchild))<=1)
			return true;
		else 
			return false;
	}
	public int getHeight(TreeNode root){
		if(root==null)return 0;
		else
			return Math.max(getHeight(root.lchild),getHeight(root.rchild))+1;
	}
	public static void main(String []args){
		TreeNode t1=new TreeNode();
		TreeNode t2=new TreeNode();
		TreeNode t3=new TreeNode();
		TreeNode t4=new TreeNode();
		t1.lchild=t2;
		t2.lchild=t3;t1.rchild=t4;
		
		BalancedBinaryTree b=new BalancedBinaryTree();
		System.out.println(b.isBalanced(t1));
	}
}

/* Given a binary tree, determine if it is height-balanced.
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees 
 * of every node never differ by more than 1.
 */
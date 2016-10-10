public class ClosestBinarySearchTreeValue{
	public TreeNode closestBinarySearchTreeValue(TreeNode node,int target){
		int min=Integer.MAX_VALUE;
		TreeNode res=node;
		helper(res,node,min,target);
		return res;
		
	}
	
	public void helper(TreeNode res,TreeNode node, int min, int target){
		if(node==null)
			return;
		if(Math.abs(node.key-target)<min){
			min=Math.abs(node.key-target);
			res=node;
		}
		if(node.key-target<0)
			helper(res,node.rchild,min,target);
		else if(node.key-target>0)
			helper(res,node.lchild,min,target); 
	}
	public static void main(String []args){
		int x=Integer.MAX_VALUE;
		System.out.println(x%12);
		
	}
}
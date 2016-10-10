public class ConvertSortedArrayBST{
	public TreeNode convertSortedArrayBST(int []num){
		if(num.length==0)
			return null;
		return helper(num,0,num.length-1);
		
	}
	
	public TreeNode helper(int []num,int i,int j){
		if(i>j)
			return null;
		int index=(i+j)/2;
		TreeNode root=new TreeNode(num[index]);
		root.lchild=helper(num,i,index-1);
		root.rchild=helper(num,index+1,j);
		return root;
		
	}

}
public class ConstructBinaryPreorderandInorder{
	public TreeNode construct(int []preorder,int []inorder){
		if(preorder.length==0&&inorder.length==0)
			return null;
		int index=0;
		for(int i=0;i<preorder.length;i++){
			if(inorder[i]==preorder[0])
				index=i;
		}
		TreeNode root=new TreeNode(preorder[0]); 
		int []preorder1=Arrays.copyOfRange(preorder,1,index+1);
		int []preorder2=Arrays.copyOfRange(preorder,index+1,preorder.length);
		int []inorder1=Arrays.copyOfRange(inorder,0,index);
		int []inorder2=Arrays.copyOfRange(inorder,0,index);
		root.lchild=construct(preorder1,inorder1);
		root.rchild=construct(preorder2,inorder2);
		return root;
	}

}
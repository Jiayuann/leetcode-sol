public class ConstructBinaryTreeInorderandPostorder{
	public TreeNode construct(int []inorder,int []postorder){
		if(inorder.length==0&&postorder.length==0)
			return null;
		int index;			
		for(int i=0;i<inorder.length;i++){
			if(inorder[i]==postorder[postorder.length-1]){
				index=i; 
			}
		}
		TreeNode root=new TreeNode(postorder[postorder.length-1]); 
		int []inorder1=Arrays.copyOfRange(inorder,0,index);
		int []inorder2=Arrays.copyOfRange(inorder,index+1,inorder.length);
		int []postorder1=Arrays.copyOfRange(postorder,0,index);
		int []postorder2=Arrays.copyOfRange(postorder,index+1,postorder.length);
		root.lchild=construct(inorder1,postorder1);
		root.rchild=construct(inorder2,postorder2);
		return root;
	}
	public static void main(String []args){
		int x;
	
	}
	
}


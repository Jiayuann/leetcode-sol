import java.util.*;
public class ConvertSortedArrayBST{
	public TreeNode convertSortedArrayBST(int []num){
		if(num.length==0)
			return null;
		int index=(num.length-1)/2;
		TreeNode root=new TreeNode(num[index]);
		int left1=Arrays.copyOfRange(num,0,index);
		int right1=Arrays.copyOfRange(num,index+1,num.length);
		root.lchild=convertSortedArrayBST(left1);
		root.rchild=convertSortedArrayBST(right1);
		return root;
		
	}
	
	
}
/* Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 */
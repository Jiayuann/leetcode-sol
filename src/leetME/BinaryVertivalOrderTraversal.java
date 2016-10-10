import java.util.*;
public class BinaryVerticalOrderTraversal{
	public ArrayList<ArrayList<Integer>> binaryVerticalOrderTraversal(TreeNode root){
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		if(root==null)
			return list;
		int leftlen=0;
		while(root!=null){
			root=root.lchild;
			leftlen++;
		}
		helper(root,list,0,leftlen);
		return list;
	}
	
	public void helper(TreeNode root,ArrayList<ArrayList<Integer>> list, int index, int leftlen){
		if(root==null)
			return;
		if(list.get(index+leftlen)!=null){
			list.get(index+leftlen).add(root.key);
		}else{
			list.add(new ArrayList<Integer>(root.key));
		}
		helper(root.lchild,list,index-1,leftlen);
		helper(root.rchild,list,index+1,leftlen);
	}	
	
	
}
/* Given a binary tree, print it vertically. The following example illustrates vertical order traversal.

           1
        /    \
       2      3
      / \    / \ 
     4   5  6   7
             \   \
              8   9

The output of print this tree vertically will be:
4
2
1 5 6
3 8
7
9
 这里垂直访问的意思是，每一列给它一个列号，左孩子比父节点的列号减1，右孩子比父节点的加1.列号相同的打印在同一行。
 */
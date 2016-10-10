import java.util.*;
public class BinaryTreeTraversal{
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
	}									//TreeNode�Ķ������
	
	public static ArrayList<Integer> postorderTraversal(TreeNode root){
		ArrayList<Integer> list=new ArrayList<Integer>();
		Stack<TreeNode> stack=new Stack<TreeNode>();
		TreeNode node=root;
		int []flag=new int[1024];
		
		while(node!=null){
			stack.push(node);
			node=node.lchild;
			flag[stack.size()]=0;
		}
		while(!stack.isEmpty()){
			node=stack.peek();			//�鿴ջ�������Ƴ�
			while(flag[stack.size()]==0&&node.rchild!=null){
				node=node.rchild;
				flag[stack.size()]=1;    //�Ѿ����� ����־��Ϊ1
				while(node!=null){			
					stack.push(node);
					node=node.lchild;
					flag[stack.size()]=0;
				}
				node=stack.peek();
				
			}
			node=stack.pop();			//ͬһ���̣���pop����list.add()
			list.add(node.key);
		}
		return list;
		
	}

	public static ArrayList<Integer> inorderTraversal(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (root == null)
			return list;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode node = root;
		while (!stack.isEmpty() || node != null) {
			while (node != null) {
				stack.push(node);
				node = node.lchild;		//���󵽵�  
			}
			node = stack.pop();
			list.add(node.key);
			node = node.rchild;
		}
		return list;
	}
	
	public static ArrayList<Integer> preorderTraversal(TreeNode root){
		ArrayList<Integer> list=new ArrayList<Integer>();
		TreeNode node=root;
		Stack<TreeNode> stack=new Stack<TreeNode>();
		stack.push(node);
		while(!stack.isEmpty()){
			node=stack.pop();
			list.add(node.key);		
			if(node.rchild!=null)			//�ȷ�������
				stack.push(node.rchild);
			if(node.lchild!=null)
				stack.push(node.lchild);	
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
		l=postorderTraversal(t1);
		for(Integer i:l){
			System.out.print(i.intValue()+" ");
		}
		l=inorderTraversal(t1);
		for(Integer i:l){
			System.out.print(i.intValue()+" ");
		}
		l=preorderTraversal(t1);
		for(Integer i:l){
			System.out.print(i.intValue()+" ");
		}
	}
	
}

/* Given a binary tree, return the postorder traversal of its nodes' values.
 * For example:
 * Given binary tree {1,#,2,3},
 * 1
 *   \
 *     2
 *   /
 * 3
 * return [3,2,1].
 * Note: Recursive solution is trivial, could you do it iteratively?
 */
/* 1.ά��һ��ջ stack����ǰ�ڵ� n ��һ��������� flag�������ڵ����������ϵ����нڵ�ѹ�� stack �У���������������Ϊֵ��Ϊ 0.
 * 2.����ǰ�ڵ㸳ֵΪջ���Ľڵ㡣����ڵ����Ҷ��ӣ���û�б��������ͨ����������ж��������������ĸ��ڵ㼰�������ȫ��ѹ��ջ�С�
 * 3.����ǰ�ڵ㸳ֵΪջ���Ľڵ㣬�������������ýڵ��ջ�� pop ����
 * 4.ѭ�� 2��3 ������ֱ��ջΪ�ա�
 * �ڷǵݹ鷽������ջģ��������ջ�������������������ģ��ݹ鷽��������״̬������ά����ջ�ܼ�¼�ڵ㣬���޷���¼����δ���ýڵ㡣
 * ����ʹ����һ��flag��������¼�ڵ���������Ƿ񱻷��ʹ�����ÿ���ڵ���з��ʵ�ʱ�򣬶���֤�Ѿ�����������������
 *��ͨ����ѹ����߶�����Ϊ���ߣ�����ջ�е�ÿ���ڵ�ʱ����ѹ���ұ߶�����ʵ�֣���
      1
 *  /   \
 * 2     3
 *  \
 *   5
 */
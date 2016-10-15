import java.util.*;
public class StackQueue{
	Stack<Node> out=new Stack<Node>();
	Stack<Node> in=new Stack<Node>();
	public static class Node{
		String item;
		Node next;
		public Node(String item){
			this.item=item;
			this.next=null;
		}
	}
	
	public Node dequeue(){
		if(out.isEmpty()){
			while(!in.isEmpty()){
				out.push(in.pop());
			}
		}
		return out.pop();
	}
	public void enqueue(Node node){
		in.push(node);
	}
	public static void main(String []args){
		StackQueue sq=new StackQueue();
		sq.enqueue(new Node("a"));
		sq.enqueue(new Node("b"));
		sq.enqueue(new Node("h"));
		sq.enqueue(new Node("o"));
		System.out.println(sq.dequeue().item);
	}
}
	

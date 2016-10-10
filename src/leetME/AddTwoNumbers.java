import java.util.List;
import java.util.ArrayList;
public class AddTwoNumbers{
	public static class ListNode{
		ListNode next;
		int val;
		public ListNode(){
			this.next=null;
			this.val=0;
		}
		public ListNode(int val){
			this();
			this.val=val;
		}
	}
	
	public ListNode AddTwoNumbers(ListNode l1,ListNode l2){
		int ans=getNum(l1)+getNum(l2);
		ListNode head=new ListNode(0);
		ListNode l3=head;
		while(ans>0){
			int digit=ans%10;
			l3.next=new ListNode(digit);
			l3=l3.next;
			ans=(ans-ans%10)/10;
		}
		
		return head.next;
	}
	public int getNum(ListNode l1){
		int num=0;
		int pow=0;
		while(l1!=null){
			num+=l1.val*Math.pow(10,pow++);
			l1=l1.next;	
		}
		return num;
	}

		
	
	public static void main(String []args){
		ListNode l1=new ListNode(2);
		l1.next=new ListNode(4);
		l1.next.next=new ListNode(3);
		
		ListNode l2=new ListNode(5);
		l2.next=new ListNode(6);
		l2.next.next=new ListNode(4);
		
		AddTwoNumbers a=new AddTwoNumbers();
		System.out.println(a.AddTwoNumbers(l1,l2).next.next.val);
		
	}
}
	
/* You are given two linked lists representing two non-negative numbers. 
 * The digits are stored in reverse order and each of their nodes contain 
 * a single digit. Add the two numbers and return it as a linked list.
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */
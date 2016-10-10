public class CopyListwithRandomPointer{
	public RandomListNode copyRandomList(RandomListNode head){
		if(head==null)
			return null;
		//copy next
		RandomListNode p=head;
		while(p!=null){
			RandomListNode copy=new RandomListNode(p.value);
			RandomListNode q=p.next;
			p.next=copy;
			copy.next=q;
			p=q;
		}
		//copy random
		RandomListNode p=head;
		while(p!=null){
			RandomListNode copy=p.next;
			if(p.random==null)
				copy.random=null;
			else{
				copy.random=p.random.next;	
			}
			p=p.next.next;
		}
		//separate them
		RandomListNode copy=head.next;
		RandomListNode p=head;
		while(p!=null){
			RandomListNode q=p.next;
			p.next=q.next;
			if(q.next.next!=null){
				q.next=q.next.next;
			}else{
				q.next=null;
			}
			p=q.next;
		}
		return copy;
	}
	public static void main(String []args){
		RandomListNode r1=new RandomshListNode(12);

	}
	public static class RandomListNode{
		RandomListNode next;
		RandomListNode random;
		int value;
		public RandomListNode(){
			this.next=null;
			this.random=null;
			this.value=0;
		}
		public RandomListNode(int value){
			this.next=null;
			this.random=null;
			this.value=value;
		}
	}
}
/* A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.
 * Return a deep copy of the list.
 */
/* _________
 * |       |
 * A-->B-->C-->D-->E
 *             |   |
 *             ----- 
 * original.next = copy;
 * ---------   -----
 * |       |   |   |
 * A   B   C   D   E
 * | / | / | / | / |
 * A'  B'  C'  D'  E'
 * copy.random = original.random.next; 
 * ---------   -----
 * |       |   |   |
 * A   B   C   D   E
 * | / | / | / | / |
 * A'  B'  C'  D'  E'
 * |       |   |   |
 * ---------   -----
 * original.next = original.next.next;
 * copy.next = copy.next.next;
 * ---------           --------
 * |       |           |       |
 * A-->B-->C-->D-->E   A'->B'->C'->D'->E'
 *             |   |               |   |
 *             -----               ----- 
 */
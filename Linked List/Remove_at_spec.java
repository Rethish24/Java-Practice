import java.util.*;


public class Remove_at_spec {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        int n = input.nextInt();
        for(int i = 0; i < n; i++){
            int x = input.nextInt();
            ll.add(x);
        }

		int size = n;
        int toRemove = input.nextInt();
        Solution s = new Solution();
        Solution.remove(ll, toRemove, size);
        Node curr = ll.head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}

 
class Node{
    int data;
    Node next = null;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head;
    void add(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node curr = head;
        while(curr.next != null)
            curr = curr.next;
        curr.next = new_node;
    }
}
 
class Solution {
    public  void remove(LinkedList ll, int toRemove, int size)
    {
        // write your code here
        int k=toRemove;
       // Node head=ll.head;
        Node prev = null;
        Node cur =ll.head;

        if(k==0)
        {
            Node h = ll.head.next;
            ll.head.next=null;
            ll.head=h;
            
        }
        else
        {
        while(k>0)
        {
            prev=cur;
            cur=cur.next;
            k--;
        }
        Node nn = cur.next;
        cur.next=null;
        prev.next=nn;
         }
    }
	


	public static void printLinkedList(LinkedList ll) {
		Node temp = ll.head;
		while(temp != null) {
			System.out.print(temp.data);
			temp = temp.next;
		}
	}
}

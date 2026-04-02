
import java.util.*;
import java.lang.*;

class Node{
    int data;
    Node next;
    Node(int key){
        data = key;
        next = null;
    }
}

class RearrangeLinkedList{
    static Node head;
    static Node temp;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            head = null;
            temp = null;
            addToTheLast(a1);
            
            for(int i = 1; i < n; i++){
                int data = sc.nextInt();
                addToTheLast(data);
            }
            Solution ans = new Solution();
            Node node = ans.rearrange(head);
            printList(node);
            System.out.println();
        }
    }
    
    public static void addToTheLast(int data){
        if(head == null){
			head = new Node(data);
			temp =head;
			return ;
		}
		else{
			Node new_node = new Node(data);
			temp.next = new_node;
			temp=temp.next;
			return;		
		}
    }
    
    public static void printList(Node node){
        while(node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}

class Solution{

    public static Node middle(Node head)
    {
        Node f=head;
        Node s=head;
        while(f!=null && f.next!=null && f.next.next!=null)
        {
            f=f.next.next;
            s=s.next;
        }
        return s;
    }
    public static Node rearrange(Node h)
    {
       //Write code here
       Node mid = middle(h);
       // break into twop linked lists 
       Node nh =mid.next;
       mid.next=null;
       //  reverse the 2 nd half of linked list 
       Node prev=null;
       Node cur=nh;
       while(cur!=null)
         { 
                 Node n = cur.next;
                 cur.next=prev;

                 prev =cur;
                 cur=n;
         } 
        nh = prev;
        Node c1=h;
        Node c2=nh;
        Node nn = new Node(-1);
        Node c =nn;
        while(c1!=null && c2!=null)
        {
            if(c1!=null)
            {
           c.next=c1;
           c1=c1.next;
           c=c.next;
            }
            
           c.next=c2;
           c2=c2.next;
           c=c.next;
            
        }
       c.next=((c1==null)?c2:c1);
       Node ah =nn.next;
       nn.next=null;
       return ah;
    }
}


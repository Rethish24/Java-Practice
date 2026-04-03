import java.io.*;
import java.util.*;
 
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head;
    void add(int data ){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node current = head;
        while(current.next !=null){
            current = current.next;
        }
        current.next = new_node;
    }
}

class Solution {
    static Node reverse(Node head)
    {
        Node prev =null;
        Node cur=head;
        while(cur!=null)
        {
            Node n=cur.next;
            cur.next=prev;

            prev=cur;
            cur=n;
        }
        return prev;
    }
    static Node getlast(Node head)
    {
        Node k =head;
        while(k.next!=null)
        {
            k=k.next;
        }
      return k;
    }
    static void unfold(Node head)
    {
     // Your code here
     Node d1= new Node(-1);
     Node d2= new Node(-1);
     Node c1=d1;
     Node c2=d2;
     Node cur=head;
     int count=1;
     while(cur!=null)
     {
        Node n =cur.next;
        cur.next=null;
        if(count%2!=0)
        {
        c1.next=cur;
        c1=c1.next;
        count++;
        }
        else
        {
        c2.next=cur;
        c2=c2.next;
        count++;
        }
        cur = n;
     }
     Node r1 =d1.next;
     Node r2 =d2.next;
     d1.next=null;
     d2.next=null;
     Node r1e =getlast(r1);
     r2=reverse(r2);
     r1e.next=r2;
     while(r1!=null)
     {
        System.out.print(r1.data+" ");
        r1=r1.next;
     }
    }
}
public class unfold {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList l1= new LinkedList();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        Solution Ob = new Solution();
        Ob.unfold(l1.head);
    }
}
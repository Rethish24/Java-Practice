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
 static Node merge(Node x, Node y)
 {
       // Write your code here}
       Node d = new Node(-1);
       Node c=d;
       while(x!=null && y!=null)
       {
        if(x.data<y.data)
        {
            c.next=x;
            x=x.next;
        }
        else
        {
            c.next=y;
            y=y.next;
        }
        c=c.next;

       }
       c.next=((x==null)?y:x);
      /*Node k =((x==null)?y:x);
      while(k!=null)
      {
        c.next=k;
        c=c.next;
        k=k.next;
      }*/
    Node temp=d.next;
    d.next=null;
    return temp;
 }
}

public class merge_two_sorted_ll{
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList l1= new LinkedList();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        int m = sc.nextInt();
        LinkedList l2 = new LinkedList();
        for(int i=0;i<m;i++){
            l2.add(sc.nextInt());
        }

        Solution Ob = new Solution();
        Node head = Ob.merge(l1.head, l2.head);
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
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
    public void partition(Node head, int x) 
    {
        // Your code here
        Node cur=head;
        Node d1= new Node(-1);
        Node d2= new Node(-1);
        Node c1=d1;
        Node c2=d2;
        while(cur!=null)
        {
            Node n =cur.next;
            cur.next=null;
            if(cur.data<x)
            {
                c1.next=cur;
                c1=c1.next;
            }
            else
            {
                c2.next=cur;
                c2=c2.next;
            }
            cur=n;
        }
        Node res1= d1.next;
        Node res2= d2.next;
        d1.next=null;
        d2.next=null;
        c1.next=res2;
        Node r = res1;
        while(r!=null)
        {
            System.out.print(r.data+" ");
            r=r.next;

        }
    }
}

public class partition {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList l1= new LinkedList();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        int x = sc.nextInt();
        Solution Ob = new Solution();
        Ob.partition(l1.head, x);
    }
}
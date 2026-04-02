import java.util.*;
import java.io.*;

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


    static Node insert(Node head, int n, int pos, int val) 
    {
        // Write your code here.
        Node prev = null;
        Node cur=head;
        Node k =new Node(val);
        if(pos==0)
        {
             k.next=cur;
             head=k;
             return head; 
        }
        else
        {
        while(pos>=1)
        {
            prev=cur;
            cur=cur.next;
            pos--;
        }        
        
        prev.next=k;
        k.next=cur;
        return head;
        }
    }


public class Insert_at_spec {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList list = new LinkedList();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int val = sc.nextInt();
        int pos = sc.nextInt();
        Node head = insert(list.head, n, pos, val);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}

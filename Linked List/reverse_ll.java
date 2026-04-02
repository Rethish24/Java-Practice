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
public class reverse_ll {
    public static void reverse(Node head)
    {
        // write code here
        Node cur=head;
        Node prev=null;
        Node h=head;
        while(cur!=null)
        {
            Node n =cur.next;
            cur.next=prev;

            prev=cur;
            cur=n;

        }
        while(prev!=null)
        {
            System.out.print(prev.data+" ");
            prev=prev.next;
        }

    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int n = input.nextInt();
        for(int i = 0; i < n; i++){
            int x = input.nextInt();
            list.add(x);
        }
        reverse(list.head);
        System.out.println("");
    }
}
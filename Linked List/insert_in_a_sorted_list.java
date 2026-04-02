import java.io.*;
import java.util.*;

class Node {

    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class insert_in_a_sorted_list {

    static void printList(Node node) {
        while (node != null) {
        System.out.print(node.data + " ");
        node = node.next;
        }
        System.out.println();
    }

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = new Node(sc.nextInt());
        Node tail = head;

        for (int i = 0; i < n - 1; i++) {
        tail.next = new Node(sc.nextInt());
        tail = tail.next;
        }

        int k = sc.nextInt();

        Solution g = new Solution();
        head = g.solve(head, k);

        printList(head);
    }
}

class Solution {

    Node solve(Node head, int key) 
    {
        // Add your code here.
        Node prev=null;
        Node cur=head;
        Node k = new Node(key);
        if(cur.data>key)
        {
            k.next=cur;
            head=k;
            return head;
        }
        else
        {
        while(cur!=null && cur.data<key)
        {
            if(key>cur.data )
            {
                
                prev=cur;
                cur=cur.next;
            }
        }
        
        Node temp=prev.next;
        prev.next=k;
        k.next=temp;
        return head; 
    }
    }
}

import java.util.*;

class Node {
    int val;
    Node next;

    Node(int d) {
        val = d;
        next = null;
    }
}

class LinkedList {
    Node head, tail;

    void push(Node new_node) {
        if (head == null && tail == null) {
            head = tail = new_node;
            return;
        }
        tail.next = new_node;
        tail = new_node;
    }

    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class Solution {
    public  Node rearrangeList(Node head) 
    {
        //Write code here
        Node d1= new Node(-1);
        Node d2= new Node(-1);
        Node c1=d1;
        Node c2=d2;
        Node cur=head;
        while(cur!=null)
        {
            Node n =cur.next;
            cur.next=null;
            if((cur.val)%2==0)
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
        Node r1=d1.next;
        Node r2=d2.next;
        d1.next=null;
        d2.next=null;
        c1.next=r2;
        return r1;
            
    }

}

public class evenoddpartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList llist = new LinkedList();
        int h1 = sc.nextInt();
        Node head = new Node(h1);
        llist.push(head);
        for (int i = 1; i < n; i++) {
            int data = sc.nextInt();
            llist.push(new Node(data));
        }
        //llist.printList(head);
        Solution Obj = new Solution();
        head = Obj.rearrangeList(head);
        llist.printList(head);
        sc.close();
    }
}
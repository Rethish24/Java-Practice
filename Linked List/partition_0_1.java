import java.util.*;

class Solution {
    static Node sort01(Node head)
    {
        // Write your code here
         Node d1= new Node(-1);
         Node d2= new Node(-1);
         Node c1=d1;
         Node c2=d2;
         Node cur =head;
     while(cur!=null)
     {
        Node n =cur.next;
        cur.next=null;
        if(cur.data==0)
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

class Node  {
    int data;
    Node next;

    public Node(int data)  {
        this.data = data;
    }
}

public class partition_0_1{
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      Node head = new Node(sc.nextInt());
        Node a = head;
        for(int i=1;i<n;i++) {
            Node temp = new Node(sc.nextInt());
            a.next = temp;
            a = temp;
        }
        Node ans = Solution.sort01(head);
        for(int i=0;i<n;i++) {
            if(i == n-1) {
                System.out.println(ans.data);
            }
            else {
                System.out.print(ans.data + " ");
            }
            ans = ans.next;
        }
    }
}
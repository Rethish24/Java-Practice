import java.util.*;


public class PalindromeLinkedList {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList llist= new LinkedList(); 
        int a1=sc.nextInt();
        Node head= new Node(a1);
        llist.addToTheLast(head);
        for (int i = 1; i < n; i++) 
        {
            int a = sc.nextInt(); 
            llist.addToTheLast(new Node(a));
        }
            
        Solution A = new Solution();
        A.checkLinkedListPalindrome(llist.head);
        
    }
}

class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    
class LinkedList
{
    Node head;  
    Node tail;
    public void addToTheLast(Node node) 
    {
      if (head == null) 
      {
       head = node;
       tail = node;
      } 
      else 
      {
       tail.next = node;
       tail = node;
      }
    }
      void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
    
}

class Solution
{
    static Node middle(Node head)
    {
        Node f=head;
        Node s=head;
        while(f!=null && f.next!=null &&f.next.next!=null)
        {
            f=f.next.next;
            s=s.next;
        }
        return s;
    }
    static void checkLinkedListPalindrome(Node head)
    {
        //Your code here

        //middle
        Node mid =middle(head);
        // new head of second part of list
        Node nh=mid.next;
        // breaki ng into two halfs
        mid.next=null;
        // making second half reverse
        Node prev=null;
        Node cur=nh;
        while(cur!=null)
        {
            Node n=cur.next;
            cur.next=prev;

            prev=cur;
            cur=n;
        }
        nh=prev;
        Node c1=head;
        Node c2=nh;
        String Result="YES";
        while(c1!=null && c2!=null)
        {
            if((c1.data)!=(c2.data))
            {
                Result="NO";
                break;
            }
            c1=c1.next;
            c2=c2.next;
        }
        System.out.println(Result);
    }
    
}
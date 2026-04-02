import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}

class CircularLinkedList2
{
    public static void makeLoop(Node head, Node tail, int x){
        if (x == 0) return;
        
        Node curr = head;
        for(int i=1; i<x; i++)
            curr = curr.next;
        
        tail.next = curr;
    }
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int num = sc.nextInt();
        Node head = new Node(num);
        Node tail = head;
        
        for(int i=0; i<n-1; i++)
        {
            num = sc.nextInt();
            tail.next = new Node(num);
            tail = tail.next;
        }
        
        int pos = sc.nextInt();
        makeLoop(head, tail, pos);
        
        Solution x = new Solution();
        Node y = x.detectLoop(head,pos); 
        if( y == null )
            System.out.println(0);
        else
            System.out.println(y.data);
    }
}

class Solution {
    public static Node detectLoop(Node head,int pos)
    {
        //write code here
        if(pos==0)
        {
          Node m = null;  
          return m;  
        }
        else{
        Node f=head;
        Node s=head;
        while(f!=null && f.next!=null)
        {
            f=f.next.next;
            s=s.next;
            if(f==s)
            {
                break;
            }
        }
        s=head;
        while(f!=s)
        {
            f=f.next;
            s=s.next;
        }
                        return s;

        }
    }
}
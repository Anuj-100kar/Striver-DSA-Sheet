import java.util.*;

public class Reverse_LL {
    class Node {
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node reverseLinkedList(Node head)
    {
        // Write your code here.
        Node curr=head;
        Node prev=null;

        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}

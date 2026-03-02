import java.util.*;

public class Find_Middle {
    class Node {
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
     public static Node findMiddle(Node head)
    {
        // Write your code here.
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}

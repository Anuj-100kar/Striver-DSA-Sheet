import java.util.*;

public class Search_LL {
    class Node {
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static int searchInLinkedList(Node head, int k)
    {
        // Write Your Code Here.

        Node node=head;
        while(node!=null){
            if(node.data==k)return 1;
            node=node.next;
        }
        return 0;
    }
}


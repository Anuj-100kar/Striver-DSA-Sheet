import java.util.* ;
import java.io.*; 
public class Deque {
    private LinkedList<Integer>dq;
    private int capacity;
    // Initialize your data structure.
    public Deque(int n) 
    {
        // Write your code here.
        dq=new LinkedList<>();
        this.capacity=n;
        
    }

    // Pushes 'X' in the front of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushFront(int x) 
    {
        if(isFull())return false;
        dq.addFirst(x);
        return true;
        
    }

    // Pushes 'X' in the back of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushRear(int x) 
    {
        if(isFull())return false;
        dq.addLast(x);
        return true;
    }

    // Pops an element from the front of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popFront() 
    {
        if(isEmpty())return -1;
        return dq.removeFirst();
    }

    // Pops an element from the back of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popRear() 
    {
        if(isEmpty())return -1;
        return dq.removeLast();
    }

    // Returns the first element of the deque. If the deque is empty, it returns -1.
    public int getFront() 
    {
        if(isEmpty())return -1;
        return dq.getFirst();
    }

    // Returns the last element of the deque. If the deque is empty, it returns -1.
    public int getRear() 
    {
        if(isEmpty())return -1;
        return dq.getLast();
    }

    // Returns true if the deque is empty. Otherwise returns false.
    public boolean isEmpty() 
    {
        return dq.isEmpty();
    }

    // Returns true if the deque is full. Otherwise returns false.
    public boolean isFull() 
    {
        return dq.size()==capacity;
    }
}

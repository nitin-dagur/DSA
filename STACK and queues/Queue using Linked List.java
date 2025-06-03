/*The structure of the node of the queue is
class QueueNode
{
    int data;
    QueueNode next;
    QueueNode(int a)
    {
        data = a;
        next = null;
    }
}*/

class MyQueue {
    QueueNode head, tail;

    // Function to push an element into the queue.
    void push(int a) {
        QueueNode temp = new QueueNode(a);
        
        if(head == null){
            head = temp;
            tail = temp;
        }else{
            tail.next = temp;
            tail = temp;
        }
        
        
        // Your code here
        
    }

    // Function to pop front element from the queue.
    int pop() {
        if(head == null) return -1;
        int x = head.data;
        head = head.next;
        if(head == null) tail = null;
        return x;
        
        // Your code here
    }
}

class MyStack {
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }
    
    StackNode head = null;
    int size = 0;

    // Function to push an integer into the stack.
    void push(int a) {
        StackNode temp = new StackNode(a);
        temp.next = head;
        head = temp;
        size++;
        // Add your code here
    }

    // Function to remove an item from top of the stack.
    int pop() {
        if(head == null) return -1;
        int x =  head.data;
        head= head.next;
        return x;
        // Add your code here
    }
}

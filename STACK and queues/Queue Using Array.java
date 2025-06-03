class MyQueue {
    int front, rear, size;
    int arr[] = new int[100005];

    MyQueue() {
        front = 0;
        rear = 0;
        size = 0;
    }

    // Function to push an element x in a queue.
    void push(int x) {
        if (rear >= arr.length) {
            return; // Queue is full
        }
        arr[rear] = x; // Insert at current rear
        rear++;
        size++;
    }

    // Function to pop an element from queue and return that element.
    int pop() {
        if (size == 0) return -1; // Queue is empty
        int result = arr[front]; // Element at front
        front++;
        size--;
        return result;
    }
}

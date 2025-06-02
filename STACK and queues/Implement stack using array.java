class MyStack {
    private int[] arr;
    private int idx;

    public MyStack() {
        arr = new int[1000];
        idx= 0;
    }
    

    public void push(int x) {
        if(idx == arr.length) return;
        arr[idx] = x;
        idx++;
        
        // Your Code
    }

    public int pop() {
        if(idx == 0 ) return -1;
        
        int top = arr[idx-1];
        arr[idx-1] = 0;
        idx--;
        return top;
        // Your Code
    }
}

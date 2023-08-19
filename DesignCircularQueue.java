class MyCircularQueue {
    int top = 0, bottom = 0, elements = 0, len = 0;
    int[] queue;
    public MyCircularQueue(int k) {
        queue = new int[k];
        len = k;
    }
    
    public boolean enQueue(int value) {
        if(elements == len)
            return false;
        
        queue[bottom] = value;
        bottom = (bottom + 1) % len;
        elements++;
        return true;
    }
    
    public boolean deQueue() {
        if(elements == 0)
            return false;
        top = (top + 1) % len;
        elements--;
        return true;
    }
    
    public int Front() {
        if(elements == 0)
            return -1;
        else {
            return queue[top];
        }
    }
    
    public int Rear() {
        if(elements == 0)
            return -1;
        else {
            return queue[(bottom - 1 + len) % len]; //bottom - 1 because bottom is incremented in enQueue. + len to wrap around if bottom is 0.
        }
    }
    
    public boolean isEmpty() {
        return elements == 0;
    }
    
    public boolean isFull() {
        return elements == len;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */

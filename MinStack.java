class MinStack {
    Stack<Integer> sk;
    ArrayList<Integer> al;
    public MinStack() {
        sk = new Stack<>();
        al = new ArrayList<>();
    }
    
    public void push(int val) {
        sk.push(val);
        al.add(val);
    }
    
    public void pop() {
        int val = sk.pop();
        System.out.println(new Integer(val));
        al.remove(new Integer(val));
    }
    
    public int top() {
        return sk.peek();
    }
    
    public int getMin() {
        Collections.sort(al);
        return al.get(0);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

public int removeMax(Stack<Integer> s) {
    if (s.size() == 0) {
        throw new IllegalArgumentException();
    }
    
    Queue<Integer> q = new LinkedList<Integer>();
    int max = 0;
    
    while (!s.isEmpty()) {
        int curr = s.pop();
        if (curr > max) {
            max = curr;
        }
        q.add(curr);
    }
    
    while (!q.isEmpty()) { 
        int num = q.remove();
        if (num != max) {
            s.push(num);
        }
    }
    
    while (!s.isEmpty()) {
        q.add(s.pop());
    }
    
    while (!q.isEmpty()) {
        s.push(q.remove());
    }
    
    return max;
}

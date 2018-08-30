public boolean isConsecutive(Stack<Integer> s) {
    boolean yes = true;
    Queue<Integer> q = new LinkedList<Integer>();
    int prev = s.pop();
    q.add(prev);
    while (!s.isEmpty()) {
        int current = s.pop();
        if (prev - current != 1) {
            yes = false;
        }
        q.add(current);
        prev = current;
    }
    
    while (!q.isEmpty()) {
        s.push(q.remove());
    }
    
    while (!s.isEmpty()) {
        q.add(s.pop());
    }
    
    while(!q.isEmpty()) {
        s.push(q.remove());
    }
    return yes;
}

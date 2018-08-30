public int removeMin(Stack<Integer> s) {
    Queue<Integer> q = new LinkedList<Integer>();
    int smallest = s.pop();
    q.add(smallest);
    while (!s.isEmpty()) {
        int current = s.pop();
        if (current < smallest) {
            smallest = current;
        }
        q.add(current);
    }
    
    while (!q.isEmpty()) {
        int current = q.remove();
        if (current != smallest) {
            s.push(current);
        }
    }
    
    while (!s.isEmpty()) {
        q.add(s.pop());
    }
    
    while (!q.isEmpty()) {
        s.push(q.remove());
    }
    
    return smallest;
}

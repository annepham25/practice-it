public void mirror(Stack<Integer> s) {
    Queue<Integer> q = new LinkedList<Integer>();
    
    while (!s.isEmpty()) {
        q.add(s.pop());
    }
    while (!q.isEmpty()) {
        s.push(q.remove());
    }
    while (!s.isEmpty()) {
        q.add(s.pop());
    }
    int size = q.size();
    for (int i = 0; i < size; i++) {
        int num = q.remove();
        s.push(num);
        q.add(num);
    }
    while (!s.isEmpty()) {
        q.add(s.pop());
    }
    
    while (!q.isEmpty()) {
        s.push(q.remove());
    }
}

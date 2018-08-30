public int removeRange(int min, int max) {
    if (max < min) {
        throw new IllegalArgumentException();
    }
    int numRemoved = 0;
    ListNode prev = null;
    ListNode current = front;
    while (current != null) {
        if (current.data >= min && current.data <= max) {
            numRemoved++;
            if (prev == null) {
                front = front.next;
            } else {
                prev.next = current.next;
            }
            current = current.next;
        } else {
            prev = current;
            current = prev.next;
        }
    }
    return numRemoved;
    
}

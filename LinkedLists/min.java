public int min() {
    ListNode current = front;
    if (current == null) {
        throw new NoSuchElementException();
    }
    int minValue = current.data;
    while (current.next != null) {
        if (current.data < minValue) {
            minValue = current.data;
        }
        current = current.next;
    }
    if (current.data > minValue) {
        return minValue;
    }
    return current.data;
    
}

public int minGap() {
    if (front == null || front.next == null) {
        return 0; 
    }
    ListNode current = front;
    int smallest = 0;
    if (current.next != null) {
        smallest = current.next.data - current.data;
        current = current.next;
    }
    while (current.next != null) {
        if (current.next.data - current.data < smallest) {
            smallest = current.next.data - current.data;
        }
        current = current.next;
    }
    return smallest;
}

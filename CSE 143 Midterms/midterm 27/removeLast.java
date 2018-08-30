public int removeLast() {
    if (front == null) {
        throw new NoSuchElementException();
    }
    int value = 0;
    if (front.next == null) {
        value = front.data;
        front = null;
    } else {
        ListNode current = front;
        while (current.next.next != null) {
            current = current.next;
        }
        value = current.next.data;
        current.next = null;
    }
    return value;
}

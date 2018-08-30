public int deleteBack() {
    ListNode current = front;
    if (current == null) {
        throw new NoSuchElementException();
    }
    int lastValue = current.data;
    if (current.next == null) {
        front = null;
        return lastValue;
    }
    while (current.next.next != null) {
        current = current.next;
    }
    lastValue = current.next.data;
    current.next = null;
    return lastValue;
}

public void transferFrom(LinkedIntList other) {
    ListNode current = front;
    if (current == null) {
        front = other.front;
    } else if (current != null) {
        while (current.next != null) {
            current = current.next;
        }
        current.next = other.front;
    }
    other.front = null;
}

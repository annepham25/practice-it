public boolean isSorted() {
    ListNode current = front;
    if (current == null) {
        return true;
    }
    while (current.next != null) {
        if (current.data > current.next.data) {
            return false;
        }
        current = current.next;
    }
    return true;
}

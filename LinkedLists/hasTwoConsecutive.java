public boolean hasTwoConsecutive() {
    ListNode current = front;
    if (current != null) {
        while (current.next != null) {
            if (current.next.data - current.data == 1) {
                return true;
            }
            current = current.next;
        }
    }
    return false;
}

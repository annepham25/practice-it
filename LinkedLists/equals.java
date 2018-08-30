public boolean equals2(LinkedIntList other) {
    ListNode current = front;
    ListNode second = other.front;
    if (current == null && second == null) {
        return true;
    }
    while (current.next != null || second.next != null) {
        if (second.next == null) {
            return false;
        }
        if (current.next == null) {
            return false;
        }
        if (current.data != second.data) {
            return false;
        }
        current = current.next;
        second = second.next;
    }
    return true;
}

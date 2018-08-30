public String toString2() {
    ListNode current = front;
    String list = "[";
    if (current != null) {
        while (current.next != null) {
            list += current.data + ", ";
            current = current.next;
        }
        return list + current.data + "]";
    }
    return list + "]";
}

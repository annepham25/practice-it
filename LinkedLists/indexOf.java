public int indexOf(int value) {
    int index = 0;
    ListNode current = front;
    if (current != null) {
        while (current.next != null) {
            if (current.data == value) {
                return index;
            }
            current = current.next;
            index++;
        }
        if (current.data == value) {
            return index;
        }
    }
    return -1;
}

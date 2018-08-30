public int lastIndexOf(int value) {
    ListNode current = front;
    int currIndex = 0;
    int indexOf = -1;
    if (current != null) {
        if (current.data == value) {
            indexOf = currIndex;
        }
        while (current.next != null) {
            if (current.data == value) {
                indexOf = currIndex;
            }
            current = current.next;
            currIndex++;
        }
    }
    return indexOf;
}

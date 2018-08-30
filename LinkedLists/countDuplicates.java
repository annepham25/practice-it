public int countDuplicates() {
    ListNode current = front;
    int duplicates = 0;
    if (current != null) {
        int num = current.data;
        while (current.next != null) {
            if (current.next.data == num) {
                duplicates++;
            } else {
                num = current.next.data;
            }
            current = current.next;
        }
    }
    return duplicates;
}

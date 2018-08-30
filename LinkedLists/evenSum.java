public int evenSum() {
    ListNode current = front;
    int sum = 0;
    if (current != null) {
        int index = 0;
        if (current.next == null) {
            sum += current.data;
        } else {
            while (current.next != null) {
            if (index % 2 == 0) {
                sum += current.data;
            }
            index++;
            current = current.next;
            }
        }
    }
    return sum;
}

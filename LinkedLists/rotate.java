public void rotate() {
    if (front != null && front.next != null) {
        ListNode endValue = front;
        front = front.next;
        endValue.next = null;
        ListNode current = front;
        while (current.next != null) {
            current = current.next;
        }
        current.next = endValue;
    }
}

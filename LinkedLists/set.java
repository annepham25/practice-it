public void set(int index, int value) {
    ListNode node = front;
    for (int i = 0; i < index; i++) {
        node = node.next;
    }
    node.data = value;
}

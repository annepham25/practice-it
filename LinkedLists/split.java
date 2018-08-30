public void split() {
    ListNode tempFront = front;
    ListNode temp = front;
    ListNode prev = null;
    
    while (temp != null) {
        if (temp.data < 0 && prev != null) {
            ListNode foundNeg = temp;
            temp = temp.next;
            prev.next = temp;
            front = foundNeg;
            foundNeg.next = tempFront;
            tempFront = front;
        } else {
            prev = temp;
            temp = temp.next;
        }
    }
}

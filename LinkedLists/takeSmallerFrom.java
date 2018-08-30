public void takeSmallerFrom(LinkedIntList other) {
    ListNode list1 = front;
    ListNode list2 = other.front;
    if (list1 != null && list2 != null) {
        while (list1.next != null && list2.next != null) {
            int num1 = list1.data;
            int num2 = list2.data;
            if (num1 > num2) {
                list1.data = num2;
                list2.data = num1;
            }
            list1 = list1.next;
            list2 = list2.next;
        }
        int num1 = list1.data;
        int num2 = list2.data;
        if (num1 > num2) {
            list1.data = num2;
            list2.data = num1;
        }
    }
}

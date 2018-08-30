public void removeFront(int n) {
    if (n < 0 || n > size) {
        throw new IllegalArgumentException();
    }
    int index = 0;
    for (int i = n; i < size; i++) {
        elementData[index] = elementData[i];
        index++;
    }
    size -= n;
}

public void mirror() {
    int last = 2 * size - 1;
    for (int i = 0; i < size; i++) {
        elementData[last - i] = elementData[i];
    }
    size *= 2;
}

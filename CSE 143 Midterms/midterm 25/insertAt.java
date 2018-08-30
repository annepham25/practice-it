public void insertAt(int index, int n, int value) {
    if (index <0 || index > size || n < 0) {
        throw new IllegalArgumentException();
    }
    if (index == 0) {
        int position = size;
        for (int i = size - 1; i >= 0; i--) {
            elementData[position] = elementData[i];
            position--;
        }
        for (int i = 0; i < n; i++) {
            elementData[i] = value;
        }
    } else {
        for (int i = index; i < index + n; i++) {
            elementData[i + n] = elementData[i];
            elementData[i] = value;
        }
    }
    size += n;

}

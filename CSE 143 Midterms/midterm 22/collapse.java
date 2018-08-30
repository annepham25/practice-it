public void collapse() {
    int index = 0;
    for (int i = 0; i < size; i += 2) {
        elementData[index] = elementData[i] + elementData[i + 1];
        index++;
    }
    if (size % 2 == 0) {
        size /= 2;
    } else {
        size = size / 2 + 1;
    }
}

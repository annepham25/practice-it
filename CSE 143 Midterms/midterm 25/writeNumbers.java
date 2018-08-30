public void writeNumbers(int num) {
    if (num < 1) {
        throw new IllegalArgumentException();
    }
    if (num == 1) {
        System.out.print(num);
    } else if (num % 2 == 1) {
        System.out.print(num + ", ");
        writeNumbers(num - 1);
    } else {
        writeNumbers(num - 1);
        System.out.print(", " + num);
    }
}

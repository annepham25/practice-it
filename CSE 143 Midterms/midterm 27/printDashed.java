public void printDashed(int num) {
    if (num == 0) {
        System.out.print(num);
    } else if (num < 0 && num * -1 / 10 == 0) {
        System.out.print(num);
    } else if (num > 0 && num / 10 == 0) {
        System.out.print(num);
    } else {
        printDashed(num / 10);
        if (num < 0) {
            System.out.print(num % 10);
        } else {
            System.out.print("-" + num % 10);
        }
    }
}

public static void threeHeads() {
    Random r = new Random();
    int count = 0;
    int num = r.nextInt(2);
    if (num == 0) {
        System.out.print("H");
        count ++;
    }
    else {
        System.out.print("T");
    }
    while (count != 3) {
        num = r.nextInt(2);
        if (num == 0) {
        System.out.print(" H");
        count ++;
        }
        else {
            System.out.print(" T");
            count = 0;
        }
    }
    System.out.println();
    System.out.println("Three heads in a row!");
}

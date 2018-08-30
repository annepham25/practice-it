public static int consecutiveDigits(int n) {
    int count = 0;
    int maxCount = 1;
    int num1 = n % 10;
    int num2 = 0;
    
    while (n != 0) {
        if (n % 10 == (n / 10) % 10) { 
            count++;
        }
        else {
            count ++;
            if (count > maxCount) {
                maxCount = count;
            }
            count = 0;
        }
        n = n / 10;
    }
    return maxCount;
}

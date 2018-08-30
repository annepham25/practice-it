public boolean isReverse(String str1, String str2) {
    if (str1.length() != str2.length()) {
        return false;
    } else if (str1.length() == 0 || str1.length() == 1) {
        return true;
    } else if (str1.substring(str1.length() - 1).equalsIgnoreCase(str2.substring(0, 1))) {
        return isReverse(str1.substring(0, str1.length() - 1),str2.substring(1));
    } else {
        return false;
    }
}

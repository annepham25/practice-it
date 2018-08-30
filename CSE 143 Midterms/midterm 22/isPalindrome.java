public boolean isPalindrome(String str) {
    if (str.length() == 0 || str.length() == 1) {
        return true;
    } else if (str.charAt(0) == str.charAt(str.length() - 1)) {
        return isPalindrome(str.substring(1, str.length() - 1));
    } else {
        return false;
    }
       
}

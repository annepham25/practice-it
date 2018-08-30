public String replace(String s, char target, char replacement) { 
    if (s.length() == 0) {
        return ""; 
    } else { 
        String rest = replace(s.substring(1), target, replacement); 
        if (s.charAt(0) == target) { 
            return replacement + rest; 
        } else {
            return s.charAt(0) + rest; 
		}
} 
}

class Solution {
    public boolean isPalindrome(String s) {  
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder(s);
        sb2.reverse();  
        if (sb.toString().equals(sb2.toString())) {
            return true;
        }
        else {
            return false;
        }
    }
}
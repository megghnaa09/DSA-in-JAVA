class Solution {
    public int lengthOfLastWord(String s) {
        String[] word= s.trim().split(" ");
        int count=0;
        for(String words:word){
            count=words.length();
        }
        return count;
    }
}
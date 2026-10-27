class Solution {
    public int lengthOfLastWord(String str){ 
       String s = str.trim();
        // System.out.println(s);
        if(s.length() == 1);
        int count=0;
        int i = s.length()-1;  
        while(i>=0 && s.charAt(i) != ' '){
            count++;
            i--;
        }
        return count;   
} 
}
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<word.length(); i++){
            sb.append(word.charAt(i));
        }
        int count=0;
        for(String val:patterns){
            if(sb.toString().contains(val)){
                count++;
            }
        }
        return count;     
    }
}
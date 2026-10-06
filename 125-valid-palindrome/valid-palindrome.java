import java.util.ArrayList;

class Solution {
    public boolean isPalindrome(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if( 'A'<=ch && ch<='Z' || 'a'<=ch && ch<='z' || '0'<=ch && ch<='9')
            {
                list.add(Character.toLowerCase(ch));
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(char ch: list){
            sb.append(ch);
        }

        String m = sb.toString();
        // System.out.println(m);
        // String rev = new 
        String rev = new StringBuilder(m).reverse().toString();
        return m.equals(rev);
    }

}
























        // ArrayList<Character> list = new ArrayList<>();

        // // Valid characters store karo
        // for(int i = 0; i < s.length(); i++) {

        //     char ch = s.charAt(i);

        //     if((ch >= 'a' && ch <= 'z') ||
        //        (ch >= 'A' && ch <= 'Z') ||
        //        (ch >= '0' && ch <= '9')) {

        //         list.add(Character.toLowerCase(ch));
        //     }
        // }

        // // ArrayList -> String
        // StringBuilder sb = new StringBuilder();

        // for(char ch : list) {
        //     sb.append(ch);
        // }

        // String m = sb.toString();

        // // Reverse
        // String rev = new StringBuilder(m).reverse().toString();

        // // Compare
        // return m.equals(rev);
    // }
// }